package alurahotel.logica;

import javax.swing.JTable;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class EditarTabla {

    TablaReserva tablaReserva = new TablaReserva();
    Conexion conexion = new Conexion();

    public void actualizarReserva(JTable tabla) {

        conexion.estableceConexion();

        int fila = tabla.getSelectedRow();

        int id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());

        String fechaCheckIn = tabla.getValueAt(fila, 1).toString();
        String fechaCheckOut = tabla.getValueAt(fila, 2).toString();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date checkIn = sdf.parse(fechaCheckIn);
            Date checkOut = sdf.parse(fechaCheckOut);

            String tipoHabitacion = tabla.getValueAt(fila, 3).toString();
            String formaPago = tabla.getValueAt(fila, 4).toString();
            double total = Double.parseDouble(tabla.getValueAt(fila, 5).toString());

            String consulta = "UPDATE Reserva SET checkIn=?, checkOut=?, tipoHabitacion=?, formaPago=?, total=? WHERE numReserva=?";
            PreparedStatement ps = conexion.estableceConexion().prepareStatement(consulta);
            ps.setDate(1, new java.sql.Date(checkIn.getTime()));
            ps.setDate(2, new java.sql.Date(checkOut.getTime()));
            ps.setString(3, tipoHabitacion);
            ps.setString(4, formaPago);
            ps.setDouble(5, total);
            ps.setInt(6, id);

            ps.executeUpdate();
            tablaReserva.LLenadoTabla(tabla);
            conexion.Desconectar();

        } catch (ParseException | SQLException e) {

            e.printStackTrace();

            List<String> botones = Arrays.asList("¡Entendido");
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
    
    public void actualizarRegistro(JTable tabla) {
        TablaRegistro tablaRegistro = new TablaRegistro();
        conexion.estableceConexion();
        int fila = tabla.getSelectedRow();

       
        String id = tabla.getValueAt(fila, 1).toString();
        String nombre = tabla.getValueAt(fila, 2).toString();
        String apellido = tabla.getValueAt(fila, 3).toString();
        String nacimiento = tabla.getValueAt(fila, 4).toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fechaNacimiento = sdf.parse(nacimiento);
            String telefono = tabla.getValueAt(fila, 4).toString();

            String consulta = "UPDATE Registro SET nombre=?, apellidos=?, fechaNacimiento=?, telefono=? WHERE id=?";
            PreparedStatement ps = conexion.estableceConexion().prepareStatement(consulta);
            
            ps.setString(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setDate(4, new java.sql.Date(fechaNacimiento.getTime()));
            ps.setString(5, telefono);
            

            ps.executeUpdate();
            tablaRegistro.PropiedadesTabla(tabla);
            conexion.Desconectar();
        } catch (ParseException | SQLException e) {
            e.printStackTrace();

            List<String> botones = Arrays.asList("¡Entendido");
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
