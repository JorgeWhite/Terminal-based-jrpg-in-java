/**
 * Clase concreta de una armadura de escamas de dragon, implementa atuendos.
 */
public class Armadura_de_escamas_de_dragon implements Atuendos{
    String tipo;
    int precio;
    int def;
    int atk;
    int eva;
    String descripcion;

    /**
     * Metodo para construir un atuendo.
     */
    public void creaAtuendo(){
        tipo = "Armadura escama dragon";
        precio = 300;
        def = 60;
        atk = 0;
        eva = 30;
        descripcion = "Armadura hecha con escamas de dragon.";

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
