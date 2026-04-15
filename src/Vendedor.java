public class Vendedor {

    public String nombre;
    public String area;
    private double montoVendido;
    private double porcentajeComision;
    private double cumplimientoMeta;

    public Vendedor(String nombre, String area, double montoVendido, double porcentajeComision, double cumplimientoMeta) {
        this.nombre = nombre;
        this.area = area;
        this.montoVendido = montoVendido;
        this.porcentajeComision = porcentajeComision;
        this.cumplimientoMeta = cumplimientoMeta;
    }

    public double calcularComision() {
        return montoVendido * (porcentajeComision / 100);
    }

    public double calcularIngresoTotal() {
        return montoVendido + calcularComision();
    }

    public String obtenerEstadoCumplimiento() {
        if (cumplimientoMeta >= 90) {
            return "Excelente";
        } else if (cumplimientoMeta >= 70) {
            return "Aceptable";
        } else {
            return "Bajo";
        }
    }

    public String generarMensajeDesempeno() {
        String estado = obtenerEstadoCumplimiento();

        if (estado.equals("Excelente")) {
            return "Vendedor con desempeño sobresaliente";
        } else if (estado.equals("Aceptable")) {
            return "Vendedor con desempeño aceptable";
        } else {
            return "Se requiere seguimiento comercial";
        }
    }
}
