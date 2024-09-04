package ejercicio.seis;

import java.util.concurrent.ThreadLocalRandom;

public class Corredor implements Runnable {

    private int distanciaRecorrida;
    private final String nombre;
    private int avanceActual;

    public Corredor(String nombre) {
        this.distanciaRecorrida = 0;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                avanceActual = ThreadLocalRandom.current().nextInt(1, 11);
                distanciaRecorrida += avanceActual;
                System.out.println("Atleta " + nombre + ", recorrio " + avanceActual);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Atleta " + nombre + " interrumpido");
        }
        System.out.println("La distancia total del atleta " + nombre + ", fue de " + distanciaRecorrida);
    }

    public int getDistanciaRecorrida() {
        return this.distanciaRecorrida;
    }
    
    public String getNombre() {
        return nombre;
    }
}
