public class Computadora implements DispositivoElectronico, Comparable<Computadora> {

    private boolean estaEncendido;
    private int indexVideoActual;
    private int ram;
    private String procesador;
    private String tipoAlmacenamiento;
    private int almacenamiento;
    private String velocidadCPU;
    private String velocidadGPU;
    private double precio;
    private String descripcion;
    private int visaCuotas;
    private String marca;
    private String modelo;

    // Otros atributos específicos de la computadora

    public Computadora(boolean estaEncendido, int indexVideoActual, int ram, String procesador, String tipoAlmacenamiento, int almacenamiento, String velocidadCPU, String velocidadGPU, double precio, int visaCuotas, String marca, String modelo) {
        this.estaEncendido = estaEncendido;
        this.indexVideoActual = indexVideoActual;
        this.ram = ram;
        this.procesador = procesador;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.almacenamiento = almacenamiento;
        this.velocidadCPU = velocidadCPU;
        this.velocidadGPU = velocidadGPU;
        this.precio = precio;
        this.descripcion = "";
        this.visaCuotas = visaCuotas;
        this.marca = marca;
        this.modelo = modelo;
        // Inicializar otros atributos específicos de la computadora según sea necesario
    }

    public Computadora() {
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

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public String getVelocidadCPU() {
        return velocidadCPU;
    }

    public String getVelocidadGPU() {
        return velocidadGPU;
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

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setVelocidadCPU(String velocidadCPU) {
        this.velocidadCPU = velocidadCPU;
    }

    public void setVelocidadGPU(String velocidadGPU) {
        this.velocidadGPU = velocidadGPU;
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
        // Implementación específica para encender la computadora
    }

    @Override
    public void apagar() {
        // Implementación específica para apagar la computadora
    }

    @Override
    public void subirVolumen() {
        // Implementación específica para subir el volumen de la computadora
    }

    @Override
    public void bajarVolumen() {
        // Implementación específica para bajar el volumen de la computadora
    }

    @Override
    public void subirBrillo() {
        // Implementación específica para subir el brillo de la computadora
    }

    @Override
    public void bajarBrillo() {
        // Implementación específica para bajar el brillo de la computadora
    }

    @Override
    public void mostrarInfo() {
        // Implementación específica para mostrar información de la computadora
    }

    @Override
    public void mostrarEstado() {
        // Implementación específica para mostrar estado de la computadora
    }

    @Override
    public void reproducirVideo() {
        // Implementación específica para reproducir video en la computadora
    }

    @Override
    public void pausarVideo() {
        // Implementación específica para pausar video en la computadora
    }

    @Override
    public void cambiarVideo() {
        // Implementación específica para cambiar video en la computadora
    }

    // Implementación del método compareTo de la interfaz Comparable
    @Override
    public int compareTo(Computadora otraComputadora) {
        // Comparar por modelo, por ejemplo
        return this.modelo.compareTo(otraComputadora.getModelo());
    }
}
