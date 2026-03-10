import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;

public class FrmJuego extends JFrame {
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

        JPanel pnlJugador1 = new JPanel();
        pnlJugador1.setBackground(new Color(0,255,0));
        JPanel pnlJugador2 = new JPanel();
        pnlJugador2.setBackground(new Color(0,255,255));

        tpJugadores.addTab("Martin Estrada contreras", pnlJugador1);
        tpJugadores.addTab("Raul Vidal", pnlJugador2);

        
        /* Acciones de los botones */
        btnRepartir.addActionListener(e -> {
            // Lógica para repartir cartas
        });

        btnVerificar.addActionListener(e -> {
            // Lógica para verificar el ganador
        });
    }

}
