public class Paquete {  
    String codigo;
    String destino;
    double peso;
    boolean asegurado;   
    public Paquete(String codigo, String destino, double peso, boolean asegurado) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
        this.asegurado = asegurado;
    }
    public Paquete(String codigo, String destino) {
        this(codigo, destino, 1.0, false);
    }   
    public Paquete(String codigo) {
        this(codigo, "Por asignar");
    }   
    public void mostrarInformacion() {
        System.out.println(this.codigo + " -> " + this.destino + " | " + this.peso + " kg | asegurado: " + this.asegurado);
    }   
    public void mostrarInformacion(String encabezado) {
        System.out.println(encabezado);
        mostrarInformacion(); // Reutiliza la versión sin parámetros
    }   
    public void actualizarPeso(double peso) {
        this.peso = peso;
    }   
    public double calcularCosto() {
        double costo = this.peso * 5000;
        if (this.asegurado) {
            costo += 8000;
        }
        return costo;
    }   
    public double calcularCosto(double tarifaPorKilo) {
        double costo = this.peso * tarifaPorKilo;
        if (this.asegurado) {
            costo += 8000;
        }
        return costo;
    } 
    public boolean esPesado() {
        return this.peso > 5.0;
    }
}