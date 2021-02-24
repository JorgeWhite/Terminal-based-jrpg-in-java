import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Se inicializa el mapa que tendra el juego.
        Mapa mapa = new Mapa(20, 20);
        mapa.mapaDefault();
        mapa.ponerPared(2,5);

        // Se inicializa el generador de enemigos.
        Generador generador = new Generador();
        // Se inicializan las bases de datos con los objetos y enemigos.
        BDEnemigos bdEnemigos = new BDEnemigos();

        System.out.println("Bienvenido a este JRPG.");
        System.out.println("Tu aventura empieza aqui");
        System.out.println("Elige un nombre para tu personaje.");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        // Se inicializa un nuevo personaje (en un principio se inicializa con un caballero pero despues
        // cambia con la eleccion del usuario.
        Personaje p = new Caballero(nombre);

        // Se inicializa la clase JRPG que sera la encargada de llevar a cabo las acciones dentro del juego.
        JRPG juego = new JRPG(p, mapa);

        System.out.println(nombre + ", tu objetivo es salir de este laberinto.");
        juego.iniciarJuego();



    }
}
