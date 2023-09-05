
package alurahotel.logica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author bjimenez
 */
public class ObtenerReserva{
    private Conexion conexion = new Conexion();
    
    public void Setearnumero(JLabel jlabel){
        conexion.estableceConexion();
        try{
            
            String consulta = "SELECT numReserva FROM Reserva ORDER BY fechaInsercion DESC LIMIT 1;";
            PreparedStatement ps = conexion.estableceConexion().prepareStatement(consulta);
            ResultSet resultSet = ps.executeQuery();
            
            if (resultSet.next()) {
                int numeroReserva = resultSet.getInt("numReserva");
                jlabel.setText("" + numeroReserva);
            }
            resultSet.close();
            ps.close();
            conexion.Desconectar();
        }catch(SQLException e){
                  
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
