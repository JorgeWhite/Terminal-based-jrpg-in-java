/**
 * Class Normal. Clase que modifica el estado de un personaje o un enemigo.
 * Esta clase implementa la interfaz de Estado.
 * @author Luis Geovanni Mendez Avila. Num de cuenta: 317143980.
 * 
 */
public class Normal implements Estado{
	
	private Personaje personaje;
	private Enemigo enemigo;

	
	/**
	 * Constructor para modificar el estado de un personaje.
	 */
	public Normal(Personaje personaje){
		this.personaje = personaje;
	}

	/**
	 * Constructor para modificar el estado de un enemigo.
	 */
	public Normal(Enemigo enemigo){
		this.enemigo = enemigo;
	}

	/**
	 * Cambia el estado del personaje de normal a quemado.
	 */
	public void quemarPersonaje(){
		personaje.setEstado(personaje.getQuemado());
	}

	/**
	 * Cambia el estado del enemigo de normal a quemado.
	 */	
	public void quemarEnemigo(){
		enemigo.setEstado(enemigo.getQuemado());
	}

	/**
	 * Cambia el estado del personaje de normal a congelado.
	 */	
	public void congelarPersonaje(){
		personaje.setEstado(personaje.getCongelado());
	}
	
	/**
	 * Cambia el estado del enemigo de normal a congelado.
	 */		
	public void congelarEnemigo(){
		enemigo.setEstado(enemigo.getCongelado());
	}

	/**
	 * Cambia el estado del personaje de normal a envenenado.
	 */	
	public void envenenarPersonaje(){
		personaje.setEstado(personaje.getEnvenenado());
	}
	
	/**
	 * Cambia el estado del enemigo de normal a envenenado.
	 */	
	public void envenenarEnemigo(){
		enemigo.setEstado(enemigo.getEnvenenado());
	}

	/**
	 * Cambia el estado del personaje de normal a muerto.
	 */	
	public void matarPersonaje(){
		personaje.setEstado(personaje.getMuerto());
	}

	/**
	 * Cambia el estado del enemigo de normal a muerto.
	 */		
	public void matarEnemigo(){
		enemigo.setEstado(enemigo.getMuerto());
	}
	
	/**
	 * Normal a normal e.e.
	 */	
	public void personajeNormal(){
		System.out.println("Tu " + personaje.getNombre() + " no tiene ningun cambio de estado.");
	}

	/**
	 * normal a normal e.e.
	 */	
	public void enemigoNormal(){
		System.out.println("El enemigo no tiene ningun cmabio de estado.");
	}
}