
package alurahotel.logica;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author bjimenez
 */

//Editor de imagenes, para que queden perfectamente ajustadas a cualquier JLabel
public class Editor {
    private ImageIcon imagen;
    private Icon icono;
    
    public void ajustarImagen(JLabel lbl, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(),
                        lbl.getHeight(),
                        Image.SCALE_SMOOTH
                )
        );
        lbl.setIcon(this.icono);
        lbl.repaint();
    }
}
