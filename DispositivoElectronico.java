// Definición de la interfaz DispositivoElectronico
public interface DispositivoElectronico {
    void encender();
    void apagar();
    void subirVolumen();
    void bajarVolumen();
    void subirBrillo();
    void bajarBrillo();
    void mostrarInfo();
    void mostrarEstado();
    void reproducirVideo();
    void pausarVideo();
    void cambiarVideo();
}

// Ejemplo de implementación en una clase concreta (por ejemplo, Televisor)
public class Televisor implements DispositivoElectronico {

    // Atributos específicos del televisor
    private String descripcion;
    private double precio;
    private int cuotas;
    private String marca;
    private String modelo;
    private String memoriaRam;
    private String procesador;
    private String almacenamientoInterno;

    // Otros atributos y métodos específicos del televisor

    @Override
    public void encender() {
        // Implementación específica para encender el televisor
    }

    @Override
    public void apagar() {
        // Implementación específica para apagar el televisor
    }

    @Override
    public void subirVolumen() {
        // Implementación específica para subir el volumen del televisor
    }

    @Override
    public void bajarVolumen() {
        // Implementación específica para bajar el volumen del televisor
    }

    // Implementa los demás métodos de la interfaz de acuerdo con las necesidades específicas del televisor

    @Override
    public void mostrarInfo() {
        // Implementación específica para mostrar información del televisor
    }

    @Override
    public void mostrarEstado() {
        // Implementación específica para mostrar estado del televisor
    }

    @Override
    public void reproducirVideo() {
        // Implementación específica para reproducir video en el televisor
    }

    @Override
    public void pausarVideo() {
        // Implementación específica para pausar video en el televisor
    }

    @Override
    public void cambiarVideo() {
        // Implementación específica para cambiar video en el televisor
    }
}
