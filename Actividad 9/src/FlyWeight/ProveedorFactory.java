package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class ProveedorFactory {
    private static Map<String, Proveedor> proveedores = new HashMap<>();

    public static Proveedor obtenerProveedor(String nombre) {
        if (!proveedores.containsKey(nombre)) {
            proveedores.put(nombre, new Proveedor(nombre));
            System.out.println("Nuevo proveedor creado: " + nombre);
        } else {
            System.out.println("Proveedor reutilizado: " + nombre);
        }
        return proveedores.get(nombre);
    }
}

