package ejercicio.dos;

public class TesteoHilos {

    public static void main(String[] args) throws InterruptedException {
        
        Thread miHilo = new MiEjecucion();
        miHilo.start();
        miHilo.join();
        System.out.println("En el main");
    }   
}
