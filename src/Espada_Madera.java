/**
 * Clase de una espada de madera, implementa armas.
 */
public class Espada_Madera implements Armas{
public String tipo;
public int precio;
public int atk;
public String descripcion;

    /**
     * Metodo para crear un arma.
     */
    public void creaArmas(){
    tipo = "Espada de madera.";
    precio = 30;
    atk = 10;
    descripcion = "La espada de madera, simple, pero, nah la verdad no sirve mucho. Daño 10, Precio 30.";
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
