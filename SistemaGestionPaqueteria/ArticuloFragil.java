class ArticuloFragil extends Envio {
    public ArticuloFragil(double peso, double[] dimensiones) {
        super(peso, dimensiones);
    }

    @Override
    public double calcularCosto() {
        // Implementación del método calcularCosto para artículos frágiles
        return 15.0 + peso * 4.0 + dimensiones[0] * dimensiones[1] * 0.02;
    }
}