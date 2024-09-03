package ejercicio.cinco;

public class MiHilo implements Runnable {

    private final String nombre;

    public MiHilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Comenzando " + nombre);
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("En " + nombre + ", el recurso " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(nombre + " interrumpido");
        }
        System.out.println("Terminado " + nombre);
    }

}
