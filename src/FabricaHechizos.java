/**
 * Clase para una fabrica de hechizos.
 */
public class FabricaHechizos extends AbstractFactory{
    /**
     * Metodo para obtener un hechizo hecho por una fabrica.
     * @param item
     * @return
     */
  public Hechizos getItem(String item){
      return getHechizo(item);
  }

    /**
     * Metodo para crear un hechizo.
     * @param Hechizo
     * @return
     */
  public Hechizos getHechizo(String Hechizo){
    if (Hechizo == null){
        return null;
    } else if (Hechizo.equalsIgnoreCase("hechizo_Envenenar")){
        return new Hechizo_Envenenar();
    } else if (Hechizo.equalsIgnoreCase("hechizo_Fuego")){
        return new Hechizo_Fuego();
    } else if (Hechizo.equalsIgnoreCase("hechizo_Hielo")){
        return new Hechizo_Hielo();
    }
    return null;
  }
}
