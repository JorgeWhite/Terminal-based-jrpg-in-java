/**
 * Interfaz para hechizos.
 */
public interface  Hechizos{
  /**
   * Metodo para crear un hechizo.
   */
  public void creaHechizo();

  /**
   * Metodo para obtener el tipo de un hechizo.
   * @return
   */
  public String getTipo();

  /**
   * Metodo para obtener el precio de un hechizo.
   * @return
   */
  public int getPrecio();

  /**
   * Metodo para obtener el ataque de un hechizo.
   * @return
   */
  public int getAtk();

  /**
   * Metodo para obtener la descripcion de un hechizo.
   * @return
   */
  public String getDescripcion();
  
}
