/**
 * Class Caballero. Clase que define las propiedades de un caballero.
 * Esta clase hereda de la clase Personaje.
 * @author Luis Geovanni Mendez Avila . Numero de cuenta: 317143980
 * 
 */
public class Caballero extends Personaje{

	/**
	 * Constructor de un Caballero.
	 */
	public Caballero(String nombre){
		super(nombre);
		// Creamos los objetos iniciales de la clase.
		Espada_Madera espada_madera = new Espada_Madera();
		espada_madera.creaArmas();
		Hechizo_Fuego hechizo_fuego = new Hechizo_Fuego();
		hechizo_fuego.creaHechizo();
		Armadura_de_cuero armadura_de_cuero = new Armadura_de_cuero();
		armadura_de_cuero.creaAtuendo();

		this.setArma(espada_madera);
		this.agregaHechizo(hechizo_fuego);
		this.setAtuendo(armadura_de_cuero);
	}
	
	/**
	 * Metodo que permite al personaje atacar, depende del tipo de personaje la forma en que se usa.
	 * @param enemigo . El enemigo que sera atacado.
	 */
	@Override
	public void Atacar_Arma(Enemigo enemigo){
		double hp = enemigo.getHp();
		double ataque = 1.5*(this.getAtk() + this.getArma().getAtk());
		System.out.println("Haces un dano de " + ataque + " sobre " + enemigo.getNombre());
		enemigo.setHp(hp-ataque);
		if (enemigo.getHp() <= 0){
			System.out.println(enemigo.getNombre() + " ha muerto.");
			enemigo.setEstado(enemigo.getMuerto());
		}
	}

	/**
	 * Metodo que permite al personaje usar magia, depende del tipo de personaje la forma en que se usa.
	 */
	@Override
	public void UsarMagia(Enemigo enemigo, Hechizos hechizo){
		double hp = enemigo.getHp();
		double ataque =  0.5*(this.getAtk() + hechizo.getAtk());
		System.out.println("Haces un dano de " + ataque + " sobre " + enemigo.getNombre());
		enemigo.setHp(hp-((ataque)));
		// El hechizo cambia de estado al enemigo.
		if (hechizo instanceof Hechizo_Envenenar){
			enemigo.setEstado(enemigo.getEnvenenado());
		} else if (hechizo instanceof Hechizo_Hielo){
			enemigo.setEstado(enemigo.getCongelado());
		} else if (hechizo instanceof Hechizo_Fuego) {
			enemigo.setEstado(enemigo.getQuemado());
		}
		// Se verifica si el enemigo ha muerto.
		if (enemigo.getHp() <= 0){
			System.out.println(enemigo.getNombre() + " ha muerto.");
			enemigo.setEstado(enemigo.getMuerto());
		}
	}
}