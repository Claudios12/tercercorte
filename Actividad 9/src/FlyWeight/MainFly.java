package FlyWeight;

public class MainFly {
    public static void main(String[] args) {

        Proveedor proveedorA = ProveedorFactory.obtenerProveedor("Proveedor A");
        Proveedor proveedorB = ProveedorFactory.obtenerProveedor("Proveedor B");

        Producto p1 = new Producto("Mouse", 50.0, proveedorA);
        Producto p2 = new Producto("Teclado", 80.0, proveedorA);
        Producto p3 = new Producto("Monitor", 300.0, proveedorB);
        Producto p4 = new Producto("Webcam", 100.0, proveedorA); // usa el mismo proveedor

        p1.mostrarDetalles();
        p2.mostrarDetalles();
        p3.mostrarDetalles();
        p4.mostrarDetalles();
    }
}

