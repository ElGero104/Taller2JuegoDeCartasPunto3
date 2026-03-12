import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
public class FrmJuego extends JFrame {
    private JPanel pnlJugador1, pnlJugador2;
    private Jugador jugador1 = new Jugador();
    private Jugador jugador2 = new Jugador();

    public FrmJuego() { /* Constructor */
        setTitle("Juguemos al Apuntado");
        setSize(500, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
        setLayout(null);

        JButton btnRepartir = new JButton("Repartir");
        btnRepartir.setBounds(10, 10, 100, 25);
        add(btnRepartir);

        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(120, 10, 100, 25);
        add(btnVerificar);

        JTabbedPane tpJugadores= new JTabbedPane(); /* Panel de pestañas para los jugadores */
        tpJugadores.setBounds(10, 50, 460, 200);
        add(tpJugadores);

        pnlJugador1 = new JPanel();
        pnlJugador1.setLayout(null);
        pnlJugador1.setBackground(new Color(0,255,0));

        pnlJugador2 = new JPanel();
        pnlJugador2.setLayout(null);
        pnlJugador2.setBackground(new Color(0,255,255));

        tpJugadores.addTab("Martin Estrada contreras", pnlJugador1);
        tpJugadores.addTab("Raul Vidal", pnlJugador2);
        
        btnRepartir.addActionListener(e -> {
            repartir();

        });

        
        
        
    }

    private void repartir() {
        jugador1.repartir();
        jugador2.repartir();
        jugador1.mostrar(pnlJugador1, 10, 10);
        jugador2.mostrar(pnlJugador2, 10, 10);
    }

}
