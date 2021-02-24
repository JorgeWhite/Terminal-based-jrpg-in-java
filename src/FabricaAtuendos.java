/**
 * Clase concreta para una fabrica de armas.
 */
public class FabricaAtuendos extends AbstractFactory {
    /**
     * Metodo para fabricar un item.
     * @param item
     * @return
     */
    public Atuendos getItem(String item){
        return getAtuendo(item);
    }

    /**
     * Metodo para fabricar un atuendo.
     * @param atuendo
     * @return
     */
    public Atuendos getAtuendo(String atuendo){
        if (atuendo == null){
            return null;
        } else if (atuendo.equalsIgnoreCase("Armadura_cobre")){
            return new Armadura_de_cobre();
        } else if (atuendo.equalsIgnoreCase("Armadura_cuero")){
            return new Armadura_de_cuero();
        } else if (atuendo.equalsIgnoreCase("Armadura_dragon")){
            return new Armadura_de_escamas_de_dragon();
        } else if (atuendo.equalsIgnoreCase("Armadura_hierro")){
            return new Armadura_de_hierro();
        } else if (atuendo.equalsIgnoreCase("Armadura_laton")){
            return new Armadura_Laton();
        } else if (atuendo.equalsIgnoreCase("Armadura_marfil")){
            return new Armadura_de_marfil();
        } else if (atuendo.equalsIgnoreCase("Armadura_petrea")){
            return new Armadura_petrea();
        } else if (atuendo.equalsIgnoreCase("Tunica_china")){
            return new Tunica_PapelChina();
        } else if (atuendo.equalsIgnoreCase("Tunica_lobo")){
            return new Tunica_de_piel_lobo();
        } else if (atuendo.equalsIgnoreCase("Tunica_seda")){
            return new Tunica_de_seda();
        } else if (atuendo.equalsIgnoreCase("Tunica_zorro")){
            return new Tunica_de_zorro_dorado();
        }
        return null;
    }
}
