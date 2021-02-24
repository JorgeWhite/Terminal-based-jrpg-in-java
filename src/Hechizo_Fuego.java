/**
 * Clase de un hechizo de fuego, implementa hechizos.
 */
public class Hechizo_Fuego implements Hechizos{
  public String tipo;
  public int precio;
  public int atk;
  public String descripcion;

    /**
     * Metodo para crear un hechizo.
     */
  public void creaHechizo(){
      tipo = "Hechizo de Fuego";
      precio = 90;
      atk = 18;
      descripcion = "Quemar enemigos, que original. Dano 18, Precio 90.";
  }

    /**
     * Metodo para obtener el tipo de un hechizo.
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
