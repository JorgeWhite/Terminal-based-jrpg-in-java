/**
 * Clase de un hechizo de hielo, implementa hechizos.
 */
public class Hechizo_Hielo implements Hechizos{
  public String tipo;
  public int precio;
  public int atk;
  public String descripcion;

    /**
     * Metodo para crear un hechizo.
     */
  public void creaHechizo(){
      tipo = "Hechizo Hielo";
      precio = 60;
      atk = 12 ;
      descripcion = "Espero que tengan sus abrigos puestos... Daño 12, Precio 60." ;
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
