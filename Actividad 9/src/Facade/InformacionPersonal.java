package Facade;

    public class InformacionPersonal {
        private String nombre;
        private String direccion;
    
        public InformacionPersonal(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }
    
        public void actualizarDatos(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
            System.out.println("Datos personales actualizados.");
        }
    
        public void mostrarDatos() {
            System.out.println("Nombre: " + nombre + " | Dirección: " + direccion);
        }
    }
    