/**
 * Class Congelado. Clase que modifica el estado de un personaje o un enemigo.
 * Esta clase implementa la interfaz de Estado.
 * @author Luis Geovanni Mendez Avila. Num de cuenta: 317143980.
 * 
 */
public class Congelado implements Estado{
	
	private Personaje personaje;
	private Enemigo enemigo;
	private int turnosEnEstado;

	
	/**
	 * Constructor para modificar el estado de un personaje.
	 */
	public Congelado(Personaje personaje){
		this.personaje = personaje;
		turnosEnEstado = 0;
	}

	/**
	 * Constructor para modificar el estado de un enemigo.
	 */
	public Congelado(Enemigo enemigo){
		this.enemigo = enemigo;
		turnosEnEstado = 0;
	}

	/**
	 * Cambia el estado del personaje de congelado a quemado (no cambia).
	 */
	public void quemarPersonaje(){
		System.out.println("No puedes cambiar el estado de " + personaje.getNombre()+ " porque ya esta congelado.");
	}

	/**
	 * Cambia el estado del enemigo de congelado a quemado (no cambia).
	 */	
	public void quemarEnemigo(){
		System.out.println("No puedes cambiar el estado del enemigo porque ya esta congelado.");
	}

	/**
	 * Efectos del congelamiento.
	 */	
	public void congelarPersonaje(){
		if(personaje.getHp() < 10){
			personaje.setHp(0);
			personaje.setEstado(personaje.getMuerto());
			System.out.println(personaje.getNombre() + " ha muerto por congelamiento.");
			setTurnosEnEstado();
		}else{
			personaje.recibeDano(10);
			System.out.println(personaje.getNombre() + " recibe " + 10 + " de dano por congelamiento.");
			turnosEnEstado += 1;
		}
	}

	/**
	 * Metodo para asignar el numero de turnos en el estado congelado a 0.
	 */
	public void setTurnosEnEstado(){
		turnosEnEstado = 0;
	}

	/**
	 * Metodo para obtener el numero de turnos que el personaje/enemigo lleva en el estado congelado.
	 * @return
	 */
	public int getTurnosEnEstado(){
		return turnosEnEstado;
	}
	
	/**
	 * Efectos del congelamiento.
	 */		
	public void congelarEnemigo(){
		if(enemigo.getHp() < 10.0){
			enemigo.setHp(0.0);
			enemigo.setEstado(enemigo.getMuerto());
			System.out.println(enemigo.getNombre() + " ha muerto por congelamiento.");
			setTurnosEnEstado();
		}else{
			System.out.println(enemigo.getNombre() + " recibe " + 10 + " de dano por congelamiento.");
			enemigo.recibeDano(10.0);
			turnosEnEstado += 1;
		}
	}

	/**
	 * Cambia el estado del personaje de congelado a envenenado (no cambia).
	 */	
	public void envenenarPersonaje(){
		System.out.println("No puedes cambiar el estado de " + personaje.getNombre()+ " porque ya esta congelado.");
	}
	
	/**
	 * Cambia el estado del enemigo de congelado a envenenado (no cambia).
	 */	
	public void envenenarEnemigo(){
		System.out.println("No puedes cambiar el estado del enemigo porque ya esta congelado.");
	}
	
	/**
	 * Cambia el estado del personaje de congelado a normal.
	 */	
	public void personajeNormal(){
		personaje.setEstado(personaje.getNormal());
		setTurnosEnEstado();
	}

	/**
	 * Cambia el estado del enemigo de congelado a normal
	 */	
	public void enemigoNormal(){
		enemigo.setEstado(enemigo.getNormal());
		setTurnosEnEstado();
	}
}