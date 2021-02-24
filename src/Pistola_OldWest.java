/**
 * Clase para una pistola old west, implementa armas.
 */
public class Pistola_OldWest implements Armas{
  public String tipo;
  public int precio;
  public int atk;
  public String descripcion;

  /**
   * Metodo para crear un arma.
   */
  public void creaArmas(){
    tipo = "Arma Pistola Old West";
    precio = 200 ;
    atk = 50;
    descripcion = "Una pistola clasica, no es la mejor pero si lo mejor que hay. Daño 50, Precio 200.";
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
