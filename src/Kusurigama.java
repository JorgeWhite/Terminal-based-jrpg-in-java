/**
 * Clase de una kusurigama, implementa armas.
 */
public class Kusurigama implements Armas{
  public String tipo;
  public int precio;
  public int atk;
  public String descripcion;

  /**
   * Metodo para crear un arma.
   */
  public void creaArmas(){
    tipo = "Arma Kusurigama";
    precio = 130;
    atk = 40;
    descripcion = "Las cabezas rodaran con esta arma, usala sabiamente.Daño 40,Precio 130.";
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
