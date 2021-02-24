/**
 * Class Arquero. Clase que define las propiedades de un Arquero.
 * Esta clase hereda de la clase Personaje.
 * @author Luis Geovanni Mendez Avila . Numero de cuenta: 317143980
 *
 */
public class Arquero extends Personaje{

	/**
	 * Constructor de un Arquero.
	 *
	 */
	public Arquero(String nombre){
		super(nombre);
		// Creamos lo objetos iniciales de la clase.
		Resortera resortera = new Resortera();
		resortera.creaArmas();
		Hechizo_Hielo hechizo_hielo = new Hechizo_Hielo();
		hechizo_hielo.creaHechizo();
		Armadura_de_cuero armadura_de_cuero = new Armadura_de_cuero();

		this.setArma(resortera);
		this.agregaHechizo(hechizo_hielo);
		this.setAtuendo(armadura_de_cuero);
	}
	
	/**
	 * Metodo abstracto que servira para definir un ataque para cada tipo de peronaje.
	 * @param enemigo . El enemigo que sera atacado.
	 */
	@Override
	public void Atacar_Arma(Enemigo enemigo){
		double hp = enemigo.getHp();
		double ataque = 1.2*(this.getAtk() + this.getArma().getAtk());
		System.out.println("Haces un dano de " + ataque + " sobre " + enemigo.getNombre());
		enemigo.setHp(hp-ataque);
		if (enemigo.getHp() <= 0){
			System.out.println(enemigo.getNombre() + " ha muerto.");
			enemigo.setEstado(enemigo.getMuerto());
		}
	}

	/**
	 * Metodo abstracto que permite al personaje usar magia, depende del tipo de personaje la forma en que se usa.
	 */
	@Override
	public void UsarMagia(Enemigo enemigo, Hechizos hechizo){
		double hp = enemigo.getHp();
		double ataque =  0.8*(this.getAtk() + hechizo.getAtk());
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