
package alurahotel.logica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bjimenez
 */
public class TablaReserva {
    
    Conexion conexion = new Conexion();
    
    public void LLenadoTabla(JTable jtable){
        conexion.estableceConexion();
        
        String[] columnas = {"Numero de Reserva", "Check In", "Check Out", "Tipo de Habitacion",
                                "Forma de Pago", "Total"};
        DefaultTableModel dft = new DefaultTableModel(null, columnas);
        
        
       try{
           
       String consulta = "SELECT * FROM Reserva"; 
       PreparedStatement ps = conexion.estableceConexion().prepareStatement(consulta);
       ResultSet rs = ps.executeQuery();
       
       while(rs.next()){
           Object Filas[] = {rs.getString("numReserva"), rs.getString("checkIn"), rs.getString("checkOut"),
                                rs.getString("tipoHabitacion"),rs.getString("formaPago"), rs.getString("total")};
                                
           dft.addRow(Filas);
       }
       
       dft.setColumnIdentifiers(columnas);
       jtable.setModel(dft);
       
       }catch(Exception e){
       
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
    
    public void buscarReserva(JTable jtable, String criterio) {
    conexion.estableceConexion();
    
   String[] columnas = {"Numero de Reserva", "Check In", "Check Out", "Tipo de Habitacion",
                                "Forma de Pago", "Total"};
    DefaultTableModel dft = new DefaultTableModel(null, columnas);
    
    try {
        String consulta = "SELECT * FROM Reserva WHERE numReserva LIKE ? OR tipoHabitacion LIKE ?";
        PreparedStatement ps = conexion.estableceConexion().prepareStatement(consulta);
        ps.setString(1, "%" + criterio + "%");
        ps.setString(2, "%" + criterio + "%");
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Object Filas[] = {rs.getString("numReserva"), rs.getString("checkIn"), rs.getString("checkOut"),
                                rs.getString("tipoHabitacion"),rs.getString("formaPago"), rs.getString("total")};
                                
           dft.addRow(Filas);
        }
        
        dft.setColumnIdentifiers(columnas);
        jtable.setModel(dft);
    } catch (Exception e) {
        // Manejo de errores
        e.printStackTrace();
        List<String> botones = Arrays.asList("¡Entendido!");
        PanelesPersonalizados optionPane = new PanelesPersonalizados(
            "Error: " + e,
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
