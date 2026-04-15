public class Vendedor {

    // Públicos
    public String nombre;
    public String area;

    // Privados
    private double montoVendido;
    private double porcentajeComision;
    private double cumplimientoMeta;

    // Constructor
    public Vendedor(String nombre, String area, double montoVendido, double porcentajeComision, double cumplimientoMeta) {
        this.nombre = nombre;
        this.area = area;
        this.montoVendido = montoVendido;
        this.porcentajeComision = porcentajeComision;
        this.cumplimientoMeta = cumplimientoMeta;
    }

    // Métodos (solo declarados por ahora)
    public double calcularComision() {
        return 0;
    }

    public double calcularIngresoTotal() {
        return 0;
    }

    public String obtenerEstadoCumplimiento() {
        return "";
    }

    public String generarMensajeDesempeno() {
        return "";
    }
}
