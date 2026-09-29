public class Envios_4 {
    public static void main(String[] args) {
        Paquete p1 = new Paquete("P-001", "Manizales", 3.0, true);
        p1.mostrarInformacion();
        Paquete p2 = new Paquete("P-002", "Pereira");
        Paquete p3 = new Paquete("P-003");

        p2.mostrarInformacion();
        p3.mostrarInformacion();
        p3.actualizarPeso(2.5);

        double total = p1.calcularCosto() + p2.calcularCosto() + p3.calcularCosto();
        System.out.println("Total del envío: " + total);
        System.out.println("Costo p1 con tarifa 4000: " + p1.calcularCosto(4000));
        System.out.println("Costo p2 con tarifa 4000: " + p2.calcularCosto(4000));
        p1.actualizarPeso(6.2);
        if (p1.esPesado()) {
            System.out.println("AVISO: El paquete " + p1.codigo + " requiere manejo especial por exceso de peso.");
        }
        p1.mostrarInformacion("=== INFORMACIÓN DE PAQUETE REVISADO ===");
    }
}