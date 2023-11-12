import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Archivo {

    private File archivo;

    public Archivo(String nombre) {
        this.archivo = new File(nombre);
    }

    public ArrayList<DispositivoElectronico> leerCSV() throws FileNotFoundException, IOException {
        ArrayList<DispositivoElectronico> dispositivos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                // Asumiendo que el CSV tiene un formato específico, ajusta la lógica según tu CSV
                // Puedes agregar más lógica para distinguir entre Telefono y Computadora según tus necesidades
                if (datos.length == 12) { // Número de atributos esperado para un Teléfono
                    Telefono telefono = new Telefono(
                        Boolean.parseBoolean(datos[0]),  // estaEncendido
                        Integer.parseInt(datos[1]),      // indexVideoActual
                        Integer.parseInt(datos[2]),      // ram
                        datos[3],                         // procesador
                        datos[4],                         // tipoAlmacenamiento
                        Integer.parseInt(datos[5]),      // almacenamiento
                        datos[6],                         // velocidadCPU
                        datos[7],                         // velocidadGPU
                        Double.parseDouble(datos[8]),    // precio
                        Integer.parseInt(datos[9]),      // visaCuotas
                        datos[10],                        // marca
                        datos[11]                         // modelo
                    );
                    dispositivos.add(telefono);
                } else if (datos.length == 14) { // Número de atributos esperado para una Computadora
                    Computadora computadora = new Computadora(
                        Boolean.parseBoolean(datos[0]),  // estaEncendido
                        Integer.parseInt(datos[1]),      // indexVideoActual
                        Integer.parseInt(datos[2]),      // ram
                        datos[3],                         // procesador
                        datos[4],                         // tipoAlmacenamiento
                        Integer.parseInt(datos[5]),      // almacenamiento
                        datos[6],                         // velocidadCPU
                        datos[7],                         // velocidadGPU
                        Double.parseDouble(datos[8]),    // precio
                        Integer.parseInt(datos[9]),      // visaCuotas
                        datos[10],                        // marca
                        datos[11],                        // modelo
                        datos[12],                        // Otro atributo específico de Computadora
                        datos[13]                         // Otro atributo específico de Computadora
                    );
                    dispositivos.add(computadora);
                }
                // Puedes agregar más lógica para otros casos según tu CSV
            }
        }

        return dispositivos;
    }
}
