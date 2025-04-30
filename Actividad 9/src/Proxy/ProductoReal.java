package Proxy;
// ProductoReal.java

public class ProductoReal implements ProductoInterface {

    private String nombre;
    private double precio;

    public ProductoReal(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void verDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
    }
}
