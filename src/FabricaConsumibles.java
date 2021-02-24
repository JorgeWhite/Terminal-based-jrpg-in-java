/**
 * Clase concreta para una fabrica de consumibles.
 */
public class FabricaConsumibles extends AbstractFactory {
    /**
     * Metodo para fabricar un item.
     * @param item
     * @return
     */
    public Consumible getItem(String item){
        return getConsumible(item);
    }

    /**
     * Metodo para fabricar un consumible.
     * @param consumible
     * @return
     */
    public Consumible getConsumible(String consumible){
        if (consumible == null){
            return null;
        } else if (consumible.equalsIgnoreCase("Elixir_defensa")){
            return new Elixir_Defensa();
        } else if (consumible.equalsIgnoreCase("Elixir_evasion")){
            return new Elixir_Evasion();
        } else if (consumible.equalsIgnoreCase("Elixir_Hp")){
            return new Elixir_Hp();
        } else if (consumible.equalsIgnoreCase("Pocion_defensa")){
            return new Pocion_Defensa();
        } else if (consumible.equalsIgnoreCase("Pocion_evasion")){
            return new Pocion_Evasion();
        } else if (consumible.equalsIgnoreCase("Pocion_Hp")){
            return new Pocion_Hp();
        }
        return null;
    }
}
