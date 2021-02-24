import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que se encarga de realizar las acciones principales del juego.
 */
public class JRPG {

    Personaje personaje;
    Mapa mapa;
    Tienda2 tienda;
    int direccionElegida;
    Consumible itemElegido;
    int indItemElegido;

    /**
     * Constructor de clase.
     * @param personaje el personaje del usuario.
     * @param mapa mapa en el que se llevara a cabo el juego.
     */
    public JRPG(Personaje personaje, Mapa mapa){
        this.mapa = mapa;
        this.personaje = personaje;
        mapa.setTienda(9, 8);
        mapa.setSalida(19, 19);
    }

    /**
     * Metodo para mostrar el menu de eleccion de clase.
     */
    public void menuClase(){
        System.out.println("A continuacion elige la clase a la que pertenecera tu personaje:\n");
        System.out.println("1.- Caballero");
        System.out.println("2.- Arquero");
        System.out.println("3.- Mago");
        System.out.println("4.- Ninja");

        int opcionMenuClase;
        Scanner scanner = new Scanner(System.in);
        String usuarioMenuClase = scanner.nextLine();
        opcionMenuClase = Integer.parseInt(usuarioMenuClase);
        switch (opcionMenuClase) {
            case 1:
                personaje = new Caballero(personaje.getNombre());
                break;
            case 2:
                personaje = new Arquero(personaje.getNombre());
                break;
            case 3:
                personaje = new Mago(personaje.getNombre());
                break;
            case 4:
                personaje = new Ninja(personaje.getNombre());
                break;
        }

    }

    /**
     * Metodo para mostrar el menu principal dentro del juego (fuera de una pelea).
     */
    public void menuPrincipal(){
        System.out.println("Que quieres hacer:\n");
        System.out.println("1.- Caminar");
        System.out.println("2.- Mirar alrededor");
        System.out.println("3.- Ver mi inventario");
        System.out.println("4.- Ver caracteristicas");
        System.out.println("5.- Ver mapa");

        int opcionMenuPrincipal;
        Scanner scanner = new Scanner(System.in);
        String usuarioMenuPrincipal = scanner.nextLine();
        opcionMenuPrincipal = Integer.parseInt(usuarioMenuPrincipal);
        switch (opcionMenuPrincipal) {
            case 1:
                menuCaminar();
            case 2:
                mirarAlrededor();
                menuPrincipal();
            case 3:
                System.out.println("Tienes " + personaje.getDinero() + " de oro.");
                menuInventario();
            case 4:
                System.out.println(personaje.descripcion());
                menuPrincipal();
            case 5:
                mapa.mostrarMapa();
                menuPrincipal();
            default:
                menuPrincipal();
        }
    }

    /**
     * Metodo para mostrar el menu que permite elegir al personaje en que direccion quiere caminar.
     */
    public void menuCaminar(){
        System.out.println("¿En que direccion quieres caminar?");
        System.out.println("1.- Norte");
        System.out.println("2.- Este");
        System.out.println("3.- Oeste");
        System.out.println("4.- Sur");
        System.out.println("5.- Regresar");

        int opcionMenuCaminar;
        Scanner scanner = new Scanner(System.in);
        String usuarioMenuCaminar = scanner.nextLine();
        opcionMenuCaminar = Integer.parseInt(usuarioMenuCaminar);
        switch (opcionMenuCaminar) {
            case 1:
                direccionElegida = 1; //   1   Norte
                menuPasosaMover();
                break;
            case 2:
                direccionElegida = 2; //   2   Este
                menuPasosaMover();
                break;
            case 3:
                direccionElegida = 3; //   3   Oeste
                menuPasosaMover();
                break;
            case 4:
                direccionElegida = 4; //   4   Sur
                menuPasosaMover();
                break;
            case 5:
                menuPrincipal();
        }

    }

    /**
     * Metodo para mostrar el menu que permite al usuario elegir la cantidad de pasos que desea moverse.
     * Mueve al personaje tomando en cuenta las dimensiones del mapa y las paredes.
     */
    public void menuPasosaMover(){
        System.out.println("¿Cuantos pasos quieres avanzar?");
        int opcionMenuPasos;
        Scanner scanner = new Scanner(System.in);
        String usuarioMenuPasos = scanner.nextLine();
        opcionMenuPasos = Integer.parseInt(usuarioMenuPasos);
        if (direccionElegida == 1){
            generarCombate();
            mapa.moverPosicionArriba(opcionMenuPasos);
            revisaEvento();
            menuPrincipal();
        } else if (direccionElegida == 2){
            generarCombate();
            mapa.moverPosicionDerecha(opcionMenuPasos);
            revisaEvento();
            menuPrincipal();
        } else if (direccionElegida == 3){
            generarCombate();
            mapa.moverPosicionIzquierda(opcionMenuPasos);
            revisaEvento();
            menuPrincipal();
        } else if (direccionElegida == 4) {
            generarCombate();
            mapa.moverPosicionAbajo(opcionMenuPasos);
            revisaEvento();
            menuPrincipal();
        } else {
            menuPrincipal();
        }

    }

    /**
     * Metodo para mostrar las casillas disponibles para moverse en cada direccion.
     */
    public void mirarAlrededor(){
        System.out.println("Tienes " + mapa.espaciosArriba() + " espacios disponibles al norte.");
        System.out.println("Tienes " + mapa.espaciosDerecha() + " espacios disponibles al este.");
        System.out.println("Tienes " + mapa.espaciosIzquierda() + " espacios disponibles al oeste.");
        System.out.println("Tienes " + mapa.espaciosAbajo() + " espacios disponibles al sur.");

        menuPrincipal();
    }

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
            menuPrincipal();
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
        System.out.println("2.- Ver descripcion.");
        System.out.println("3.- Regresar.");
        int opcionMenuItem;
        Scanner scanner = new Scanner(System.in);
        String usuarioMenuItem = scanner.nextLine();
        opcionMenuItem = Integer.parseInt(usuarioMenuItem);
        switch (opcionMenuItem) {
            case 1:
                personaje.UsarObjeto(itemElegido);
                personaje.getInventario()[indItemElegido] = null;
                menuPrincipal();
            case 2:
                System.out.println(itemElegido.getDescripcion());
                menuInventario();
            case 3:
                menuInventario();
        }
    }

    /**
     * Metodo que determina de manera aleatoria si se genera un combate.
     */
    public void generarCombate(){
        ArrayList<Enemigo> listaEnemigos = mapa.generarEnemigo(personaje.getLvl());
        if (listaEnemigos != null){
            Combate pelea = new Combate(personaje, listaEnemigos);
            pelea.hacerCombate();
        }
    }

    /**
     * Metodo para revisar si el personaje llego a la tienda o al final del laberinto.
     */
    public void revisaEvento(){
        if (mapa.llegoTienda()){
            tienda = new Tienda2(personaje);
            tienda.entrarTienda();
        }
        if (mapa.llegoSalida()){
            System.out.println("Felicidades " + personaje.getNombre() + ", has llegado al final del laberinto.");
            System.exit(0);
        }
    }

    /**
     * Metodo para iniciar el juego.
     */
    public void iniciarJuego(){
        menuClase();
        menuPrincipal();
    }





}
