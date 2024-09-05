package ejercicio.siete;

public class Cliente {
    
    private final String nombre;
    private final int[] carroCompra;
    
    public Cliente(String nombre, int[] carroCompra) {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int[] getCarroCompra() {
        return this.carroCompra;
    }
}
