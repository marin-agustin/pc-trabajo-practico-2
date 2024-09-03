package ejercicio.tres;

public class ThreadEjemplo2 implements Runnable {

    private final String nombre;

    public ThreadEjemplo2(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + nombre);
        }
        System.out.println("Termina thread " + nombre);
    }

}
