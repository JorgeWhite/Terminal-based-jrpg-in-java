/**
 * Clase para un elixir de hp, implementa consumible.
 */
public class Elixir_Hp implements Consumible{
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
        tipo = "Elixir de HP.";
        precio = 25;
        hp = 300;
        eva = 0;
        def = 0;
        descripcion = "Elixir para aumentar el HP en 300 puntos.";
    }

    /**
     * Metodo para obtener el tipo de un consumible.
     * @return
     */
    public String getTipo(){
        return tipo;
    }

    /**
     * Metodo para obtener el precio de un consumible
     * @return
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Metodo para obtener la defensa que otorga un consumible
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

