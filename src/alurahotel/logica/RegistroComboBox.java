
package alurahotel.logica;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.sql.Connection;

/**
 *
 * @author bjimenez
 */
public class RegistroComboBox {
    
    private Conexion conexion = new Conexion();
    
    
    
    public void cargarComboFormaPago(JComboBox comboPago) {
        Connection connection = conexion.estableceConexion();
    
        DefaultComboBoxModel comboFormaPago = new DefaultComboBoxModel();
        comboPago.setModel(comboFormaPago);
        ListadoFormaPago listadoFormaPago = new ListadoFormaPago();

        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select forma from FormasPago;");
        
        while(rs.next()) {
            FormaPago formaPago = new FormaPago();
            formaPago.setFormaPago(rs.getString(1));
            listadoFormaPago.AgregarFormaPago(formaPago);
            comboFormaPago.addElement(formaPago.getFormaPago());
            
        }
            
        rs.close();
        st.close();
        connection.close();  // Cierra la conexión cuando hayas terminado
    } catch(Exception e) {
        System.out.println("No se Logró: " + e);
        
    }
    
    conexion.Desconectar(); // Llamar al método para cerrar la conexión
}


public void cargarComboHabitacion(JComboBox comboHabitacion) {
    Connection connection = conexion.estableceConexion(); // Obtener la conexión
    
    DefaultComboBoxModel<String> comboTipoHabitacion = new DefaultComboBoxModel<>();
    comboHabitacion.setModel(comboTipoHabitacion);
    ListadoHabitacion listadoHabitacion = new ListadoHabitacion();
    
    try {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT tipo FROM Habitaciones");
        
        while(rs.next()) {
            Habitacion habitaciones = new Habitacion();
            habitaciones.setTipo(rs.getString("tipo")); // Usar el nombre de la columna
            listadoHabitacion.AgregarHabitaciones(habitaciones);
            comboTipoHabitacion.addElement(habitaciones.getTipo());
            
        }
        
        rs.close();
        st.close();
        connection.close(); // Cerrar la conexión
    } catch(Exception e) {
        System.out.println("No se Logró: " + e);
    }
}

}
