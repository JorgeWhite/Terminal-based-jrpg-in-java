import java.util.Random;

/**
 * Class Enemigo. Clase que define a un enemigo del videojuego.
 * @author Luis Geovanni Méndez Avila. Num de cuenta: 317143980.
 *
 */
public class Enemigo implements Cloneable{
	
	private String nombre;
	private Estado estadoActual;
	private int ataque;
	private double hp;
	private int exp;
	private int oro;

	private Quemado quemado;
	private Congelado congelado;
	private Envenenado envenenado;
	private Normal normal;
	private Muerto muerto;

	/**
	 * Constructor de un Enemigo.
	 * @param n . Sera el nombre del enemigo.
	 * @param atk . Sera el ataque inicial del enemigo.
	 * @param vida . Seran los puntos de vida del enemigo
	 */
	public Enemigo(String n, int atk, double vida, int experiencia, int oro){
		nombre = n;
		ataque = atk;
		hp = vida;
		exp = experiencia;
		this.oro = oro;

		quemado = new Quemado(this);
		congelado = new Congelado(this);
		envenenado = new Envenenado(this);
		normal = new Normal(this);
		muerto = new Muerto(this);

		estadoActual = normal;
	}

	/**
	 * Metodo de la interfaz Cloneable que permite copiar un objeto.
	 * @throws  CloneNotSupportedException . Si la clase del objeto a clonar no admite la interfaz Cloneable. 
	 */
	@Override
	public Object clone(){
		Enemigo clon = new Enemigo(getNombre(), ataque, hp, exp, oro);
		return clon;
	}

	/**
	 * Metodo que modifica la vida del enemigo en base al dano que recibe.
	 * @param pts . Son los puntos de dano que recibe.
	 */
	public void recibeDano(double pts){
		setHp(getHp() - pts);
	}

	/**
	 * Metodo que define el estado actual del enemigo
	 * @param estado . Es el nuevo estado del enemigo.
	 */
	public void setEstado(Estado estado){
		estadoActual = estado;
	}

	/**
	 * Metodo que devuelve el estado actual del enemigo.
	 */
	public Estado getEstado(){
		return estadoActual;
	}

	/**
	 * Metodo que devuelve el estado quemado del enemigo
	 */
	public Estado getQuemado(){
		return quemado;
	}

	/**
	 * Metodo que devuelve el estado congelado del enemigo
	 */
	public Estado getCongelado(){
		return congelado;
	}

	/**
	 * Metodo que devuelve el estado envenenado del enemigo
	 */
	public Estado getEnvenenado(){
		return envenenado;
	}

	/**
	 * Metodo que devuelve el estado normal del enemigo
	 */
	public Estado getNormal(){
		return normal;
	}

	/**
	 * Metodo que devuelve el estado muerto del enemigo
	 */
	public Estado getMuerto(){
		return muerto;
	}

	/**
	 * Metodo para obtener el nombre del enemigo.
	 */
	public String getNombre(){
		return nombre;
	}

	/**
	 * Metodo para obtener los puntos de salud del enemigo.
	 */
	public double getHp(){
		return hp;
	}

	/**
	 * Metodo para obtener el ataque del enemigo.
	 */
	public int getAtaque(){
		return ataque;
	}

	/**
	 * Metodo para obtener el nombre del enemigo.
	 */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/**
	 * Metodo para obtener los puntos de salud del enemigo.
	 */
	public void setHp(double hp){
		this.hp = hp;
	}

	/**
	 * Metodo para obtener el ataque del enemigo.
	 */
	public void setAtaque(int atk){
		ataque = atk;
	}

	/**
	 * Metodo que devuelve una cadena con las caracteristicas del enemigo
	 */
	public String descripcion(){
		return getNombre() + " HP: " + getHp() + " Atq: " + getAtaque();
	}

	/**
	 * Metodo para que el enemigo ataque a tu personaje.
	 * @param ataque . La cantidad de daño que hace.
	 * @param personaje . El objetivo del ataque.
	 */
	public void atacarPersonaje(int ataque, Personaje personaje){
		Random randomTipoAtaque = new Random();
		int tipoAtaque = randomTipoAtaque.nextInt(2);
			if (tipoAtaque == 0){    // 1 ---- Melee
				atacarPersonajeMelee(personaje);
			} else if (tipoAtaque == 1){   //  ---- Hechizo
				atacarPersonajeHechizo(personaje);
			} else {
				System.out.println(getNombre() + " fallo al realizar ataque.");
			}

	}

	/**
	 * Metodo para que un enemigo ataque a un personaje a melee.
	 */
	public void atacarPersonajeMelee(Personaje personaje){
		personaje.recibeDano(getAtaque());
		System.out.println(getNombre() + " realizo " + getAtaque() + " puntos de dano sobre " + personaje.getNombre());
	}

	/**
	 * Metodo para atacar a un personaje con un hechizo aleatorio.
	 * @param personaje El personaje a atacar.
	 */
	public void atacarPersonajeHechizo(Personaje personaje){
		int hp = personaje.getHp();

		Hechizo_Hielo hechizo_hielo = new Hechizo_Hielo();
		Hechizo_Fuego hechizo_fuego = new Hechizo_Fuego();
		Hechizo_Envenenar hechizo_envenenar = new Hechizo_Envenenar();
		Random randomHechizo = new Random();
		int hechizoElegido = randomHechizo.nextInt(4);
		if (hechizoElegido == 0){     //  0 --- Hechizo hielo
			hechizo_hielo.creaHechizo();
			int ataque =  (this.getAtaque() + hechizo_hielo.getAtk());
			System.out.println(getNombre() + " castea Congelamiento y hace "
					+ ataque + " puntos de dano sobre " + personaje.getNombre());
			personaje.setHp(hp-((ataque)));
			// Se cambia el estado del personaje.
			personaje.setEstado(personaje.getCongelado());
		} else if (hechizoElegido == 1){    //   1 ---- Hechizo fuego
			hechizo_fuego.creaHechizo();
			int ataque =  (this.getAtaque() + hechizo_fuego.getAtk());
			System.out.println(getNombre() + " castea Fuego y hace " + ataque + " puntos de dano sobre " + personaje.getNombre());
			personaje.setHp(hp-((ataque)));
			// Se cambia el estado del personaje.
			personaje.setEstado(personaje.getQuemado());
		} else if (hechizoElegido == 2){
			hechizo_envenenar.creaHechizo();
			int ataque =  (this.getAtaque() + hechizo_envenenar.getAtk());
			System.out.println(getNombre() + " castea Envenenamiento y hace " + ataque + " puntos de dano sobre " + personaje.getNombre());
			personaje.setHp(hp-((ataque)));
			// Se cambia el estado del personaje.
			personaje.setEstado(personaje.getEnvenenado());
		}
	}

	/**
	 * Metodo para obtener la experiencia que otorga este enemigo.
	 */
	public int getExp(){
		return exp;
	}

	/**
	 * Metodo para asignar la experiencia que otorga un enemigo.
	 */
	public void setExp(int exp){
		this.exp = exp;
	}

	/**
	 * Metodo para obtener el oro que otorga un enemigo.
	 */
	public int getOro(){
		return oro;
	}

	/**
	 * Metodo para asignar el oro que da un enemigo.
	 */
	public void setOro(int oro){
		this.oro = oro;
	}
}