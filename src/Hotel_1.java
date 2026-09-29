public class Hotel_1 {
    public static void main(String[] args) {
        Habitacion h1 = new Habitacion(101, "Sencilla", 120000.0, false);
        Habitacion h2 = new Habitacion(102, "Doble"); // Usa constructor abreviado[cite: 1]
        Habitacion h3 = new Habitacion(201, "Suite", 250000.0, false);
        h2.ocupar();
        System.out.println("=== ESTADO DE LAS HABITACIONES ===");
        h1.mostrarInformacion();
        h2.mostrarInformacion();
        h3.mostrarInformacion();

        // Imprimir estadía de 3 noches con y sin descuento para h1[cite: 1]
        System.out.println("\n=== CÁLCULO DE ESTADÍA (Habitación 101 - 3 Noches) ===");
        System.out.println("Sin descuento: $" + h1.calcularEstadia(3));
        System.out.println("Con 10% de descuento: $" + h1.calcularEstadia(3, 10.0));
    }
}