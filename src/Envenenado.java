/**
 * Class Envenenado. Clase que modifica el estado de un personaje o un enemigo.
 * Esta clase implementa la interfaz de Estado.
 * @author Luis Geovanni Mendez Avila. Num de cuenta: 317143980.
 * 
 */
public class Envenenado implements Estado{
	
	private Personaje personaje;
	private Enemigo enemigo;
	private int turnosEnEstado;

	
	/**
	 * Constructor para modificar el estado de un personaje.
	 */
	public Envenenado(Personaje personaje){
		this.personaje = personaje;
		turnosEnEstado = 0;
	}

	/**
	 * Constructor para modificar el estado de un enemigo.
	 */
	public Envenenado(Enemigo enemigo){
		this.enemigo = enemigo;
		turnosEnEstado = 0;
	}

	/**
	 * Cambia el estado del personaje de envenenado a quemado (no cambia).
	 */
	public void quemarPersonaje(){
		System.out.println("No puedes cambiar el estado de " + personaje.getNombre()+ " porque ya esta envenenado.");
	}

	/**
	 * Cambia el estado del enemigo de envenenado a quemado (no cambia).
	 */	
	public void quemarEnemigo(){
		System.out.println("No puedes cambiar el estado del enemigo porque ya esta envenenado.");
	}

	/**
	 * Cambia el estado del personaje de envenenado a congelado (no cambia).
	 */	
	public void congelarPersonaje(){
		System.out.println("No puedes cambiar el estado de " + personaje.getNombre()+ " porque ya esta envenenado.");
	}
	
	/**
	 * Cambia el estado del enemigo de envenenado a quemado (no cambia).
	 */		
	public void congelarEnemigo(){
		System.out.println("No puedes cambiar el estado del enemigo porque ya esta envenenado.");
	}

	/**
	 * Efectos del envenenamiento.
	 */	
	public void envenenarPersonaje(){
		if(personaje.getHp() < 10){
			personaje.setHp(0);
			personaje.setEstado(personaje.getMuerto());
			System.out.println(personaje.getNombre() + " ha muerto envenenado.");
			setTurnosEnEstado();
		}else{
			personaje.recibeDano(10);
			System.out.println(personaje.getNombre() + " recibe " + 10 + " de dano por envenenamiento.");
			turnosEnEstado += 1;
		}
	}
	
	/**
	 * Efectos del envenenamiento.
	 */	
	public void envenenarEnemigo(){
		if(enemigo.getHp() < 10.0){
			enemigo.setHp(0.0);
			enemigo.setEstado(enemigo.getMuerto());
			System.out.println(enemigo.getNombre() + " ha muerto envenenado.");
			setTurnosEnEstado();
		}else{
			enemigo.recibeDano(10.0);
			System.out.println(enemigo.getNombre() + " recibe " + 10 + " de dano por congelamiento.");
			turnosEnEstado += 1;
		}
	}

	/**
	 * Metodo para asignar el numero de turnos en el estado envenenado a 0.
	 */
	public void setTurnosEnEstado(){
		turnosEnEstado = 0;
	}

	/**
	 * Metodo para obtener el numero de turnos que el personaje/enemigo lleva en el estado envenenado.
	 * @return
	 */
	public int getTurnosEnEstado(){
		return turnosEnEstado;
	}
	
	/**
	 * Cambia el estado del personaje de envenenado a normal.
	 */	
	public void personajeNormal(){
		personaje.setEstado(personaje.getNormal());
		setTurnosEnEstado();
	}

	/**
	 * Cambia el estado del personaje de envenenado a normal.
	 */	
	public void enemigoNormal(){
		enemigo.setEstado(enemigo.getNormal());
		setTurnosEnEstado();
	}
}