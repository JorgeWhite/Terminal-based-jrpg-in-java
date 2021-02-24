/**
 * Clase de un baston de agua, implementa armas.
 */
public class Baston_Agua implements Armas{
  public String tipo;
  public int precio;
  public int atk;
  public String descripcion;

    /**
     * Metodo para crear un arma.
     */
  public void creaArmas(){
    tipo = "Arma Baston de Agua";
    precio =70 ;
    atk = 15;
    descripcion = "Un baston de agua, no se como mantiene su forma. Daño 15,Precio70.";
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
     * Metodo par obtener el ataque de un arma.
     * @return
     */
    public int getAtk(){
    return atk;
}

    /**
     * Metodo para obtener la descripcion de un arma
     * @return
     */
    public String getDescripcion(){
    return descripcion;
  }
}
