
package ejercicio;

/**
 *
 * @author sebastian camargo
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hora hora1 = new Hora(1, 32, 15);
        Hora hora2 = new Hora(
        );
        
        hora1.setHora(8);
        
        hora1.setMinutos(45);
        
        hora1.imprimirHora();
        
        hora2.imprimirHora();
        
        hora1.setHora(2, 60, 72);
        
        System.out.println(hora1.gethora());
        

    }
    
    
}
