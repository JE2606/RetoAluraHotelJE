
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
public class TablaRegistro {
    Conexion conexion = new Conexion();
    
    public void PropiedadesTabla(JTable jtable){
        conexion.estableceConexion();
        
        String[] columnas = {"ID", "Nombre", "Apellidos", "Fecha de Nacimiento", "Teléfono", "Número de Reserva"};
        DefaultTableModel dft = new DefaultTableModel(null, columnas);
        
        
       try{
           
       String consulta = "SELECT * FROM Registro"; 
       PreparedStatement ps = conexion.estableceConexion().prepareStatement(consulta);
       ResultSet rs = ps.executeQuery();
       
       while(rs.next()){
           Object Filas[] = {rs.getString("id"), rs.getString("nombre"), rs.getString("apellidos"),
                                rs.getString("fechaNacimiento"),rs.getString("telefono"), rs.getString("numReserva")};
                                
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
    
    public void buscarRegistros(JTable jtable, String criterio) {
    conexion.estableceConexion();
    
    String[] columnas = {"ID", "Nombre", "Apellidos", "Fecha de Nacimiento", "Teléfono", "Número de Reserva"};
    DefaultTableModel dft = new DefaultTableModel(null, columnas);
    
    try {
        String consulta = "SELECT * FROM Registro WHERE nombre LIKE ? OR apellidos LIKE ?";
        PreparedStatement ps = conexion.estableceConexion().prepareStatement(consulta);
        ps.setString(1, "%" + criterio + "%"); // Usamos % para buscar coincidencias parciales
        ps.setString(2, "%" + criterio + "%");
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Object fila[] = {rs.getString("id"), rs.getString("nombre"), 
                rs.getString("apellidos"), rs.getString("fechaNacimiento"), rs.getString("telefono"), 
                rs.getString("numReserva")};
            
            dft.addRow(fila);
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
