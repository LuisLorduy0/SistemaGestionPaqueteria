class PaqueteEstandar extends Envio {
    public PaqueteEstandar(double peso, double[] dimensiones) {
        super(peso, dimensiones);
    }

    @Override
    public double calcularCosto() {
          // Implementación del método calcularCosto para paquetes estándar
        return 5.0 + peso * 2.0 + dimensiones[0] * dimensiones[1] * dimensiones[2] * 0.01;
    }
}