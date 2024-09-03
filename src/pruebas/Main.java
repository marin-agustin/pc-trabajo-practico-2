package pruebas;

/************* Autor *************
 * Agustin Marin, Legajo FAI-3975
 *********************************/
public class Main {
    public static void main(String[] args) {
        PingPong t1 = new PingPong("PING", 33);
        PingPong t2 = new PingPong("PONG", 10);
        
        t1.start();
        t2.start();
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            
        }
    }
}
