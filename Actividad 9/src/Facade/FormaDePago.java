package Facade;

import java.util.HashMap;
import java.util.Map;

public class FormaDePago {
    private Map<String, Boolean> metodosPago = new HashMap<>();

    public void activarMetodo(String metodo) {
        metodosPago.put(metodo, true);
        System.out.println("Método activado: " + metodo);
    }

    public void bloquearMetodo(String metodo) {
        metodosPago.put(metodo, false);
        System.out.println("Método bloqueado: " + metodo);
    }

    public void mostrarMetodos() {
        System.out.println("Formas de pago:");
        for (Map.Entry<String, Boolean> entry : metodosPago.entrySet()) {
            System.out.println("- " + entry.getKey() + " (Activo: " + entry.getValue() + ")");
        }
    }
}
