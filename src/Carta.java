import java.awt.event.MouseAdapter;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;

public class Carta {

    private int indice;

    public Carta(Random r){
        indice=r.nextInt(52)+1;

    }

    public void mostrar(JPanel pnl, int x, int y){
        String archivoImagen = "imagenes/CARTA" + indice + ".jpg";
        ImageIcon imgCarta = new ImageIcon(getClass().getResource(archivoImagen));
        JLabel lblCarta = new JLabel(imgCarta);
        pnl.add(lblCarta);
        lblCarta.setBounds(x, y, imgCarta.getIconWidth(), imgCarta.getIconHeight());

        
        lblCarta.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JOptionPane.showMessageDialog(null, " de " + getPinta());
            }
        });/* Agregar un MouseListener para mostrar la información de la carta al hacer clic */
    }

    public Pinta getPinta() {
        if (indice<=13)
            return Pinta.TREBOL;
        if (indice<=26)
            return Pinta.PICA;
        if (indice<=39)
            return Pinta.CORAZON;
        return Pinta.DIAMANTE;
    }
}
