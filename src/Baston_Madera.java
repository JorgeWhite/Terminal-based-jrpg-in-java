/**
 * Clase para un baston de madera, implementa armas.
 */
public class Baston_Madera implements Armas{
public String tipo;
public int precio;
public int atk;
public String descripcion;

    /**
     * Metodo para crear un arma.
     */
    public void creaArmas(){
    tipo = "Baston de Madera";
    precio = 40;
    atk = 7;
    descripcion = "El bastón más simple para lanzar hechizos. Daño 7,Precio 40.";
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
