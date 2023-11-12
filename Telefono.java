public class Telefono implements DispositivoElectronico, Comparable<Telefono> {

    private boolean estaEncendido;
    private int indexVideoActual;
    private int ram;
    private String procesador;
    private int almacenamiento;
    private double precio;
    private String descripcion;
    private int visaCuotas;
    private String marca;
    private String modelo;

    // Otros atributos específicos del teléfono

    public Telefono(boolean estaEncendido, int indexVideoActual, int ram, String procesador, int almacenamiento, double precio, int visaCuotas, String marca, String modelo) {
        this.estaEncendido = estaEncendido;
        this.indexVideoActual = indexVideoActual;
        this.ram = ram;
        this.procesador = procesador;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
        this.descripcion = "";
        this.visaCuotas = visaCuotas;
        this.marca = marca;
        this.modelo = modelo;
        // Inicializar otros atributos específicos del teléfono según sea necesario
    }

    public Telefono() {
        // Constructor vacío
    }

    // Getters y setters para todos los atributos

    public boolean estaEncendido() {
        return estaEncendido;
    }

    public int getIndexVideoActual() {
        return indexVideoActual;
    }

    public int getRam() {
        return ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getVisaCuotas() {
        return visaCuotas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public void setIndexVideoActual(int index) {
        this.indexVideoActual = index;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setVisaCuotas(int visaCuotas) {
        this.visaCuotas = visaCuotas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Implementación de los métodos de la interfaz DispositivoElectronico

    @Override
    public void encender() {
        // Implementación específica para encender el teléfono
    }

    @Override
    public void apagar() {
        // Implementación específica para apagar el teléfono
    }

    @Override
    public void subirVolumen() {
        // Implementación específica para subir el volumen del teléfono
    }

    @Override
    public void bajarVolumen() {
        // Implementación específica para bajar el volumen del teléfono
    }

    @Override
    public void subirBrillo() {
        // Implementación específica para subir el brillo del teléfono
    }

    @Override
    public void bajarBrillo() {
        // Implementación específica para bajar el brillo del teléfono
    }

    @Override
    public void mostrarInfo() {
        // Implementación específica para mostrar información del teléfono
    }

    @Override
    public void mostrarEstado() {
        // Implementación específica para mostrar estado del teléfono
    }

    @Override
    public void reproducirVideo() {
        // Implementación específica para reproducir video en el teléfono
    }

    @Override
    public void pausarVideo() {
        // Implementación específica para pausar video en el teléfono
    }

    @Override
    public void cambiarVideo() {
        // Implementación específica para cambiar video en el teléfono
    }

    // Implementación del método compareTo de la interfaz Comparable
    @Override
    public int compareTo(Telefono otroTelefono) {
        // Comparar por modelo, por ejemplo
        return this.modelo.compareTo(otroTelefono.getModelo());
    }
}
