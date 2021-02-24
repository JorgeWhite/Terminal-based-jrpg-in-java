/**
 * Class Quemado. Clase que modifica el estado de un personaje o un enemigo.
 * Esta clase implementa la interfaz de Estado.
 * @author Luis Geovanni Mendez Avila. Num de cuenta: 317143980.
 * 
 */
public class Quemado implements Estado{
	
	private Personaje personaje;
	private Enemigo enemigo;
	private int turnosEnEstado;

	
	/**
	 * Constructor para modificar el estado de un personaje.
	 */
	public Quemado(Personaje personaje){
		this.turnosEnEstado = 0;
		this.personaje = personaje;
	}

	/**
	 * Constructor para modificar el estado de un enemigo.
	 */
	public Quemado(Enemigo enemigo){
		turnosEnEstado = 0;
		this.enemigo = enemigo;
	}

	/**
	 * Efectos de la quemadura.
	 */
	public void quemarPersonaje(){
		if(personaje.getHp() < 10.0){
			personaje.setHp(0);
			personaje.setEstado(personaje.getMuerto());
			System.out.println(personaje.getNombre() + " ha muerto quemado.");
			setTurnosEnEstado();
		}else{
			personaje.recibeDano(10);
			System.out.println(personaje.getNombre() + " recibe " + 10 + " de dano por quemadura.");
			turnosEnEstado += 1;
		}
	}

	/**
	 * Efectos de la quemadura.
	 */	
	public void quemarEnemigo(){
		if(enemigo.getHp() < 10.0){
			enemigo.setHp(0.0);
			enemigo.setEstado(enemigo.getMuerto());
			System.out.println(enemigo.getNombre() + " ha muerto quemado.");
			setTurnosEnEstado();
		}else{
			enemigo.recibeDano(10.0);
			System.out.println(enemigo.getNombre() + " recibe " + 10 + " de dano por quemadura.");
			turnosEnEstado += 1;
		}
	}

	/**
	 * Metodo para asignar el numero de turnos en el estado quemado a 0.
	 */
	public void setTurnosEnEstado(){
		turnosEnEstado = 0;
	}

	/**
	 * Metodo para obtener el numero de turnos que el personaje/enemigo lleva en el estado quemado.
	 * @return
	 */
	public int getTurnosEnEstado(){
		return turnosEnEstado;
	}

	/**
	 * Cambia el estado del personaje de quemado a congelado (No hace nada).
	 */	
	public void congelarPersonaje(){
		System.out.println("Tu" + personaje.getNombre() + " no puede cambiar de estado porque ya está quemado.");
	}
	
	/**
	 * Cambia el estado del enemigo de quemado a congelado (No hace nada).
	 */		
	public void congelarEnemigo(){
		System.out.println("El enemigo no puede cambiar de estado porque ya está quemado.");
	}

	/**
	 * Cambia el estado del personaje de quemado a congelado (No hace nada).
	 */	
	public void envenenarPersonaje(){
		System.out.println("Tu" + personaje.getNombre() +  "no puede cambiar de estado porque ya está quemado.");
	}
	
	/**
	 * Cambia el estado del enemigo de quemado a envenenado (No hace nada).
	 */	
	public void envenenarEnemigo(){
		System.out.println("El enemigo no puede cambiar de estado porque ya está quemado.");
	}
	
	/**
	 * Cambia el estado del personaje de quemado a normal.
	 */	
	public void personajeNormal(){
		personaje.setEstado(personaje.getNormal());
		setTurnosEnEstado();
	}

	/**
	 * Cambia el estado del enemigo de quemado a normal.
	 */	
	public void enemigoNormal(){
		enemigo.setEstado(enemigo.getNormal());
		setTurnosEnEstado();
	}
}