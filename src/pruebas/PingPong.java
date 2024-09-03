package pruebas;

/**
 * *********** Autor ************* Agustin Marin, Legajo FAI-3975
 ********************************
 */
public class PingPong extends Thread {

    private String cadena;
    private int delay;

    public PingPong(String cadena, int delay) {
        this.cadena = cadena;
        this.delay = delay;
    }
    
    public void run() {
        for (int i = 1; i < delay; i++) {
            System.out.println(cadena + " ");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                
            }
        }
    }
}
