import java.util.Random;
import javax.swing.JPanel;

public class Jugador {
    private final int TOTAL_CARTAS = 10;
    private final int MARGEN_SUPERIOR = 10;
    private final int MARGEN_IZQUIERDA = 10;
    private final int DISTANCIA =40;
    private Carta[] cartas = new Carta[TOTAL_CARTAS];
    

    private Random r = new Random();

    public void repartir() {
        for (int i = 0; i < cartas.length; i++) { /* Repartir cartas */
            cartas[i] = new Carta(r);
        }
    
    }

    public void mostrar(JPanel pnl, int x, int y) {
        pnl.removeAll(); /* Limpiar el panel antes de mostrar las cartas */
        int posicion = MARGEN_IZQUIERDA+DISTANCIA*(TOTAL_CARTAS-1); /* Calcular la posición inicial para centrar las cartas */
        for (Carta carta: cartas) { /* Mostrar las cartas en el panel */
            carta.mostrar(pnl, posicion, MARGEN_SUPERIOR);
            posicion -= DISTANCIA;
        }
        pnl.repaint(); /* Refrescar el panel para mostrar las cartas */
        
    }


}
