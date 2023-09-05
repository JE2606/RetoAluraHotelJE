package alurahotel.logica;

import java.util.ArrayList;

/**
 *
 * @author bjimenez
 */
public class ListadoHabitacion {
    ArrayList<Habitacion>lista;
    
    public ListadoHabitacion(){
     
        lista = new ArrayList();
     }
     
     public void AgregarHabitaciones(Habitacion habitaciones){
         lista.add(habitaciones);
     
     }
}
