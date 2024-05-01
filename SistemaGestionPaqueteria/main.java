import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                                                       //para elegir el tipo de envio
        System.out.println("Ingrese el tipo de envío (1: Paquete Estándar, 2: Documento Urgente, 3: Artículo Frágil): ");
        int tipoEnvio = scanner.nextInt();

        double peso;
        double[] dimensiones = new double[3];
                                                //poner peso y las dimensiones del paquete
        System.out.println("Ingrese el peso del paquete: ");
        peso = scanner.nextDouble();
                                                         
        System.out.println("Ingrese la longitud, ancho y altura del paquete (separados por espacio): ");
        for (int i = 0; i < 3; i++) {
            dimensiones[i] = scanner.nextDouble();
        }

        Envio envio;
        switch (tipoEnvio) {
            case 1:
                envio = new PaqueteEstandar(peso, dimensiones);
                break;
            case 2:
                envio = new DocumentoUrgente(peso, dimensiones);
                break;
            case 3:
                envio = new ArticuloFragil(peso, dimensiones);
                break;
            default:
                System.out.println("Tipo de envío no válido. Se utilizará Paquete Estándar por defecto.");
                envio = new PaqueteEstandar(peso, dimensiones);
        }

        ServicioEnvio servicioEnvio = new ServicioEnvio();
        double costoEnvio = servicioEnvio.calcularCostoEnvio(envio);

        System.out.println("El costo total del envío es: $" + costoEnvio);
 
        scanner.close();
    }
}
