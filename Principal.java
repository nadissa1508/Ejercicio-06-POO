import java.util.Scanner;

public class Principal {

    private ElectroTech tienda;

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.menu();
    }

    public Principal() {
        this.tienda = new ElectroTech(); // Puedes ajustar esto según la lógica real de tu aplicación
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Seleccionar dispositivo");
            System.out.println("2. Encender dispositivo");
            System.out.println("3. Apagar dispositivo");
            System.out.println("4. Subir/Bajar volumen");
            System.out.println("5. Subir/Bajar brillo");
            System.out.println("6. Mostrar información del dispositivo");
            System.out.println("7. Controlar videos del dispositivo");
            System.out.println("8. Mostrar estado del dispositivo");
            System.out.println("9. Dispositivo más costoso y más económico");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea después de leer un entero
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    seleccionarDispositivo();
                    break;
                case 2:
                    encenderDispositivo();
                    break;
                case 3:
                    apagarDispositivo();
                    break;
                case 4:
                    subirBajarVolumen();
                    break;
                case 5:
                    subirBajarBrillo();
                    break;
                case 6:
                    mostrarInformacion();
                    break;
                case 7:
                    controlarVideos();
                    break;
                case 8:
                    mostrarEstado();
                    break;
                case 9:
                    dispositivoCostosoEconomico();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private void seleccionarDispositivo() {
        // Lógica para seleccionar un dispositivo
    }

    private void encenderDispositivo() {
        // Lógica para encender un dispositivo
    }

    private void apagarDispositivo() {
        // Lógica para apagar un dispositivo
    }

    private void subirBajarVolumen() {
        // Lógica para subir o bajar volumen
    }

    private void subirBajarBrillo() {
        // Lógica para subir o bajar brillo
    }

    private void mostrarInformacion() {
        // Lógica para mostrar información del dispositivo
    }

    private void controlarVideos() {
        // Lógica para controlar videos del dispositivo
    }

    private void mostrarEstado() {
        // Lógica para mostrar estado del dispositivo
    }

    private void dispositivoCostosoEconomico() {
        // Lógica para obtener información del dispositivo más costoso y más económico
    }
}
