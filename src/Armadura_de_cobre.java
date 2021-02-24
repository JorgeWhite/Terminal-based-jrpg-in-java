/**
 * Clase concreta para una armadura de cobre, implementa de atuendos.
 */
public class Armadura_de_cobre implements Atuendos{
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
        tipo = "Armadura de cobre";
        precio = 25;
        def = 10;
        atk = 0;
        eva = 5;

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
        return "Armadura hecha de cobre.";
    }
}
