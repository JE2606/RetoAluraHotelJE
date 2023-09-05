
package alurahotel.logica;

import java.util.Random;


/**
 *
 * @author bjimenez
 */
public class GenerarNumero {
    
    public int generateRandomNumber(){
    
        Random random = new Random();
        return random.nextInt(100000);
        
    }
    
}
