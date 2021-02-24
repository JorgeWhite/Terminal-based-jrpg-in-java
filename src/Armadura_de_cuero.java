/**
 * Clase concreta de una armadura de cuero, implementa la interfaz de Atuendos.
 */
public class Armadura_de_cuero implements Atuendos{
    String tipo;
    int precio;
    int def;
    int atk;
    int eva;
    String descripcion;

    /**
     * Constructor de clase.
     */
    public void creaAtuendo(){
        tipo = "Armadura cuero";
        precio = 10;
        def = 10;
        atk = 0;
        eva = 1;
        descripcion = "Armadura hecha de cuero";
    }

    /**
     * Metodo para obtener el tipo de Atuendo.
     * @return
     */
    public String getTipo(){
        return tipo;
    }

    /**
     * Metodo para obtener el precio del Atuendo.
     * @return
     */
    public int getPrecio(){
        return precio;
    }

    /**
     * Metodo para obtener la defensa del atuendo.
     * @return
     */
    public int getDef(){
        return def;
    }

    /**
     * Metodo para obtener el ataque del atuendo.
     * @return
     */
    public int getAtk(){
        return atk;
    }

    /**
     * Metodo para obtener la evasion del atuendo.
     * @return
     */
    public int getEva(){
        return eva;
    }

    /**
     * Metodo para obtener la descripcion del atuendo
     * @return
     */
    public String getDescripcion(){
        return descripcion;
    }

}
