/**
 * Class Ninja. Clase que define las propiedades de un Ninja.
 * Esta clase hereda de la clase Personaje.
 * @author Luis Geovanni Mendez Avila . Numero de cuenta: 317143980
 *
 */
public class Ninja extends Personaje{

	/**
	 * Constructor de un Ninja.
	 *
	 */
	public Ninja(String nombre){
		super(nombre);
		// Creamos los objetos iniciales de la clase.
		Nunchaku_Madera nunchaku_madera = new Nunchaku_Madera();
		nunchaku_madera.creaArmas();
		Hechizo_Envenenar hechizo_envenenar = new Hechizo_Envenenar();
		hechizo_envenenar.creaHechizo();
		Armadura_Laton armadura_laton = new Armadura_Laton();
		armadura_laton.creaAtuendo();

		this.setArma(nunchaku_madera);
		this.agregaHechizo(hechizo_envenenar);
		this.setAtuendo(armadura_laton);
	}
	
	/**
	 * Metodo abstracto que servira para definir un ataque para cada tipo de peronaje.
	 * @param enemigo . El enemigo que sera atacado.
	 */
	@Override
	public void Atacar_Arma(Enemigo enemigo){
		double hp = enemigo.getHp();
		double ataque = (this.getAtk() + this.getArma().getAtk());
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
		double ataque = (this.getAtk() + hechizo.getAtk());
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