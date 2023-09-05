
package alurahotel.logica;


import alurahotel.Login;
import alurahotel.Menu;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;


public class Validacion {
      
   private Conexion conexion = new Conexion();
   private Login login; 
    
    
    //Metodo para hacer la validacion de contraseña y usuario
    public void iniciar(JTextField fieldUsuario, JPasswordField fieldContra, JFrame jframe) {
    login = new Login();
    conexion.estableceConexion();
    
    try {
        String consulta = "SELECT * FROM Usuarios WHERE Usuarios.user_name = ? AND Usuarios.user_pass = ?";
        PreparedStatement ps = conexion.estableceConexion().prepareStatement(consulta);
        
        String contra = String.valueOf(fieldContra.getPassword());
        ps.setString(1, fieldUsuario.getText());
        ps.setString(2, contra);
        String usuario = fieldUsuario.getText() ;
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            List<String> botones = Arrays.asList("¡Gracias!");
            PanelesPersonalizados optionPane = new PanelesPersonalizados(
                "¡Bienvenido!",
                "Bienvenida",
                botones,
                "/alurahotel/imagenes/bienvenida.png",
                60,
                60
        );
            optionPane.Mostrar();
            Menu menu = new Menu();
            menu.setVisible(true);
            jframe.dispose();
        }else if(usuario.isEmpty() || contra.isEmpty()){
            
            List<String> botones = Arrays.asList("¡Entendido!");
            PanelesPersonalizados optionPane = new PanelesPersonalizados(
                "¡Usuario o contraseña estan vacios!",
                "Campos vacios",
                botones,
                "/alurahotel/imagenes/advertencia.png",
                60,
                60
        );
            optionPane.Mostrar();
        }else {
            
             List<String> botones = Arrays.asList("¡Entendido!");
            PanelesPersonalizados optionPane = new PanelesPersonalizados(
                "¡Usuario o contraseña incorrectos!",
                "Valores incorrectos",
                botones,
                "/alurahotel/imagenes/incorrecto.png",
                60,
                60
        );
            optionPane.Mostrar();
        }
        
        conexion.Desconectar();
    } catch (Exception e) {
        
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
