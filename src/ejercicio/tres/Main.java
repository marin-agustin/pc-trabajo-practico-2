package ejercicio.tres;

public class Main {

    public static void main(String[] args) {
        
        /*
        new ThreadEjemplo("Maria Jose").start();
        new ThreadEjemplo("Jose Maria").start();
        System.out.println("Termina thread main");
        */
        
        ThreadEjemplo2 r1 = new ThreadEjemplo2("Maria Jose");
        ThreadEjemplo2 r2 = new ThreadEjemplo2("Jose Maria");
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        t2.start();
        
    }
}
