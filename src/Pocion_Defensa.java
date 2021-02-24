/**
 * Clase para una pocion de defensa, implementa consumible.
 */
public class Pocion_Defensa implements Consumible{
    String tipo;
    int precio;
    int hp;
    int eva;
    int def;
    String descripcion;

    /**
     * Metodo para crear un consumible.
     */
    public void creaConsumible(){
        tipo = "Pocion de Defensa.";
        precio = 10;
        hp = 0;
        eva = 0;
        def = 1;
        descripcion = "Pocion para incrementar la defensa.";
    }

    /**
     * Metodo para obtener el tipo de un consumible.
     * @return
     */
    public String getTipo(){
        return tipo;
    }

    /**
     * Metodo para obtener el precio de un consumible.
     * @return
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Metood para obtener la defensa que otorga un consumible.
     * @return
     */
    public int getDef(){
        return def;
    }

    /**
     * Metodo para obtener el hp que otorga un consumible.
     * @return
     */
    public int getHp(){
        return hp;
    }

    /**
     * Metodo para obtener la evasion que otorga un consumible.
     * @return
     */
    public int getEva(){
        return eva;
    }

    /**
     * Metodo para obtener la descripcion de un consumible.
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }
}

