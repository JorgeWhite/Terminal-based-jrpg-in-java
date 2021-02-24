/**
 * Clase concreta para una armadura de laton, implementa atuendos.
 */
public class Armadura_Laton implements Atuendos{
    String tipo;
    int precio;
    int def;
    int atk;
    int eva;
    String descripcion;

    /**
     * Metodo para constuir un atuendo.
     */
    public void creaAtuendo(){
        tipo = "Armadura laton";
        precio = 125;
        def = 30;
        atk = 0;
        eva = 10;
        descripcion = "Armadura hecha de laton.";

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
     * Metodo para obtener la defensa de un atuendo.
     * @return
     */
    public String getDescripcion(){
        return descripcion;
    }
}
