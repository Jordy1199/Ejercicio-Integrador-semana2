public class Main {
    public static void main(String[] args) {

        Vendedor v = new Vendedor(
                "Andrea López",
                "Tecnología",
                2850.75,
                8,
                92
        );

        System.out.println("===== INFORMACIÓN DEL VENDEDOR =====");
        System.out.println("Nombre: " + v.nombre);
        System.out.println("Área: " + v.area);

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Comisión: " + v.calcularComision());
        System.out.println("Ingreso total: " + v.calcularIngresoTotal());
        System.out.println("Estado: " + v.obtenerEstadoCumplimiento());
        System.out.println("Mensaje: " + v.generarMensajeDesempeno());
    }
}
