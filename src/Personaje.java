/**
 * Class Personaje. Clase abstracta que define un personaje para nuestro juego.
 * @author Luis Geovanni Mendez Avila. Num de cuenta: 317143980
 *
 */
public abstract class Personaje{
	
	protected String nombre;
	protected Armas arma;
	protected Atuendos atuendo;
	protected int coordenadaX, coordenadaY, exp, lvl, def, atk, eva, hp, dinero;
	protected Estado estadoActual;
	protected Hechizos[] hechizos;
	protected Consumible[] inventarioConsumibles;

	private Quemado quemado;
	private Congelado congelado;
	private Envenenado envenenado;
	private Normal normal;
	private Muerto muerto;

	/**
	 * Constructor de Personaje.
	 *
	 */
	public Personaje(String n){
		
		nombre = n;

		quemado = new Quemado(this);
		congelado = new Congelado(this);
		envenenado = new Envenenado(this);
		normal = new Normal(this);
		muerto = new Muerto(this);

		estadoActual = normal;


		coordenadaX = 0;
		coordenadaY = 0;
		hp = 300;
		eva = 10;
		def = 10;
		atk = 15;
		exp = 0;
		lvl = 1;
		dinero = 100;
		hechizos = new Hechizos[3];
		inventarioConsumibles = new Consumible[20];
		Consumible pocion = new Pocion_Hp();
		pocion.creaConsumible();
		agregarObjeto(pocion);
	}

	/**
	 * Metodo que regresa el nombre del personaje.
	 */
	public String getNombre(){
		return nombre;
	}

	/**
	 * Metodo que permite que el personaje pueda moverse dependiendo del parametro dado.
	 * @param movimiento . Parametro de tipo int que determina cuanto se debe mover el personaje.
	 */
	public void Caminar(int movimiento){

	}

	/**
	 * Metodo que reduce la vida del personaje.
	 * @param pts . Son los puntos que se le van a restar a la vida del personaje.
	 */
	public void recibeDano(int pts){
		setHp(getHp() - pts);
	}

	/**
	 * Metodo abstracto que servira para definir un ataque para cada tipo de peronaje.
	 * @param enemigo . El enemigo que sera atacado.
	 */
	public abstract void Atacar_Arma(Enemigo enemigo);

	/**
	 * Metodo que permite que el personaje pueda usar algun objeto de mejora que tenga con el.
	 */
	public void UsarObjeto(Consumible consumible){
		int hp = consumible.getHp();
		int def = consumible.getDef();
		int eva = consumible.getEva();
		setDef(getDef() + def);
		setHp(getHp() + hp);
		setEva(getEva() + eva);
		if (hp != 0){
			System.out.println("Tu hp aumento en " + hp + " unidades.");
		}
		if (def != 0){
			System.out.println("Tu defensa aumento en " + def + " unidades.");
		}
		if (eva != 0){
			System.out.println("Tu evasion aumento en " + eva + " unidades.");
		}
	}

	/**
	 * Metodo abstracto que permite al personaje usar magia, depende del tipo de personaje la forma en que se usa.
	 */
	public abstract void UsarMagia(Enemigo enemigo, Hechizos hechizo);

	/**
	 * Metodo que devuelve el hechizo que puede usar el personaje.
	 */
	public Hechizos[] getHechizos(){
		return hechizos;
	}

	/**
	 * Metodo que devuelve la coordenada x de la ubicación del personaje 
	 */
	public int getCoordenadaX(){
		return coordenadaX;
	}

	/**
	 * Metodo que devuelve la coordenada x de la ubicación del personaje 
	 */
	public int getCoordenadaY(){
		return coordenadaY;
	}

	/**
	 * Metodo que obtiene la experiencia del personaje.
	 */
	public int getExp(){
		return exp;
	}

	/**
	 * Metodo que obtiene el nivel del personaje.
	 */
	public int getLvl(){
		return lvl;
	}

	/**
	 * Metodo que obtiene la defensa del personaje.
	 */
	public int getDef(){
		return def;
	}

	/**
	 * Metodo que obtiene el ataque del personaje.
	 */
	public int getAtk(){
		return atk;
	}

	/**
	 * Metodo que obtiene la evasion del personaje.
	 */
	public int getEva(){
		return eva;
	}

	/**
	 * Metodo que obtiene los puntos de salud del personaje.
	 */
	public int getHp(){
		return hp;
	}

	/**
	 * Metodo que obtiene el dinero del personaje.
	 */
	public int getDinero(){
		return dinero;
	}

	/**
	 * Metodo que obtiene el tipo de arma del personaje.
	 */
	public Armas getArma(){
		return arma;
	}

	/**
	 * Metodo que obtiene el tipo de atuendo del personaje.
	 */
	public Atuendos getAtuendo(){
		return atuendo;
	}

	/**
	 * Metodo que devuelve el estado actual del personaje.
	 */
	public Estado getEstado(){
		return estadoActual;
	}

	/**
	 * Metodo que devuelve el estado quemado del personaje
	 */
	public Estado getQuemado(){
		return quemado;
	}

	/**
	 * Metodo que devuelve el estado congelado del personaje
	 */
	public Estado getCongelado(){
		return congelado;
	}

	/**
	 * Metodo que devuelve el estado envenenado del personaje
	 */
	public Estado getEnvenenado(){
		return envenenado;
	}

	/**
	 * Metodo que devuelve el estado normal del personaje
	 */
	public Estado getNormal(){
		return normal;
	}

	/**
	 * Metodo que devuelve el estado mueto del personaje
	 */
	public Estado getMuerto(){
		return muerto;
	}

	/**
	 * Metodo que establece la coordenada x de la ubicación del personaje 
	 * @param cordX . La nueva coordenada en x.
	 */
	public void setCoordenadaX(int cordX){
		coordenadaX = cordX;
	}

	/**
	 * Metodo que establece la coordenada x de la ubicación del personaje 
	 * @param cordY . La nueva coordenada en Y.
	 */
	public void setCoordenadaY(int cordY){
		coordenadaY = cordY;
	}

	/**
	 * Metodo que establece la experiencia del personaje.
	 * @param exp . La nueva experiencia.
	 */
	public void setExp(int exp){
		this.exp = exp;
	}

	/**
	 * Metodo que establece el nivel del personaje.
	 * @param lvl . El nuevo nivel del personaje.
	 */
	public void setLvl(int lvl){
		this.lvl = lvl;
	}

	/**
	 * Metodo para subir un nivel.
	 */
	public void lvlUp(){
		setLvl(getLvl() + 1);

		setHp(getHp()*2);
		setEva(getEva()*2);
		setAtk(getEva()*2);
	}

	/**
	 * Metodo que agrega el hechizo al arreglo de hechizos.
	 */
	public void agregaHechizo(Hechizos h){
		for(int i = 0; i < getHechizos().length; i++){
			if(hechizos[i] == null){
				hechizos[i] = h;
				return;
			}
		}
	}

	/**
	 * Metodo que establece la defensa del personaje.
	 * @param def . La nueva estadistica de defensa del personaje.
	 */
	public void setDef(int def){
		this.def = def;
	}

	/**
	 * Metodo que establece el ataque del personaje.
	 * @param atk . La nueva estadistica de ataque del personaje.
	 */
	public void setAtk(int atk){
		this.atk = atk;
	}

	/**
	 * Metodo que establece la evasion del personaje.
	 * @param eva . La nueva estadistica de evasion del personaje.
	 */
	public void setEva(int eva){
		this.eva = eva;
	}

	/**
	 * Metodo que establece los puntos de salud del personaje.
	 * @param hp . Los nuevos puntos de salud del personaje.
	 */
	public void setHp(int hp){
		this.hp = hp;
	}

	/**
	 * Metodo que establece el dinero del personaje.
	 * @param dinero . La nueva cantidad de dinero del personaje.
	 */
	public void setDinero(int dinero){
		this.dinero = dinero;
	}

	/**
	 * Metodo que establece el tipo de arma del personaje.
	 * @param arma . La nueva arma del personaje.
	 */
	public void setArma(Armas arma){
		this.arma = arma;
	}

	/**
	 * Metodo que establece el tipo de atuendo del personaje.
	 * El nuevo atuendo del personaje.
	 */
	public void setAtuendo(Atuendos atuendo){
		this.atuendo = atuendo;
	}

	/**
	 * Metodo que establece el estado actual del personaje.
	 * @param estadoActual . El nuevo estado del personaje.
	 */
	public void setEstado(Estado estadoActual){
		this.estadoActual = estadoActual;
	}

	/**
	 * Informacion basica del personaje.
	 */
	public String descripcion(){
		return getNombre() + " LVL " + getLvl() + " HP: " + getHp() + " Atq: " + getAtk() + " Def " + getDef()
				+ " Eva " + getEva() + "\n" + "Arma: " + getArma().getTipo() + " Atuendo: " + getAtuendo().getTipo() ;
	}

	public Consumible[] getInventario(){
		return inventarioConsumibles;
	}

	/**
	 * Metodo para agregar un objeto consumible al inventario del personaje.
	 */
	public void agregarObjeto(Consumible consumible){
		for (int i = 0; i < inventarioConsumibles.length; i++){
			if (inventarioConsumibles[i] == null){
				inventarioConsumibles[i] = consumible;
				return;
			}
		}
	}

	public void revisarLvlUp(){
		int expNecesaria = getLvl() * 100;
		if (getExp() > expNecesaria) {
			lvlUp();
			System.out.println("Haz subido a nivel " + getLvl());
			System.out.println(descripcion());
		}
	}

}