
package alurahotel.logica;

import alurahotel.Registro;
import alurahotel.Reserva;
import com.toedter.calendar.JDateChooser;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class GuardarReserva {
    
    private Reserva reserva;
    private Registro registro;
    Conexion conexion = new Conexion();
    
    public void Guardar(Date checkIn, Date checkOut, String tipoHabitacion, String comoPagar,
            double pago, int numReserva, JDateChooser jCheckIn, JDateChooser jCheckOut){
        
        reserva = new Reserva();
        registro = new Registro();
        int guardado;
        Date inputCheckIn = jCheckIn.getDate();
        Date inputCheckOut = jCheckOut.getDate();
        
        conexion.estableceConexion();
        
        if(inputCheckIn == null || inputCheckOut == null){
            
                List<String> botones = Arrays.asList("¡Entendido!");
                PanelesPersonalizados optionPane = new PanelesPersonalizados(
                "¡Por favor, completa todos los campos!",
                "Campos vacios",
                botones,
                "/alurahotel/imagenes/advertencia.png",
                60,
                60
                );
                optionPane.Mostrar();
                reserva.setVisible(true);
               
            
        }else{
        
        
            try{
            String consulta = "INSERT INTO Reserva (checkIn, checkOut, tipoHabitacion, formaPago, total, numReserva, fechaInsercion)" +
                               "VALUES(?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps =  conexion.estableceConexion().prepareStatement(consulta);
            
            ps.setDate(1, new java.sql.Date(checkIn.getTime()));
            ps.setDate(2, new java.sql.Date(checkOut.getTime()));
            ps.setString(3, tipoHabitacion);
            ps.setString(4, comoPagar);
            ps.setDouble(5, pago);
            ps.setInt(6,numReserva);
            ps.setTimestamp(7, new java.sql.Timestamp(System.currentTimeMillis()));
            
              
                
                 guardado = ps.executeUpdate();
                 
                 if(guardado > 0){
                 
                List<String> botones = Arrays.asList("Continuar");
                PanelesPersonalizados optionPane = new PanelesPersonalizados(
                "Los datos de la reserva han sido guardados correctamente.",
                "¡Guardado!",
                botones,
                "/alurahotel/imagenes/guardado.png",
                60,
                60
                );
                
                optionPane.Mostrar();
                registro.setVisible(true);
                reserva.setVisible(false);
            
                }else{
                
                    List<String> botones = Arrays.asList("Reintentar");
                    PanelesPersonalizados optionPane = new PanelesPersonalizados(
                    "¡Ups!",
                    "Los datos de la reserva no han sido guardados.",
                    botones,
                    "/alurahotel/imagenes/advertencia.png",
                    60,
                    60
                    );  
                    optionPane.Mostrar();
                }
               
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
        
        
        
    }
}
