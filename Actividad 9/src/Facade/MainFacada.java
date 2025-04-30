package Facade;

public class MainFacada {
    public static void main(String[] args) {
        ClienteFacade cliente = new ClienteFacade("Juan Pérez", "Calle 123");

        cliente.mostrarInfo();
        cliente.actualizarInfo("Juan P. Gómez", "Carrera 45");

        cliente.hacerPedido("Pedido #1: Laptop");
        cliente.hacerPedido("Pedido #2: Mouse");
        cliente.verHistorial();

        cliente.activarPago("Tarjeta de crédito");
        cliente.activarPago("Nequi");
        cliente.bloquearPago("Tarjeta de crédito");
        cliente.verPagos();
    }
}

