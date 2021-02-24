/**
 * Class Generador. Clase para hacer recursos y enemigos... creo.
 * @author Luis Geovanni Mendez Avila. Num de cuenta: 317143980.
 */
import java.util.Random;

public class Generador{
	private Enemigo[] enemigos;

	/**
	 * Metodo que obtiene un enemigo de la base de datos de enemigos y le asigna una dificultad.
	 * @param bd . Es la base de datos de enemigos.
	 * @param dificultad . Es la dificultad que tendrá el enemigo.
	 */
	public Enemigo getEnemigo(BDEnemigos bd, int dificultad){
		Random r = new Random();
		int posicion = r.nextInt(10);
		Enemigo enemigo = bd.getEnemigo(posicion);
		enemigo.setHp(enemigo.getHp() * dificultad);
		enemigo.setAtaque(enemigo.getAtaque() * dificultad);
		enemigo.setExp(enemigo.getExp() * dificultad);
		return enemigo;
	}
}