/**
 * Class Muerto. Clase que modifica el estado de un personaje o un enemigo.
 * Esta clase implementa la interfaz de Estado.
 * @author Luis Geovanni Mendez Avila. Num de cuenta: 317143980.
 * 
 */
public class Muerto implements Estado{
	
	private Personaje personaje;
	private Enemigo enemigo;

	
	/**
	 * Constructor para modificar el estado de un personaje.
	 */
	public Muerto(Personaje personaje){
		this.personaje = personaje;
	}

	/**
	 * Constructor para modificar el estado de un enemigo.
	 */
	public Muerto(Enemigo enemigo){
		this.enemigo = enemigo;
	}

	/**
	 * Cambia el estado del personaje de a
	 */
	public void quemarPersonaje(){
		System.out.println("El personaje ya esta muerto.");
	}

	/**
	 * Cambia el estado del enemigo de a
	 */	
	public void quemarEnemigo(){
		System.out.println("El enemigo ya esta muerto");
	}

	/**
	 * Cambia el estado del personaje de a
	 */	
	public void congelarPersonaje(){
		System.out.println("El personaje ya esta muerto.");

	}
	
	/**
	 * Cambia el estado del enemigo de a
	 */		
	public void congelarEnemigo(){
		System.out.println("El enemigo ya esta muerto");

	}

	/**
	 * Cambia el estado del personaje de a
	 */	
	public void envenenarPersonaje(){
		System.out.println("El personaje ya esta muerto.");

	}
	
	/**
	 * Cambia el estado del enemigo de a
	 */	
	public void envenenarEnemigo(){
		System.out.println("El enemigo ya esta muerto");

	}
	
	/**
	 * Cambia el estado del personaje de a
	 */	
	public void personajeNormal(){
		System.out.println("El personaje ya esta muerto.");

	}

	/**
	 * Cambia el estado del enemigo de a
	 */	
	public void enemigoNormal(){
		System.out.println("El enemigo ya esta muerto");

	}
}