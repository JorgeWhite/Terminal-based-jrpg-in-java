public class Arco_Marfil implements Armas{

  public String tipo;

  public int precio;

  public int atk;

  public String descripcion;

  public void creaArmas(){
    tipo = "Arma Arco de Marfil";
    precio =100 ;
    atk = 20;
    descripcion = "Un Arco con un buen acabado, grato para la vista. Daño 20, Precio 100. ";
  }

  public String getTipo(){
    return tipo;
  }

  public int getPrecio(){
      return precio;
  }

  public int getAtk(){
      return atk;
  }

  public String getDescripcion(){
      return descripcion;
  }
}
