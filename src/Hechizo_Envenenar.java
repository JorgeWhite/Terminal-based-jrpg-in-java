/**
 * Clase para un hechizo envenenar, implementa hechizos.
 */
public class Hechizo_Envenenar implements Hechizos{
  public String tipo;
  public int precio;
  public int atk;
  public String descripcion;

    /**
     * Metodo para crear un hechizo.
     */
  public void creaHechizo(){
      tipo = "Hechizo Envenenar";
      precio = 40;
      atk = 10;
      descripcion = "Envenena a tus enemigos. Daño 10, Precio 40.";
  }

    /**
     * Metodo para obtener el tipo de hechizo.
     * @return
     */
  public String getTipo(){
      return tipo;
  }

    /**
     * Metodo para obtener el precio de un hechizo.
     * @return
     */
  public int getPrecio(){
      return precio;
  }

    /**
     * Metodo para obtener el ataque de un hechizo.
     * @return
     */

  public int getAtk(){
      return atk;
  }

    /**
     * Metodo para obtener la descripcion de un hechizo.
     * @return
     */
  public String getDescripcion(){
      return descripcion;
  }
}
