/**
 * Clase de una resortera, implementa armas.
 */
public class Resortera implements Armas{

  public String tipo;
  public int precio;
  public int atk;
  public String descripcion;

  /**
   * Metodo para crear un arma.
   */
  public void creaArmas(){
    tipo = "Arma Resortera";
    precio = 50;
    atk = 15;
    descripcion = "Una simple resortera . Daño 15, precio 50.";
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
