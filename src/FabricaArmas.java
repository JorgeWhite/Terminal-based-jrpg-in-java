/**
 * Clase para una fabrica de armas.
 */
public class FabricaArmas extends AbstractFactory{
    /**
     * Metodo para obtener un arma creada por la fabrica.
     * @param item
     * @return
     */
  public Armas getItem(String item){
    return getArmas(item);
  }

    /**
     * Metodo para crear un arma.
     * @param Armas
     * @return
     */
  public Armas getArmas(String Armas){
    if (Armas == null){
        return null;
    } else if (Armas.equalsIgnoreCase("arco_Marfil")){
        return new Arco_Marfil();
    } else if (Armas.equalsIgnoreCase("ballesta_Acero")){
        return new Ballesta_Acero();
    } else if (Armas.equalsIgnoreCase("baston_Agua")){
        return new Baston_Agua();
    } else if (Armas.equalsIgnoreCase("baston_Aire")){
        return new Baston_Aire();
    } else if (Armas.equalsIgnoreCase("baston_Madera")){
        return new Baston_Madera();
    } else if(Armas.equalsIgnoreCase("baston_Tierra")){
        return  new Baston_Tierra();
    } else if(Armas.equalsIgnoreCase("espada_Arruinada")){
        return  new Espada_Arruinada();
    } else if(Armas.equalsIgnoreCase("espada_Devoradora_Sangre")){
        return  new Espada_Devoradora_Sangre();
    } else if(Armas.equalsIgnoreCase("espada_Madera")){
        return  new Espada_Madera();
    } else if(Armas.equalsIgnoreCase("espada_Marfil")){
        return  new Espada_Marfil();
    } else if(Armas.equalsIgnoreCase("kusurigama")){
        return  new Kusurigama();
    } else if(Armas.equalsIgnoreCase("naginata")){
        return  new Naginata();
    } else if(Armas.equalsIgnoreCase("nunchaku_Madera")){
        return  new Nunchaku_Madera();
    } else if(Armas.equalsIgnoreCase("pistola_OldWest")){
        return  new Pistola_OldWest();
    } else if(Armas.equalsIgnoreCase("resortera")){
        return  new Resortera();
    } else if(Armas.equalsIgnoreCase("tetsubo_Oni")){
        return  new Tetsubo_Oni();
    }
    return null;
  }
}
