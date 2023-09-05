
package alurahotel.logica;

import javax.swing.JTable;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bjimenez
 */
public class Eliminar {
    
    Conexion conexion = new Conexion();
    
   public void BorrarFila(JTable tabla){
    conexion.estableceConexion();
    
    int fila = tabla.getSelectedRow();
    String numReserva = tabla.getValueAt(fila, 0).toString();
    
    try{
        // Eliminar registros relacionados en la tabla "Registro"
        String consultaEliminarRegistro = "DELETE FROM Registro WHERE numReserva = ?";
        PreparedStatement borrarRegistro = conexion.estableceConexion().prepareStatement(consultaEliminarRegistro);
        borrarRegistro.setString(1, numReserva);
        borrarRegistro.executeUpdate();
        
        // Luego, eliminar el registro de "Reserva"
        String consultaEliminarReserva = "DELETE FROM Reserva WHERE numReserva = ?";
        PreparedStatement borrarReserva = conexion.estableceConexion().prepareStatement(consultaEliminarReserva);
        borrarReserva.setString(1, numReserva);
        borrarReserva.executeUpdate();
         DefaultTableModel model = (DefaultTableModel) tabla.getModel();
         model.removeRow(fila);
        } catch (Exception e) {
        List<String> botones = Arrays.asList("Entendido");
        PanelesPersonalizados optionPane = new PanelesPersonalizados(
            "Error "+ e,
            "¡Error!",
            botones,
            "/alurahotel/imagenes/error.png",
            60,
            60
        );
        optionPane.Mostrar();
        }
    }

}
