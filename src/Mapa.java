import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Class Mapa. Clase que modela las caracteristicas de un mapa para el RPG.
 */
public class Mapa {
    int alto;
    int ancho;
    int posicionX;
    int posicionY;
    int[][] mapaActual;
    int posicionTiendaX;
    int posicionTiendaY;
    int posicionSalidaX;
    int posicionSalidaY;

    /**
     * Constructor de la clase Mapa.
     * @param alto . Las casillas de alto que tendra el mapa.
     * @param ancho . Las casillas de ancho que tendra el mapa.
     */
    public Mapa(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
        posicionX = 0;
        posicionY = 0;
        mapaActual = new int[alto][ancho];
    }

    /**
     * Crea el mapa inicial del juego con sus componentes.
     */
    public void mapaDefault(){
        ponerPared(0, 2);
        ponerPared(0, 12);

        ponerPared(1, 2);
        ponerPared(1, 6);
        ponerPared(1, 9);
        ponerPared(1, 12);

        ponerPared(2, 2);
        ponerPared(2, 6);
        ponerPared(2, 8);
        ponerPared(2, 9);
        ponerPared(2, 12);
        ponerPared(2, 13);
        ponerPared(2, 14);
        ponerPared(2, 15);
        ponerPared(2, 16);

        ponerPared(3, 2);
        ponerPared(3, 6);
        ponerPared(3, 10);
        ponerPared(3, 14);

        ponerPared(4, 2);
        ponerPared(4, 4);
        ponerPared(4, 5);
        ponerPared(4, 6);
        ponerPared(4, 7);
        ponerPared(4, 8);
        ponerPared(4, 10);
        ponerPared(4, 14);

        ponerPared(5, 10);
        ponerPared(5, 11);
        ponerPared(5, 12);
        ponerPared(5, 13);
        ponerPared(5, 14);
        ponerPared(5, 15);
        ponerPared(5, 16);

        ponerPared(6, 0);
        ponerPared(6, 1);
        ponerPared(6, 2);
        ponerPared(6, 3);
        ponerPared(6, 4);
        ponerPared(6, 5);
        ponerPared(6, 8);
        ponerPared(6, 9);
        ponerPared(6, 10);
        ponerPared(6, 12);
        ponerPared(6, 14);
        ponerPared(6, 18);

        ponerPared(7, 8);
        ponerPared(7, 12);
        ponerPared(7, 14);
        ponerPared(7, 18);

        ponerPared(8, 2);
        ponerPared(8, 3);
        ponerPared(8, 4);
        ponerPared(8, 5);
        ponerPared(8, 8);
        ponerPared(8, 11);
        ponerPared(8, 12);
        ponerPared(8, 14);
        ponerPared(8, 16);
        ponerPared(8, 17);
        ponerPared(8, 18);
        ponerPared(8, 19);
        
        ponerPared(9, 5);
        ponerPared(9, 8);
        ponerPared(9, 9);
        ponerPared(9, 10);
        ponerPared(9, 14);
        ponerPared(9, 18);

        ponerPared(10, 3);
        ponerPared(10, 5);
        ponerPared(10, 18);

        ponerPared(11, 3);
        ponerPared(11, 7);
        ponerPared(11, 8);
        ponerPared(11, 11);
        ponerPared(11, 12);
        ponerPared(11, 13);
        ponerPared(11, 14);

        ponerPared(12, 3);
        ponerPared(12, 8);
        ponerPared(12, 13);

        ponerPared(13, 3);
        ponerPared(13, 5);
        ponerPared(13, 6);
        ponerPared(13, 7);
        ponerPared(13, 8);
        ponerPared(13, 13);
        ponerPared(13, 16);
        ponerPared(13, 17);
        ponerPared(13, 18);
        ponerPared(13, 19);

        ponerPared(14, 0);
        ponerPared(14, 1);
        ponerPared(14, 2);
        ponerPared(14, 10);
        ponerPared(14, 13);
        ponerPared(14, 18);

        ponerPared(15, 3);
        ponerPared(15, 4);
        ponerPared(15, 5);
        ponerPared(15, 6);
        ponerPared(15, 7);
        ponerPared(15, 10);
        ponerPared(15, 13);
        ponerPared(15, 18);

        ponerPared(16, 7);
        ponerPared(16, 8);
        ponerPared(16, 10);
        ponerPared(16, 13);
        ponerPared(16, 18);

        ponerPared(17, 0);
        ponerPared(17, 1);
        ponerPared(17, 2);
        ponerPared(17, 3);
        ponerPared(17, 4);
        ponerPared(17, 5);
        ponerPared(17, 6);
        ponerPared(17, 7);
        ponerPared(17, 8);
        ponerPared(17, 10);
        ponerPared(17, 12);
        ponerPared(17, 13);
        ponerPared(17, 14);
        ponerPared(17, 15);

        ponerPared(18, 8);
        ponerPared(18, 17);

        ponerPared(19, 8);
        ponerPared(19, 17);
    }

    /**
     * Metodo que obstruye con una pared al mapa, se usa el numero 1.
     * @param i coordenada x donde se ubicara la pared.
     * @param j coordenada y donde se ubicara la pared.
     */
    public void ponerPared(int i, int j){
        mapaActual[i][j] = 1;
    }

    /**
     * Remplaza un espacio de mapa y lo pone libre, se usa el numero 0.
     * @param i . Coordenada x de la pared a quitar.
     * @param j . Coordenada y de la pared a quitar.
     */
    public void quitarPared(int i, int j){
        mapaActual[i][j] = 0;
    }

    /**
     * Mueve al personaje a la derecha en el mapa.
     * @param x . Casillas a avanzar hacia la derecha.
     */
    public void moverPosicionDerecha(int x){
        if (x + posicionY > ancho){
            return;
        }
        for(int i = 0; i < x; i++){
            if (mapaActual[posicionX][posicionY + i] == 1){
                return;
            }
        }
        posicionY = posicionY + x;
    }

    /**
     * Mueve al personaje a la derecha en el mapa.
     * @param x . Casillas a avanzar hacia la derecha.
     */
    public void moverPosicionIzquierda(int x){
        if (posicionY - x < 0){
            return;
        }
        for(int i = 0; i < x; i++){
            if (mapaActual[posicionX][posicionY - i] == 1){
                return;
            }
        }
        posicionY = posicionY - x;
    }

    /**
     * Mueve al personaje hacia arriba en el mapa.
     * @param y . Casillas a avanzar hacia arriba.
     */
    public void moverPosicionArriba(int y){
        if (posicionX - y < 0){
            return;
        }
        for(int i = 0; i < y; i++){
            if (mapaActual[posicionX - i][posicionY] == 1){
                return;
            }
        }
        posicionX = posicionX - y;
    }

    /**
     * Mueve al personaje abajo en el mapa.
     * @param y . Casillas a avanzar hacia abajo.
     */
    public void moverPosicionAbajo(int y){
        if (posicionX + y > alto){
            return;
        }
        for(int i = 0; i < y; i++){
            if (mapaActual[posicionX + i][posicionY] == 1){
                return;
            }
        }
        posicionX = posicionX + y;
    }

    /**
     * Metodo para calcular los espacios libres a la derecha a partir de la posicion actual.
     * @return 
     */
    public int espaciosDerecha(){
        int espacios = 0;
        for (int i = 1; i < ancho; i++){
            if (posicionY + i < ancho){
                if (mapaActual[posicionX][posicionY + i] == 0){
                    espacios += 1;
                } else {
                    return espacios;
                }
            } else {
                return espacios;
            }
        }
        return espacios;
    }

    /**
     * Metodo para calcular los espacios libres a la izquierda a partir de la posicion actual.
     * @return
     */
    public int espaciosIzquierda(){
        int espacios = 0;
        for (int i = 1; i < ancho; i++){
            if (posicionY - i >= 0){
                if (mapaActual[posicionX][posicionY - i] == 0){
                    espacios += 1;
                } else {
                    return espacios;
                }
            } else {
                return espacios;
            }
        }
        return espacios;
    }

    /**
     * Metodo para calcular los espacios libres hacia arriba a partir de la posicion actual.
     * @return
     */
    public int espaciosArriba(){
        int espacios = 0;
        for (int i = 1; i < ancho; i++){
            if (posicionX - i >= 0){
                if (mapaActual[posicionX - i][posicionY] == 0){
                    espacios += 1;
                } else {
                    return espacios;
                }
            } else {
                return espacios;
            }
        }
        return espacios;
    }

    /**
     * Metodo para calcular los espacios libres al sur a partir de la posicion actual.
     * @return
     */
    public int espaciosAbajo(){
        int espacios = 0;
        for (int i = 1; i < ancho; i++){
            if (posicionX + i < alto){
                if (mapaActual[posicionX + i][posicionY] == 0){
                    espacios += 1;
                } else {
                    return espacios;
                }
            } else {
                return espacios;
            }
        }
        return espacios;
    }

    /**
     * Metodo para mostrar una representacion del mapa.
     */
    public void mostrarMapa(){
        mapaActual[posicionX][posicionY] = 9;
        for (int i = 0; i < alto; i++){
            System.out.println(Arrays.toString(mapaActual[i]));
        }
        mapaActual[posicionX][posicionY] = 0;
        setTienda(posicionTiendaX, posicionTiendaY);
    }

    /**
     * Metodo para generar de manera aleatoria enemigos.
     */
    public ArrayList<Enemigo> generarEnemigo(int dificultad){
        // Se genera un random para saber si hay enemigos en esa posicion.
        Random randomHayEnemigos = new Random();
        int hayEnemigos = randomHayEnemigos.nextInt(2);

        if (hayEnemigos == 0){    // 0 -- Hay enemigos
            ArrayList<Enemigo> listaEnemigos = new ArrayList<>();
            Generador generador = new Generador();
            BDEnemigos bdEnemigos = new BDEnemigos();

            // Se genera un random para saber el numero de enemigos.
            Random randNumEnemigos = new Random();
            int numEnemigos = randNumEnemigos.nextInt(3) + 1;
            for (int i = 0; i < numEnemigos; i++){
                Enemigo enemigo = generador.getEnemigo(bdEnemigos, dificultad);
                listaEnemigos.add(enemigo);
            }
            return listaEnemigos;
        }
        return null;
    }
    /**
     * Metodo para asignar la posicion de la tienda.
     */
    public void setTienda(int posX, int posY){
        posicionTiendaX = posX;
        posicionTiendaY = posY;
        mapaActual[posX][posY] = 5;
    }

    /**
     * Metodo para asignar la posicion de la salida del laberinto.
     */
    public void setSalida(int posX, int posY){
        posicionSalidaX = posX;
        posicionSalidaY = posY;
        mapaActual[posX][posY] = 7;
    }

    /**
     * Metodo para revisar si el personaje llego a la tienda.
     **/
    public boolean llegoTienda(){
        return (posicionX == posicionTiendaX && posicionY == posicionTiendaY);
    }

    /**
     * Metodo para revisar si el personaje llego a la salida.
     */
    public boolean llegoSalida(){
        return posicionX == posicionSalidaX && posicionY == posicionSalidaY;
    }




}
