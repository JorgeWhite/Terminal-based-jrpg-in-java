/**
 * Clase para una espada devoradora de sangre, implementa armas.
 */
public class Espada_Devoradora_Sangre implements Armas{
public String tipo;
public int precio;
public int atk;
public String descripcion;

    /**
     * Metodo para construir un arma.
     */
    public void creaArmas(){
    tipo = "Espada Devoradora de Sangre";
    precio = 200;
    atk = 50;
    descripcion = "Por algo tendra ese nombre, mejor no preguntes. Daño 50, Precio 200." ;
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
