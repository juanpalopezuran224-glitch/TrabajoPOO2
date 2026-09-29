public class Habitacion_2 {
    int numero;
    String tipo;
    double precioNoche;
    boolean ocupada;
    public Habitacion_2(int numero, String tipo, double precioNoche, boolean ocupada) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.ocupada = ocupada;
    }
    public Habitacion_2(int numero, String tipo) {
        this(numero, tipo, 120000.0, false);
    }
    public void ocupar() {
        this.ocupada = true;
    }
    public boolean estaDisponible() {
        return !this.ocupada;
    }
    public double calcularEstadia(int noches) {
        return this.precioNoche * noches;
    }
    public double calcularEstadia(int noches, double descuento) {
        double subtotal = calcularEstadia(noches);
        return subtotal - (subtotal * (descuento / 100.0));
    }
    public void mostrarInformacion() {
        String estado = this.ocupada ? "Ocupada" : "Disponible";
        System.out.println("Habitación " + this.numero + " (" + this.tipo + ") | Precio/Noche: $" 
                           + this.precioNoche + " | Estado: " + estado);
    }
}