package ejercicio.cinco;

public class UsoHilos {

    public static void main(String[] args) {

        System.out.println("Hilo principal iniciado");
        /*
        MiHilo r1 = new MiHilo("#1");

        Thread t1 = new Thread(r1);

        t1.start();
        */
        
        
        new MiHilo2("#1").start();
        new MiHilo2("#2").start();
        new MiHilo2("#3").start();

        for (int i = 0; i < 50; i++) {
            System.out.print(" .");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException exc) {
            System.out.println("Hilo principal interrumpido.");
        }

        System.out.println("Hilo principal finalizado");
    }
}
