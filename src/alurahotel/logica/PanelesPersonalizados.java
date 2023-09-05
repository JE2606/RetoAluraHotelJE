
package alurahotel.logica;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.List;
/**
 *
 * @author bjimenez
 */
public class PanelesPersonalizados {    
    private String message;
    private String title;
    private List<String> buttonLabels;
    private Icon customImage;
    private Color backgroundColor;

    public PanelesPersonalizados(String message, String title, List<String> buttonLabels, String imagePath, int imageWidth, int imageHeight) {
        this.message = message;
        this.title = title;
        this.buttonLabels = buttonLabels;
        this.customImage = loadImage(imagePath, imageWidth, imageHeight);
    }

    public int Mostrar() {
        UIManager.put("OptionPane.background", backgroundColor);

        Object[] options = buttonLabels.toArray();
        int result = JOptionPane.showOptionDialog(
                null,
                message,
                title,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                customImage,
                options,
                options[0]
        );

        return result;
    }

    private Icon loadImage(String path, int width, int height) {
        URL imageUrl = PanelesPersonalizados.class.getResource(path);

        if (imageUrl != null) {
            ImageIcon imageIcon = new ImageIcon(imageUrl);
            Image image = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(image);
        } else {
            System.err.println("No se pudo cargar la imagen desde: " + path);
            return null;
        }
    }
}
    

   

