
package ejercicio;

/**
 *
 * @author sebastian camargo
 */
public class Hora {
    
    private int hora;
    private int minutos;
    private int segundos;

    public Hora() {
    }

    public Hora(int hora, int minutos, int segundos) {
     
       if (hora < 0 || hora > 24){
           this.hora = 0;
           
       } else {
           this.hora = hora;
       }
       
       if (minutos < 0 || minutos > 59){
           this.minutos = 0;
           
       } else {
           this.minutos = minutos;
       }
       
       if (segundos < 0 || segundos > 59){
           this.segundos = 0;
           
       } else {
           this.segundos = segundos;
       }
       
       
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public void setHora(int hora, int minutos, int segundos){
        
        if (hora < 0 || hora > 24) {
            this.hora = 0;
        } else {
            this.hora = hora;
        }

        if (minutos < 0 || minutos > 59) {
            this.minutos = 0;
        } else {
            this.minutos = minutos;
        }

        if (segundos < 0 || segundos > 59) {
            this.segundos = 0;
        } else {
            this.segundos = segundos;
        }

    }
    
    public String gethora(){
        return String.format("%d:%d:%d", hora, minutos, segundos);        
    }
    
    public void imprimirHora(){
        System.out.println(String.format("%d:%d:%d", hora, minutos, segundos));       
    }
    
    
    
    
    
    
}
