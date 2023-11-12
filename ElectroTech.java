import java.util.ArrayList;

public class ElectroTech {

    private ArrayList<DispositivoElectronico> dispositivos;
    private Archivo dispositivosCSV;  // Asumo que existe una clase Archivo para manejar la lectura del archivo CSV

    public ElectroTech() {
        dispositivos = new ArrayList<>();
        dispositivosCSV = new Archivo("dispositivos.csv"); // Reemplaza "dispositivos.csv" con el nombre real de tu archivo CSV
        cargarDispositivosDesdeCSV();
    }

    private void cargarDispositivosDesdeCSV() {
        // Lógica para leer el archivo CSV y llenar la lista de dispositivos
        // Puedes utilizar la clase CSVReader o alguna otra librería para la lectura del CSV
        // Ejemplo ficticio:
        // dispositivos = dispositivosCSV.leerDispositivos();
    }

    public int getSizeArrayDispositivos() {
        return dispositivos.size();
    }

    public void seleccionarDispositivo(String modelo) {
        // Lógica para seleccionar un dispositivo por modelo
    }

    public void encenderDispositivo(String modelo) {
        // Lógica para encender un dispositivo por modelo
    }

    public void apagarDispositivo(String modelo) {
        // Lógica para apagar un dispositivo por modelo
    }

    public void subirBajarVolumen(String modelo, int opcion) {
        // Lógica para subir o bajar el volumen de un dispositivo por modelo
    }

    public void subirBajarBrillo(String modelo, int opcion) {
        // Lógica para subir o bajar el brillo de un dispositivo por modelo
    }

    public void mostrarInformacion(String modelo) {
        // Lógica para mostrar la información de un dispositivo por modelo
    }

    public void controlarVideos(String modelo, int opcion) {
        // Lógica para reproducir, parar o cambiar un video promocional de un dispositivo por modelo
    }

    public void mostrarEstado(String modelo) {
        // Lógica para mostrar el estado de un dispositivo por modelo
    }

    public String dispositivoCostosoEconomico() {
        // Lógica para encontrar el dispositivo más costoso y el más económico
        // Devuelve la información de ambos dispositivos como un String
        return "Información del dispositivo más costoso y económico";
    }
}
