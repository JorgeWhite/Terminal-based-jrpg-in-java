/**
 * Clase para una fabrica de fabricas.
 */
public class FactoryProducer{
	/**
	 * Metodo para crear una fabrica.
	 * @param opcion
	 * @return
	 */
	public static AbstractFactory getFactory(String opcion){
			if(opcion.equalsIgnoreCase("armas")){
				return new FabricaArmas();
			}	else if(opcion.equalsIgnoreCase("hechizos")){
				return new FabricaHechizos();
			} else if (opcion.equalsIgnoreCase("consumibles")){
				return new FabricaConsumibles();
			} else if (opcion.equalsIgnoreCase("atuendos")){
				return new FabricaAtuendos();
			}
		return null;
	}
}
