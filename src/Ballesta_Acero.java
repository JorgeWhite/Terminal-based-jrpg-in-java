/**
 * Clase para una ballesta de acero, implementa armas.
 */
public class Ballesta_Acero implements Armas{
public String tipo;
public int precio;
public int atk;
public String descripcion;

    /**
     * Metodo para crear un arma.
     */
    public void creaArmas(){
    tipo = "Arma Ballesta de Acero";
    precio = 150;
    atk = 35;
    descripcion = "Una Ballesta al estilo Vanhellsing. Daño 35, Precio 150.";
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
