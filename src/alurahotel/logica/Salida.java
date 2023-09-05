
package alurahotel.logica;
/*
Importe del frame inicio para la salida general
Importe de Jframe para recibirlo como parametro
Importe del JOption para aceptar salir
*/
import alurahotel.Inicio;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
/**
 *
 * @author bjimenez
 */

//Salida general Metodo
public class Salida {
//    Variable para capturar lo que seleccione el usuario en el JOption
    
    public void Mensaje(JFrame jframe){

      List<String> botones = Arrays.asList("Si", "No");
            PanelesPersonalizados optionPane = new PanelesPersonalizados(
                "¿Estás seguro que deseas cerrar sección?",
                "¡Hey, no te vayas!",
                botones,
                "/alurahotel/imagenes/confundido.png",
                60,
                60
        );
          int resultado = optionPane.Mostrar();
//Si el usuario selecciona Si regresa al inicio
        if (resultado == 0) {
            Inicio inicio = new Inicio();
            jframe.dispose();
            inicio.setVisible(true);
            
        }
    }
// Salida en el inicio para cerrar el programa  
    public void InicioSalida(JFrame jframe){
        
      List<String> botones = Arrays.asList("Si", "No");
            PanelesPersonalizados optionPane = new PanelesPersonalizados(
                "¿Estás seguro que deseas salir?",
                "¡Hey, no te vayas!",
                botones,
                "/alurahotel/imagenes/noSalgas.png",
                60,
                60
        );
          int resultado = optionPane.Mostrar();

        if (resultado == 0) {
            System.exit(0);
        }
    }
    
}
