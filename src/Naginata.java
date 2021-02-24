/**
 * Clase de una naginata, implementa armas.
 */
public class Naginata implements Armas{
  public String tipo;
  public int precio;
  public int atk;
  public String descripcion;

  /**
   * Metodo para crear un arma.
   */
  public void creaArmas(){
    tipo = "Arma Naginata";
    precio = 80;
    atk = 21;
    descripcion = "Un sable largo, util para peleas contra muchos enemigos. Daño 21, Precio 80.4";
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
