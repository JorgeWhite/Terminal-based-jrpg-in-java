/**
 * Metodo para una espada arruinada, implementa armas.
 */
public class Espada_Arruinada implements Armas{
public String tipo;
public int precio;
public int atk;
public String descripcion;

    /**
     * Metodo para crear un arma.
     */
    public void creaArmas(){
    tipo = "Espada Arruinada";
    precio = 150;
    atk = 36;
    descripcion = "Pretenecipo a un rey que lo perdio todo, aun se escuchan sus gritos de sufrimiento. Daño 36, Precio 150.";
}

    /**
     * Metodo para obtener el tipo de un arma
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
