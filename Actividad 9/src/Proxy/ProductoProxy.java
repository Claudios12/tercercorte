package Proxy;
// ProductoProxy.java

public class ProductoProxy implements ProductoInterface {

    private ProductoReal productoReal;
    private int nivelAccesoUsuario;

    public ProductoProxy(ProductoReal productoReal, int nivelAccesoUsuario) {
        this.productoReal = productoReal;
        this.nivelAccesoUsuario = nivelAccesoUsuario;
    }

    private boolean checkAccess() {
        // Por ejemplo, el nivel mínimo para acceder es 3
        return nivelAccesoUsuario >= 3;
    }

    @Override
    public void verDetalles() {
        if (checkAccess()) {
            productoReal.verDetalles();
        } else {
            System.out.println("Acceso denegado: No tienes el nivel suficiente para ver este producto.");
        }
    }
}
