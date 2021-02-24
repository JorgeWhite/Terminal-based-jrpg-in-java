/**
 * Clase de un baston de aire, implementa un arma.
 */
public class Baston_Aire implements Armas{
public String tipo;
public int precio;
public int atk;
public String descripcion;

    /**
     * Metodo para crear un arma.
     */
    public void creaArmas(){
    tipo = "Baston de Aire";
    precio = 120;
    atk = 33;
    descripcion = "Un baston de aire, es magnifico. Daño 33, Precio 120.";
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
