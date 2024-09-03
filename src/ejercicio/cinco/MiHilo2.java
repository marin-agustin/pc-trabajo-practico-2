package ejercicio.cinco;

public class MiHilo2 extends Thread {

    public MiHilo2(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        System.out.println("Comenzando " + getName());
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("En " + getName() + ", el recurso " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrumpido");
        }
        System.out.println("Terminado " + getName());
    }
}
