
package alurahotel.logica;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author bjimenez
 */
public class PrecioReserva {

    private Conexion conexion = new Conexion();
   
    public double ObtenerPrecio(String tipoHabitacion){
        conexion.estableceConexion();
        double precio = 0.0; 
        try{
            String consulta = "SELECT precio FROM Habitaciones WHERE Habitaciones.tipo = ?;";
            PreparedStatement ps = conexion.estableceConexion().prepareStatement(consulta);
            ps.setString(1, tipoHabitacion);
            ResultSet resultSet = ps.executeQuery();
           
            if(resultSet.next()){
                precio = resultSet.getDouble("precio");
               
            }    
           
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
            return precio;
    }
        
    public double calcularCosto(Date checkIn, Date checkOut,String tipoHabitacion){
        long diferenciaFechas = checkIn.getTime() - checkOut.getTime();
        double diferenciaDias = (diferenciaFechas/ (24*60*60*1000) * -1);
            
        double precioPorDia = ObtenerPrecio(tipoHabitacion);
        double precioTotal = precioPorDia * diferenciaDias;
            
        return precioTotal;
    }
   
}    
