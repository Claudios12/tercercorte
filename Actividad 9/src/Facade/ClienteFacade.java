package Facade;

public class ClienteFacade {
    private InformacionPersonal info;
    private HistorialPedidos historial;
    private FormaDePago pagos;

    public ClienteFacade(String nombre, String direccion) {
        this.info = new InformacionPersonal(nombre, direccion);
        this.historial = new HistorialPedidos();
        this.pagos = new FormaDePago();
    }

    // Métodos simplificados
    public void actualizarInfo(String nombre, String direccion) {
        info.actualizarDatos(nombre, direccion);
    }

    public void mostrarInfo() {
        info.mostrarDatos();
    }

    public void hacerPedido(String pedido) {
        historial.realizarPedido(pedido);
    }

    public void verHistorial() {
        historial.mostrarHistorial();
    }

    public void activarPago(String metodo) {
        pagos.activarMetodo(metodo);
    }

    public void bloquearPago(String metodo) {
        pagos.bloquearMetodo(metodo);
    }

    public void verPagos() {
        pagos.mostrarMetodos();
    }
}
