import java.util.LinkedList;
import java.util.Scanner;
public class Tienda2 {
	Personaje personaje;
	FactoryProducer productora;
	LinkedList<Consumible> listConsumibles;
	LinkedList<Hechizos> listHechizos;
	LinkedList<Atuendos> listAtuendos;
	LinkedList<Armas> listArmas;
	AbstractFactory fabricaConsumibles;
	AbstractFactory fabricaHechizos;
	AbstractFactory fabricaAtuendos;
	AbstractFactory fabricaArmas;

	public Tienda2(Personaje personaje) {
		this.personaje = personaje;
		//Hacemos una instancia de una fabrica de fabricas.
		productora = new FactoryProducer();
		listConsumibles = new LinkedList<Consumible>();
		listHechizos = new LinkedList<Hechizos>();
		listAtuendos = new LinkedList<Atuendos>();
		listArmas = new LinkedList<Armas>();
		/*Iterador  LinkedList
				Iterator<Consumible> iterator=list.iterator();
				while(iterator.hasNext()){
					System.out.println(iterator.next());}*/

		//Fabricas para cada item de la tienda.
		fabricaConsumibles = productora.getFactory("Consumibles");
		fabricaHechizos = productora.getFactory("Hechizos");
		fabricaAtuendos = productora.getFactory("Atuendos");
		fabricaArmas = productora.getFactory("Armas");

		construyeArmas();
		construyeAtuendos();
		construyeConsumibles();
		construyeHechizos();
	}

	public void construyeConsumibles(){
		// Creamos instancias de todos los consumibles.
		Consumible elixir_Defensa = (Consumible) fabricaConsumibles.getItem("Elixir_defensa");
		elixir_Defensa.creaConsumible();
		listConsumibles.add(elixir_Defensa);

		Consumible elixir_Evasion = (Consumible) fabricaConsumibles.getItem("Elixir_evasion");
		elixir_Evasion.creaConsumible();
		listConsumibles.add(elixir_Evasion);

		Consumible elixir_Hp = (Consumible) fabricaConsumibles.getItem("Elixir_Hp");
		elixir_Hp.creaConsumible();
		listConsumibles.add(elixir_Hp);

		Consumible pocion_Defensa = (Consumible) fabricaConsumibles.getItem("Pocion_defensa");
		pocion_Defensa.creaConsumible();
		listConsumibles.add(pocion_Defensa);

		Consumible pocion_Evasion = (Consumible) fabricaConsumibles.getItem("Pocion_evasion");
		pocion_Evasion.creaConsumible();
		listConsumibles.add(pocion_Evasion);

		Consumible pocion_Hp = (Consumible) fabricaConsumibles.getItem("Pocion_Hp");
		pocion_Hp.creaConsumible();
		listConsumibles.add(pocion_Hp);
	}

	public void construyeHechizos(){
		//Se crean los hechizos
		Hechizos hechizo_Envenenar = (Hechizos) fabricaHechizos.getItem("Hechizo_envenenar");
		hechizo_Envenenar.creaHechizo();
		listHechizos.add(hechizo_Envenenar);

		Hechizos hechizo_Fuego = (Hechizos) fabricaHechizos.getItem("Hechizo_fuego");
		hechizo_Fuego.creaHechizo();
		listHechizos.add(hechizo_Fuego);

		Hechizos hechizo_Hielo = (Hechizos) fabricaHechizos.getItem("Hechizo_hielo");
		hechizo_Hielo.creaHechizo();
		listHechizos.add(hechizo_Hielo);
	}

	public void construyeAtuendos(){
		// Creamos instancias de todos los tipos de atuendos.
		Atuendos armadura_Cobre = (Atuendos) fabricaAtuendos.getItem("Armadura_cobre");
		armadura_Cobre.creaAtuendo();
		listAtuendos.add(armadura_Cobre);

		Atuendos armadura_Cuero = (Atuendos) fabricaAtuendos.getItem("Armadura_cuero");
		armadura_Cuero.creaAtuendo();
		listAtuendos.add(armadura_Cuero);

		Atuendos armadura_Dragon = (Atuendos) fabricaAtuendos.getItem("Armadura_dragon");
		armadura_Dragon.creaAtuendo();
		listAtuendos.add(armadura_Dragon);

		Atuendos armadura_Hierro = (Atuendos) fabricaAtuendos.getItem("Armadura_hierro");
		armadura_Hierro.creaAtuendo();
		listAtuendos.add(armadura_Hierro);

		Atuendos armadura_Laton = (Atuendos) fabricaAtuendos.getItem("Armadura_laton");
		armadura_Laton.creaAtuendo();
		listAtuendos.add(armadura_Laton);

		Atuendos armadura_Marfil = (Atuendos) fabricaAtuendos.getItem("Armadura_marfil");
		armadura_Marfil.creaAtuendo();
		listAtuendos.add(armadura_Marfil);

		Atuendos armadura_Petrea = (Atuendos) fabricaAtuendos.getItem("Armadura_petrea");
		armadura_Petrea.creaAtuendo();
		listAtuendos.add(armadura_Petrea);

		Atuendos tunica_China = (Atuendos) fabricaAtuendos.getItem("Tunica_china");
		tunica_China.creaAtuendo();
		listAtuendos.add(tunica_China);

		Atuendos tunica_Lobo = (Atuendos) fabricaAtuendos.getItem("Tunica_lobo");
		tunica_Lobo.creaAtuendo();
		listAtuendos.add(tunica_Lobo);

		Atuendos tunica_Seda = (Atuendos) fabricaAtuendos.getItem("Tunica_seda");
		tunica_Seda.creaAtuendo();
		listAtuendos.add(tunica_Seda);

		Atuendos tunica_Zorro = (Atuendos) fabricaAtuendos.getItem("Tunica_zorro");
		tunica_Zorro.creaAtuendo();
		listAtuendos.add(tunica_Zorro);
	}

	public void construyeArmas(){
		// Creamos una instancia de todos los tipos de armas.
		Armas arco_Marfil = (Armas) fabricaArmas.getItem("Arco_marfil");
		arco_Marfil.creaArmas();
		listArmas.add(arco_Marfil);

		Armas ballesta_Acero = (Armas) fabricaArmas.getItem("Ballesta_acero");
		ballesta_Acero.creaArmas();
		listArmas.add(ballesta_Acero);

		Armas baston_Agua = (Armas) fabricaArmas.getItem("Baston_agua");
		baston_Agua.creaArmas();
		listArmas.add(baston_Agua);

		Armas baston_Aire = (Armas) fabricaArmas.getItem("Baston_Aire");
		baston_Aire.creaArmas();
		listArmas.add(baston_Aire);

		Armas baston_Madera = (Armas) fabricaArmas.getItem("Baston_madera");
		baston_Madera.creaArmas();
		listArmas.add(baston_Madera);

		Armas baston_Tierra = (Armas) fabricaArmas.getItem("Baston_tierra");
		baston_Tierra.creaArmas();
		listArmas.add(baston_Tierra);

		Armas espada_Arruinada = (Armas) fabricaArmas.getItem("Espada_Arruinada");
		espada_Arruinada.creaArmas();
		listArmas.add(espada_Arruinada);

		Armas espada_Devoradora = (Armas) fabricaArmas.getItem("Espada_devoradora_Sangre");
		espada_Devoradora.creaArmas();
		listArmas.add(espada_Devoradora);

		Armas espada_Madera = (Armas) fabricaArmas.getItem("Espada_madera");
		espada_Madera.creaArmas();
		listArmas.add(espada_Madera);

		Armas espada_Marfil = (Armas) fabricaArmas.getItem("Espada_marfil");
		espada_Marfil.creaArmas();
		listArmas.add(espada_Marfil);

		Armas kusurigama = (Armas) fabricaArmas.getItem("Kusurigama");
		kusurigama.creaArmas();
		listArmas.add(kusurigama);

		Armas naginata = (Armas) fabricaArmas.getItem("Naginata");
		naginata.creaArmas();
		listArmas.add(naginata);

		Armas nunchaku_Madera = (Armas) fabricaArmas.getItem("Nunchaku_madera");
		nunchaku_Madera.creaArmas();
		listArmas.add(nunchaku_Madera);

		Armas pistola_OldWest = (Armas) fabricaArmas.getItem("Pistola_oldWest");
		pistola_OldWest.creaArmas();
		listArmas.add(pistola_OldWest);

		Armas resortera = (Armas) fabricaArmas.getItem("Resortera");
		resortera.creaArmas();
		listArmas.add(resortera);

		Armas tetsubo_Oni = (Armas) fabricaArmas.getItem("Tetsubo_oni");
		tetsubo_Oni.creaArmas();
		listArmas.add(tetsubo_Oni);
	}

	/**
	 * Metodo para mostrar el menu principal.
	 */
	public void menuPrincipal() {
		System.out.println("En esta tienda tenemos consumibles,atuendos, hechizos y armas, todos a un gran precio. Por favor ingresa el numero de la opcion a seleccionar.\n" +
				"1.- Comprar algo.\n" +
				"2.- Salir de la tienda\n");
		Scanner sc = new Scanner(System.in);
		int opcionMenuPrincipal;
		String personajeEleccion = sc.nextLine();
		opcionMenuPrincipal = Integer.parseInt(personajeEleccion);
		if (opcionMenuPrincipal == 1) {
			menuCategorias();
		} else if (opcionMenuPrincipal == 2) {
			System.out.println("Gracias por visitar nuestra tienda, esperamos que regreses pronto.\n");
		}
	}

	/**
	 * Metodo para mostrar las categorias de la tienda.
	 */
	public void menuCategorias(){
		System.out.println("Elige una categoria para comprar.\n" +
				"1.- Consumibles.\n" +
				"2.- Hechizos.\n" +
				"3.- Atuendos.\n" +
				"4.- Armas.\n" +
				"5.- Regresar.");
		Scanner scanner = new Scanner(System.in);
		int opcionCategoria;
		String opcionCategoriaUsuario = scanner.nextLine();
		opcionCategoria = Integer.parseInt(opcionCategoriaUsuario);
		switch (opcionCategoria){
			case 1:
				menuConsumibles();
				break;
			case 2:
				menuHechizos();
				break;
			case 3:
				menuAtuendos();
				break;
			case 4:
				menuArmas();
				break;
			case 5:
				menuPrincipal();
				break;
		}
	}

	/**
	 * Metodo para mostrar los objetos consumibles.
	 */
	public void menuConsumibles(){
		System.out.println("Elige el objeto que quieres comprar.\n");
		int numConsumibles = 0;
		for (Consumible consumible : listConsumibles){
			System.out.println(numConsumibles + ".- " + consumible.getTipo() + "   $" + consumible.getPrecio());
			numConsumibles += 1;
		}
		System.out.println(numConsumibles + ".- Regresar.");
		int opcionMenuConsumibles;
		Scanner scanner = new Scanner(System.in);
		String usuarioMenuConsumibles = scanner.nextLine();
		opcionMenuConsumibles = Integer.parseInt(usuarioMenuConsumibles);

		if (opcionMenuConsumibles == numConsumibles){
			menuPrincipal();
		} else {
			if (personaje.getDinero() < listConsumibles.get(opcionMenuConsumibles).getPrecio()){
				System.out.println("No tienes suficiente dinero para comprar esto.");
				menuPrincipal();
			} else {
				personaje.agregarObjeto(listConsumibles.get(opcionMenuConsumibles));
				personaje.setDinero(personaje.getDinero() - listConsumibles.get(opcionMenuConsumibles).getPrecio());
				System.out.println("Adquiriste " + listConsumibles.get(opcionMenuConsumibles).getTipo());
				menuPrincipal();
			}
		}
	}


	/**
	 * Metodo para mostrar el menu de hechizos disponibles para comprar.
	 */
	public void menuHechizos(){
		System.out.println("Elige el hechizo que quieres comprar.\n");
		int numHechizos = 0;
		for (Hechizos hechizos : listHechizos){
			System.out.println(numHechizos + ".- " + hechizos.getTipo() + "   $" + hechizos.getPrecio());
			numHechizos += 1;
		}
		System.out.println(numHechizos + ".- Regresar.");
		int opcionMenuHechizos;
		Scanner scanner = new Scanner(System.in);
		String usuarioMenuHechizos = scanner.nextLine();
		opcionMenuHechizos = Integer.parseInt(usuarioMenuHechizos);

		if (opcionMenuHechizos == numHechizos){
			menuPrincipal();
		} else {
			if (personaje.getDinero() < listHechizos.get(opcionMenuHechizos).getPrecio()){
				System.out.println("No tienes suficiente dinero para comprar esto.");
				menuPrincipal();
			} else {
				personaje.agregaHechizo(listHechizos.get(opcionMenuHechizos));
				personaje.setDinero(personaje.getDinero() - listHechizos.get(opcionMenuHechizos).getPrecio());
				System.out.println("Adquiriste " + listHechizos.get(opcionMenuHechizos).getTipo());
				menuPrincipal();
			}
		}
	}

	/**
	 * Metodo para mostrar el menu de atuendos disponibles para comprar.
	 */
	public void menuAtuendos(){
		System.out.println("Elige el atuendo que quieres comprar.\n");
		int numAtuendo = 0;
		for (Atuendos atuendos : listAtuendos){
			System.out.println(numAtuendo + ".- " + atuendos.getTipo() + "   $" + atuendos.getPrecio());
			numAtuendo += 1;
		}
		System.out.println(numAtuendo + ".- Regresar.");
		int opcionMenuAtuendo;
		Scanner scanner = new Scanner(System.in);
		String usuarioMenuAtuendo = scanner.nextLine();
		opcionMenuAtuendo = Integer.parseInt(usuarioMenuAtuendo);

		if (opcionMenuAtuendo == numAtuendo){
			menuPrincipal();
		} else {
			if (personaje.getDinero() < listAtuendos.get(opcionMenuAtuendo).getPrecio()){
				System.out.println("No tienes suficiente dinero para comprar esto.");
				menuPrincipal();
			} else {
				personaje.setAtuendo(listAtuendos.get(opcionMenuAtuendo));
				personaje.setDinero(personaje.getDinero() - listAtuendos.get(opcionMenuAtuendo).getPrecio());
				System.out.println("Adquiriste " + listAtuendos.get(opcionMenuAtuendo).getTipo());
				menuPrincipal();
			}
		}
	}

	/**
	 * Metodo para mostrar las armas disponibles para comprar.
	 */
	public void menuArmas(){
		System.out.println("Elige el arma que quieres comprar.\n");
		int numArma = 0;
		for (Armas armas : listArmas){
			System.out.println(numArma + ".- " + armas.getTipo() + "   $" + armas.getPrecio());
			numArma += 1;
		}
		System.out.println(numArma + ".- Regresar.");
		int opcionMenuArmas;
		Scanner scanner = new Scanner(System.in);
		String usuarioMenuArmas = scanner.nextLine();
		opcionMenuArmas = Integer.parseInt(usuarioMenuArmas);

		if (opcionMenuArmas == numArma){
			menuPrincipal();
		} else {
			if (personaje.getDinero() < listArmas.get(opcionMenuArmas).getPrecio()){
				System.out.println("No tienes suficiente dinero para comprar esto.");
				menuPrincipal();
			} else {
				personaje.setArma(listArmas.get(opcionMenuArmas));
				personaje.setDinero(personaje.getDinero() - listArmas.get(opcionMenuArmas).getPrecio());
				System.out.println("Adquiriste " + listArmas.get(opcionMenuArmas).getTipo());
				menuPrincipal();
			}
		}
	}

	/**
	 * Metodo para que el personaje entre a la tienda.
	 */
	public void entrarTienda(){
		menuPrincipal();
	}

	}
