package alurahotel.logica;

import alurahotel.Menu;
import alurahotel.Registro;
import com.toedter.calendar.JDateChooser;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author bjimenez
 */
public class GuardarRegistro {
   
    private Registro registro;
    Conexion conexion = new Conexion();
    
    public void guardarRegistro(String id, String nombre, String apellidos, Date nacimiento,
        String telefono, int numReserva, JFrame jframe,
        JTextField fieldnombre, JTextField fieldapellido, JTextField fieldidentificacion,
        JLabel fieldnumeroReserva, JTextField fieldtelefono, JDateChooser jdate) {

        registro = new Registro();

        String inputNombre = fieldnombre.getText();
        String inputApellido = fieldapellido.getText();
        String inputIdentificacion = fieldidentificacion.getText();
        String inputTelefono = fieldtelefono.getText();
        Date inputDate = jdate.getDate();

        int guardado;
        conexion.estableceConexion();

        if (id.isEmpty() || inputNombre.isEmpty() || inputApellido.isEmpty() || inputIdentificacion.isEmpty() ||
            inputTelefono.isEmpty() || inputDate == null) {

            List<String> botones = Arrays.asList("¡Entendido!");
            PanelesPersonalizados optionPane = new PanelesPersonalizados(
                "¡Por favor, completa todos los campos, incluyendo ID!",
                "Campos vacíos",
                botones,
                "/alurahotel/imagenes/advertencia.png",
                60,
                60
            );
            optionPane.Mostrar();
            
            return; // Salir del método si algún campo obligatorio está vacío
        }

        try {
            
            String consulta = "INSERT INTO Registro (id, nombre, apellidos, fechaNacimiento, telefono, numReserva)" +
                "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conexion.estableceConexion().prepareStatement(consulta);

            ps.setString(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellidos);
            ps.setDate(4, new java.sql.Date(nacimiento.getTime()));
            ps.setString(5, telefono);
            ps.setInt(6, numReserva);

            guardado = ps.executeUpdate();

            if (guardado > 0) {
                List<String> botones = Arrays.asList("Continuar");
                PanelesPersonalizados optionPane = new PanelesPersonalizados(
                    "Los datos del registro han sido guardados correctamente.",
                    "¡Guardado!",
                    botones,
                    "/alurahotel/imagenes/guardado.png",
                    60,
                    60
                );

                int resultado = optionPane.Mostrar();
                if (resultado == 0) {
                    Menu menu = new Menu();
                    jframe.setVisible(false);
                    menu.setVisible(true);
                }
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción si la conversión de ID falla
            e.printStackTrace();
            List<String> botones = Arrays.asList("¡Entendido!");
            PanelesPersonalizados optionPane = new PanelesPersonalizados(
                "¡El valor en el campo ID no es válido!",
                "Valor no válido",
                botones,
                "/alurahotel/imagenes/advertencia.png",
                60,
                60
            );
            optionPane.Mostrar();
        } catch (Exception e) {
            e.printStackTrace();
            List<String> botones = Arrays.asList("¡Entendido!");
            PanelesPersonalizados optionPane = new PanelesPersonalizados(
                "Error:" + e,
                "Ups!",
                botones,
                "/alurahotel/imagenes/error.png",
                60,
                60
            );
            optionPane.Mostrar();
        }
    }
}
