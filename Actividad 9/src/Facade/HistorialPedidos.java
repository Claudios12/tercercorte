package Facade;

import java.util.ArrayList;
import java.util.List;

public class HistorialPedidos {
    private List<String> pedidos = new ArrayList<>();

    public void realizarPedido(String pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido realizado: " + pedido);
    }

    public void mostrarHistorial() {
        System.out.println("Historial de pedidos:");
        for (String p : pedidos) {
            System.out.println("- " + p);
        }
    }
}
