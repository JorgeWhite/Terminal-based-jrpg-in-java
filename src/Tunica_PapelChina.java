/**
 * Clase de una tunica de papel china.
 */
public class Tunica_PapelChina implements Atuendos{
    String tipo;
    int precio;
    int def;
    int atk;
    int eva;
    String descripcion;

    /**
     * Metodo para crear un atuendo.
     */
    public void creaAtuendo(){
        tipo = "Tunica papel china";
        precio = 10;
        def = 1;
        atk = 0;
        eva = 10;
        descripcion = "Tunica hecha con papel china";

    }
    /**
     * Metodo para obtener el tipo de atuendo.
     * @return
     */
    public String getTipo(){
        return tipo;
    }

    /**
     * Metodo para obtener el precio de un atuendo.
     * @return
     */
    public int getPrecio(){
        return precio;
    }

    /**
     * Metodo para obtener la defensa de un atuendo.
     * @return
     */
    public int getDef(){
        return def;
    }

    /**
     * Metodo para obtener el ataque de un atuendo.
     * @return
     */
    public int getAtk(){
        return atk;
    }

    /**
     * Metodo para obtener la evasion de un atuendo.
     * @return
     */
    public int getEva(){
        return eva;
    }

    /**
     * Metodo para obtener la descripcion de un atuendo.
     * @return
     */
    public String getDescripcion(){
        return descripcion;
    }
}
