/**
 * Interfaz para objetos consumibles.
 */
public interface Consumible {
    /**
     * Metodo para crear un consumible.
     */
    void creaConsumible();

    /**
     * Metodo para obtener el tipo de un consumible.
     * @return
     */
    String getTipo();

    /**
     * Metodo para obtener el precio de un consumible.
     * @return
     */
    int getPrecio();

    /**
     * Metodo para obtener la defensa que otorga un consumible.
     * @return
     */
    int getDef();

    /**
     * Metodo para obtener la evasion que otorga un consumible.
     * @return
     */
    int getEva();

    /**
     * Metodo para obtener el hp que otorga un consumible.
     * @return
     */
    int getHp();

    /**
     * Metodo para obtener la descripcion de un consumible.
     * @return
     */
    String getDescripcion();
}
