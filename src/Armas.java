/**
 * Interfaz para las armas.
 */
public interface Armas{

  /**
   * Metodo para crear un arma.
   */
  public void creaArmas();

  /**
   * Metodo para obtener el tipo de un arma.
   * @return
   */
  public String getTipo();

  /**
   * Metodo para obtener el ataque de un arma.
   * @return
   */
  public int getAtk();

  /**
   * Metodo para obtener el precio de un arma.
   * @return
   */
  public int getPrecio();

  /**
   * Metodo para obtener la descripcion de un arma.
   * @return
   */
  public String getDescripcion();

}
