package ejercicio.dos;

public class MiEjecucion extends Thread {

    public void run() {
        ir();
    }
    
    public void ir() {
        hacerMas();
    }
    
    public void hacerMas() {
        System.out.println("En la pila");
    }
}
