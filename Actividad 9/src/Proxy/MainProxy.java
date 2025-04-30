package Proxy;
public class MainProxy {
    public static void main(String[] args) {

        ProductoReal producto = new ProductoReal("Laptop Gamer", 4999.99);

        // Usuario con nivel bajo de acceso
        ProductoInterface proxyBajo = new ProductoProxy(producto, 2);
        proxyBajo.verDetalles();  // Debería denegar el acceso

        System.out.println("------------");

        // Usuario con nivel alto de acceso
        ProductoInterface proxyAlto = new ProductoProxy(producto, 5);
        proxyAlto.verDetalles();  // Debería mostrar los detalles
    }
}
