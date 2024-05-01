class DocumentoUrgente extends Envio {
    public DocumentoUrgente(double peso, double[] dimensiones) {
        super(peso, dimensiones);
    }

    @Override
    public double calcularCosto() {
        //Implementación del método calcularCosto para documentos urgentes
        return 10.0 + peso * 3.0 + dimensiones[0] * 0.05;
    }
}