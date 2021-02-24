/**
 * Class BDEnemigos. Clase que sera la base de datos de los enemigos en el juego.
 * @author Luis Geovanni Mendez Avila. Num de cuenta: 317143980.
 *
 */
public class BDEnemigos{
	
	private Enemigo[] enemigos;

	/**
	 * Constructor de la base de datos de enemigos.
	 */
	public BDEnemigos(){
		enemigos = new Enemigo[]{new Enemigo("Slime", 5, 3, 1, 1),
								new Enemigo("Red Slime", 7, 4, 1, 2),
								new Enemigo("Metal Slime", 10, 4, 115, 6),
								new Enemigo("Drakee", 9, 6, 2, 2),
								new Enemigo("Magidrakee", 14, 15, 5, 12),
								new Enemigo("Scorpion", 18, 20, 6, 16),
								new Enemigo("Ghost", 11, 7, 3, 4),};
	}

	/**
	 * Metodo que obtiene un enemigo dada una posicion en la base de datos.
	 * @param posicion . La posicion del enemigo.
	 */
	public Enemigo getEnemigo(int posicion){
		int i = posicion%enemigos.length;
		return (Enemigo)enemigos[i].clone();
	}

	/**
	 * Metodo que imprime la base de datos.
	 */
	public void printBD(){
		System.out.println("*****Lista de enemigos*****");
		for(int i = 0; i < enemigos.length; i++){
			System.out.println(enemigos[i].descripcion());
		}
	}
}