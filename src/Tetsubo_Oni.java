/**
 * Clase de un tetsubo oni, implementa armas.
 */
public class Tetsubo_Oni implements Armas{
  public String tipo;
  public int precio;
  public int atk;
  public String descripcion;

  /**
   * Metodo para crear armas.
   */
  public void creaArmas(){
    tipo = "Arma Tetsubo Oni";
    precio = 170;
    atk = 50;
    descripcion = "El arma de un viejo demonio, nada mal. Daño 50, Precio 170.";
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
