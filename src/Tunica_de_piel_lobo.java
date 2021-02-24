/**
 * Clase de una tunica de piel de lobo, implementa atuendos.
 */
public class Tunica_de_piel_lobo implements Atuendos{
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
        tipo = "Tunica lobo";
        precio = 50;
        def = 5;
        atk = 0;
        eva = 20;
        descripcion = "Tunica hecha con piel de lobo.";

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
