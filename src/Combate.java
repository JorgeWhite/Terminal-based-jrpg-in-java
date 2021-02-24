import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase para manejar los combates dentro del juego.
 */
public class Combate {
    Personaje personaje;
    ArrayList<Enemigo> listaEnemigosVivos;
    ArrayList<Enemigo> listaEnemigos;
    int turnoActual;
    Boolean usuarioEligioArma;
    int eleccionHechizo;
    Consumible itemElegido;
    Hechizos hechizoElegido;
    int turnosEnEstado;
    int indItemElegido;

    /**
     * Constructor de la clase, inicializa un combate.
     */
    public Combate(Personaje personaje, ArrayList<Enemigo> listaEnemigos){
        this.personaje = personaje;
        this.listaEnemigos = listaEnemigos;
        this.listaEnemigosVivos = (ArrayList<Enemigo>) listaEnemigos.clone();
        this.turnoActual = 1;
        this.turnosEnEstado = 0;
    }

    /**
     * Metodo que lleva a cabo la logica de un turno dentro de un combate.
     */
    public void hacerTurno(){
        System.out.println(personaje.getNombre() + ", estas en una pelea con los siguientes enemigos: \n");
        for (Enemigo enemigo : listaEnemigosVivos){
            System.out.println(enemigo.getNombre() + " HP: " + enemigo.getHp());
        }

        // AL empezar una cualquier turno, el primero en elegir una accion siempre es el personaje del usuario.
        // Se muestra el menu inicial.
        menuInicial();

        // Se revisa si alguno de los ataques del usuario mato a un enemigo, en cuyo caso se elimina de la lista de enemigos vivos.
        for (Enemigo enemigo : listaEnemigos){
            if (enemigo.getEstado() instanceof Muerto){
                listaEnemigosVivos.remove(enemigo);
            }
        }

        // Todos los enemigos atacan.
        for (Enemigo enemigo : listaEnemigosVivos){
            enemigo.atacarPersonaje(enemigo.getAtaque(), personaje);
        }

        // Se aplican los efectos de los estados.
        for (Enemigo enemigo : listaEnemigos) {
            if (enemigo.getEstado() instanceof Quemado) {
                if (((Quemado) enemigo.getEstado()).getTurnosEnEstado() < 2) {
                    enemigo.getEstado().quemarEnemigo();
                } else {
                    enemigo.getEstado().quemarEnemigo();
                    System.out.println(enemigo.getNombre() + " ha salido del estado quemado.");
                    enemigo.getEstado().enemigoNormal();
                }
            } else if (enemigo.getEstado() instanceof Congelado) {
                if (((Congelado) enemigo.getEstado()).getTurnosEnEstado() < 2) {
                    enemigo.getEstado().congelarEnemigo();
                } else {
                    enemigo.getEstado().congelarEnemigo();
                    System.out.println(enemigo.getNombre() + " ha salido del estado congelado.");
                    enemigo.getEstado().enemigoNormal();
                }
            } else if (enemigo.getEstado() instanceof Envenenado) {
                if (((Envenenado) enemigo.getEstado()).getTurnosEnEstado() < 2) {
                    enemigo.getEstado().envenenarEnemigo();
                } else {
                    enemigo.getEstado().envenenarEnemigo();
                    System.out.println(enemigo.getNombre() + " ha salido del estado envenenado.");
                    enemigo.getEstado().enemigoNormal();
                }
            }
        }

        // Se revisa si alguno de los efectos de estado mato a un enemigo, en cuyo caso se elimina de la lista de enemigos vivos.
        for (Enemigo enemigo : listaEnemigos){
            if (enemigo.getEstado() instanceof Muerto){
                listaEnemigosVivos.remove(enemigo);
            }
        }
        // Se aplican los efectos de estados al personaje.
        // Cada estado dura tres turnos.

        if (personaje.getEstado() instanceof Quemado){
            if (((Quemado) personaje.getEstado()).getTurnosEnEstado() < 2){
                personaje.getEstado().quemarPersonaje();
            } else {
                personaje.getEstado().quemarPersonaje();
                System.out.println(personaje.getNombre() + " ha salido del estado quemado.");
                personaje.getEstado().personajeNormal();
            }
        } else if(personaje.getEstado() instanceof Congelado){
            if (((Congelado) personaje.getEstado()).getTurnosEnEstado() < 2){
                personaje.getEstado().congelarPersonaje();
            } else {
                personaje.getEstado().congelarPersonaje();
                System.out.println(personaje.getNombre() + " ha salido del estado congelado.");
                personaje.getEstado().personajeNormal();
            }

        } else if (personaje.getEstado() instanceof Envenenado){
            if (((Envenenado) personaje.getEstado()).getTurnosEnEstado() < 2){
                personaje.getEstado().envenenarPersonaje();
            } else {
                personaje.getEstado().envenenarPersonaje();
                System.out.println(personaje.getNombre() + " ha salido del estado envenenado.");
                personaje.getEstado().personajeNormal();
            }
        }
        // Se pasa el turno.
        System.out.println("Termina el turno " + turnoActual);
        turnoActual += 1;
    }

    /**
     * Metodo para crear el menu inicial de un turno en un combate.
     */
    public void menuInicial(){
        System.out.println("¿Que quieres hacer?");
        System.out.println("1.- Atacar.");
        System.out.println("2.- Abrir inventario.");

        int opcionMenu1;
        Scanner scanner = new Scanner(System.in);
        String usuarioMenu1 = scanner.nextLine();
        opcionMenu1 = Integer.parseInt(usuarioMenu1);
        switch (opcionMenu1) {
            case 1:
                menuAtacar();
                break;
            case 2:
                menuInventario();
                break;
        }
    }

    /**
     * Creacion del menu que muestra las opciones para atacar.
     */
    public void menuAtacar(){
        System.out.println("¿Con que te gustaria atacar?");
        System.out.println("1.- Arma.");
        System.out.println("2.- Hechizo.");
        System.out.println("3.- Regresar.");

        int opcionMenuAtacar;
        Scanner scanner = new Scanner(System.in);
        String usuarioMenuAtacar = scanner.nextLine();
        opcionMenuAtacar = Integer.parseInt(usuarioMenuAtacar);
        switch (opcionMenuAtacar) {
            case 1:
                usuarioEligioArma = true;
                menuListaEnemigos();
                break;
            case 2:
                usuarioEligioArma = false;
                menuHechizos();
                break;
            case 3:
                menuInicial();
        }
    }

    /**
     * Metodo para la creacion del menu que muestra los enemigos vivos en un combate.
     */
    public void menuListaEnemigos() {
        System.out.println("Elige el enemigo que quieras atacar:");
        int num_enemigo = 0;
        for (Enemigo enemigo : listaEnemigosVivos) {
            System.out.println(num_enemigo + ".- " + enemigo.getNombre());
            num_enemigo += 1;
        }
        System.out.println(num_enemigo + " .- Regresar.");
        int opcionMenuEnemigo;
        Scanner scanner = new Scanner(System.in);
        String usuarioMenuEnemigo = scanner.nextLine();
        opcionMenuEnemigo = Integer.parseInt(usuarioMenuEnemigo);

        if (opcionMenuEnemigo == num_enemigo){
            menuAtacar();
        } else {
            if (usuarioEligioArma){
                personaje.Atacar_Arma(listaEnemigosVivos.get(opcionMenuEnemigo));
            } else {
                personaje.UsarMagia(listaEnemigosVivos.get(opcionMenuEnemigo), hechizoElegido);
            }
        }
    }

    /**
     * Metodo para crear el menu que muestra los hechizos disponibles para usar.
     */
    public void menuHechizos(){
        System.out.println("Elige el hechizo con el que quieres atacas:\n");
        int num_hechizo = 0;
        for (int i = 0; i < personaje.getHechizos().length ; i++){
            if (personaje.getHechizos()[i] != null){
                System.out.println(i + ".- " + personaje.getHechizos()[i].getTipo());
                num_hechizo += 1;
            }
        }
        System.out.println(num_hechizo + ".- Regresar.");
        int opcionMenuHechizos;
        Scanner scanner = new Scanner(System.in);
        String usuarioMenuHechizos = scanner.nextLine();
        opcionMenuHechizos = Integer.parseInt(usuarioMenuHechizos);
        if (opcionMenuHechizos == num_hechizo){
            menuAtacar();
        } else {
            hechizoElegido = personaje.getHechizos()[opcionMenuHechizos];
            menuListaEnemigos();
        }
    }

    /**
     * Metodo para crear el menu que muestra el inventario del personaje.
     */
    public void menuInventario(){
        System.out.println("Selecciona un item de tu inventario.\n");
        int num_item = 0;
        for (int i = 0; i < personaje.getInventario().length; i++){
            if (personaje.getInventario()[i] != null) {
                System.out.println(i + ".- " + personaje.getInventario()[i].getTipo());
                num_item += 1;
            }
        }
        System.out.println(num_item + " .- Regresar.");
        int opcionMenuInventario;
        Scanner scanner = new Scanner(System.in);
        String usuarioMenuInventario = scanner.nextLine();
        opcionMenuInventario = Integer.parseInt(usuarioMenuInventario);

        if (opcionMenuInventario == num_item){
            menuInicial();
        } else {
            itemElegido = personaje.getInventario()[opcionMenuInventario];
            indItemElegido = opcionMenuInventario;
            menuItem();
        }
    }

    /**
     * Metodo para crear el menu que muestra las opciones disponibles para un objeto consumible.
     */
    public void menuItem(){
        System.out.println("¿Que quieres hacer con este objeto?");
        System.out.println("1.- Usar.");
        System.out.println("2.- Ver descripcion");
        System.out.println("3.- Regresar.");

        int opcionMenuItem;
        Scanner scanner = new Scanner(System.in);
        String usuarioMenuItem = scanner.nextLine();
        opcionMenuItem = Integer.parseInt(usuarioMenuItem);
        switch (opcionMenuItem) {
            case 1:
                // Usar un objeto termina el turno del usuario.
                personaje.UsarObjeto(itemElegido);
                personaje.getInventario()[indItemElegido] = null;
                break;
            case 2:
                itemElegido.getDescripcion();
                menuInventario();
                break;
            case 3:
                menuInventario();
        }
    }

    /**
     * Metodo que se encarga de realizar turnos mientras haya enemigos vivos.
     */
    public void hacerCombate(){
        while(listaEnemigosVivos.size() != 0){
            hacerTurno();
        }
        System.out.println("Combate terminado.\n");

        // Se regresa al estado normal del personaje.
        personaje.setEstado(personaje.getNormal());

        // Se imprime el loot obtenido.
        int expObtenida = 0;
        int oroObtenido = 0;
        for (Enemigo enemigo : listaEnemigos){
            expObtenida += enemigo.getExp();
            oroObtenido += enemigo.getOro();
        }
        personaje.setExp(personaje.getExp() + expObtenida);
        personaje.setDinero(personaje.getDinero() + oroObtenido);
        System.out.println("Obtienes " + expObtenida + " puntos de experiencia.");
        System.out.println("obtienes " + oroObtenido + " de oro.");
        // Se revisa si el personaje subio de nivel.
        personaje.revisarLvlUp();

    }







}
