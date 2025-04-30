package FlyWeight;

public class Producto {
    private String nombre;
    private double precio;
    private Proveedor proveedor;

    public Producto(String nombre, double precio, Proveedor proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
        proveedor.mostrarInfo();
        System.out.println("---------------");
    }
}

