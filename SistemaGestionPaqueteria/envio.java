class Envio {
    protected double peso;
    protected double[] dimensiones;
    // Constructor 
    public Envio(double peso, double[] dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }
// Método para calcular el costo del envío
    public double calcularCosto() {
        return 0.0; 
    }
}