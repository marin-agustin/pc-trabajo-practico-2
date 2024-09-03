package ejercicio.uno;

/**
 * *********** Autor ************* Agustin Marin, Legajo FAI-3975
 ********************************
 */
public class Recurso {

    static void uso() {
        Thread t = Thread.currentThread();
        System.out.println("en Recurso soy: " + t.getName());
    }
}
