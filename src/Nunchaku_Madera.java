/**
 * Clase de un nunchaku de madera, implementa armas.
 */
public class Nunchaku_Madera implements Armas{
  public String tipo;
  public int precio;
  public int atk;
  public String descripcion;

  /**
   * Metodo para crear un arma.
   */
  public void creaArmas(){
    tipo = "Arma Nunchaku de Madera";
    precio = 35;
    atk = 14;
    descripcion = "El arma adecuada para un ninja novato.Daño 14, Precio 35.";
  }

  /**
   * Metodo para obtener el tipo de un arma.
   * @return
   */
  public String getTipo(){
    return tipo;
  }

  /**
   * Metodo para obtener el precio de un arma.
   * @return
   */
  public int getPrecio(){
      return precio;
  }

  /**
   * Metodo para obtener el ataque de un arma.
   * @return
   */
  public int getAtk(){
      return atk;
  }

  /**
   * Metodo para obtener la descripcion de un arma.
   * @return
   */
  public String getDescripcion(){
      return descripcion;
  }
}
