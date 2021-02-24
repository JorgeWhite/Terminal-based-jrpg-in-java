/**
 * Clase para una espada de marfil, implementa armas.
 */
public class Espada_Marfil implements Armas{
public String tipo;
public int precio;
public int atk;
public String descripcion;

    /**
     * Metodo para crear armas.
     */
    public void creaArmas(){
    tipo = "Espada de marfil.";
    precio = 70;
    atk = 22;
    descripcion = "Una espada con una decoracion muy buena, aunque su daño no es el mejor. Daño 22, Precio 70.";
}

    /**
     * Metodo para obtener el tipo de un arma.
     * @return
     */
    public String getTipo(){
    return tipo;
}

    /**
     * Metodo para obtener el precio de un arma
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
