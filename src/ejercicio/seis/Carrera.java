package ejercicio.seis;

public class Carrera {

    public static void main(String[] args) {

        String[] nombres = {"Agustin", "Franco", "Giuliano", "Marcos"};
        Corredor[] corredores = new Corredor[nombres.length];
        Thread[] hilosCorredores = new Thread[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            corredores[i] = new Corredor(nombres[i]);
            hilosCorredores[i] = new Thread(corredores[i]);
            hilosCorredores[i].start();
        }

        for (Thread t : hilosCorredores) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        anunciarGanador(corredores);

    }

    public static void anunciarGanador(Corredor[] corredores) {

        int distancia = 0;
        Corredor actual = null;

        for (Corredor corredor : corredores) {
            if (distancia < corredor.getDistanciaRecorrida()) {
                distancia = corredor.getDistanciaRecorrida();
                actual = corredor;
            }
        }

        try {
            System.out.println("El corredor que gano la carrera fue " + actual.getNombre() + " con una distancia de " + actual.getDistanciaRecorrida() + "km");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

}
