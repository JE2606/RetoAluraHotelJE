package alurahotel.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



/**
 *
 * @author bjimenez
 */
public class Conexion {
    
    
    public Statement sentencia;
    public ResultSet resultado;
    
    String usuario ="juane";
    String contra ="root";
    String bd ="alurabd";
    String ip ="localhost";
    String puerto ="3306";
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    Connection jdbc;
    
    public Connection estableceConexion(){
        
        try{
            
            Class.forName(driver);
            jdbc = DriverManager.getConnection(cadena, usuario, contra);
            
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Problema al conectarse"+e.toString());
            
        }
    
        return jdbc;
        
    }
    
    public void Desconectar(){
        
        try{
            
            System.out.println("Conexion finalizada");
            jdbc.close();
            
        }catch (Exception e){
        
          JOptionPane.showMessageDialog(null,"Problema al conectarse"+e.toString());  
            
        }
        
    }
    
}
