/**
 * Interface Estado. Interfaz que define los metodos a implementa para estados particulares.
 * @author Luis Geovanni Mendez Avila. Num de cuenta: 317143980.
 *
 */
public interface Estado{
	
	public void quemarPersonaje();
	public void quemarEnemigo();
	public void congelarPersonaje();
	public void congelarEnemigo();
	public void envenenarPersonaje();
	public void envenenarEnemigo();
	public void personajeNormal();
	public void enemigoNormal();	
}