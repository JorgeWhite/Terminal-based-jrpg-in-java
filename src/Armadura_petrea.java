/**
 * Clase concreta para una armadura petrea, implementa de atuendos.
 */
public class Armadura_petrea implements Atuendos{
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
        tipo = "Armadura petrea";
        precio = 150;
        def = 35;
        atk = 0;
        eva = 15;
        descripcion = "Armadura petrea.";

    }

    /**
     * Metodo para obtener el tipo de un atuendo.
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
