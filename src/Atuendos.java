/**
 * Interfaz para atuendos.
 */
public interface Atuendos {
    /**
     * Metodo para crear un atuendo.
     */
    void creaAtuendo();

    /**
     * Metodo para obtener el tipo de un atuendo
     * @return
     */
    String getTipo();

    /**
     * Metodo para obtener el precio de un atuendo.
     * @return
     */
    int getPrecio();

    /**
     * Metodo para obtener la defensa de un atuendo.
     * @return
     */
    int getDef();

    /**
     * Metodo para obtener el ataque de un atuendo.
     * @return
     */
    int getAtk();

    /**
     * Metodo para obtener la evasion de un atuendo.
     * @return
     */
    int getEva();

    /**
     * Metodo para obtener la descripcion de un atuendo.
     * @return
     */
    String getDescripcion();
}
