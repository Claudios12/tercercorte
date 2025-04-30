package FlyWeight;


public class Proveedor {
    private String nombre;

    public Proveedor(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Proveedor: " + nombre);
    }
}
