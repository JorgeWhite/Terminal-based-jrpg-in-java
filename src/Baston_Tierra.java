/**
 * Clase de un baston de tierra, implementa armas.
 */
public class Baston_Tierra implements Armas{
public String tipo;
public int precio;
public int atk;
public String descripcion;

    /**
     * Metodo para crear un arma.
     */
    public void creaArmas(){
    tipo = "Baston de Tierra";
    precio = 100;
    atk = 25;
    descripcion = "Un baston de tierra, no se por que venden esto. Daño 25, Precio 100";
}

    /**
     * Metodo par obtener el tipo de un arma.
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
     * Metodo par obtener la descripcion de un arma.
     * @return
     */
    public String getDescripcion(){
    return descripcion;
  }
}
