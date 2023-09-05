
package alurahotel.logica;

import java.util.ArrayList;

/**
 *
 * @author bjimenez
 */
public class ListadoFormaPago {
     ArrayList<FormaPago>lista;
     
     public ListadoFormaPago(){
     
        lista = new ArrayList();
     }
     
     public void AgregarFormaPago(FormaPago formaPago){
         lista.add(formaPago);
     
     }
}
