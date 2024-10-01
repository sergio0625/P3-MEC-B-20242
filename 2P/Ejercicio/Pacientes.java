package Ejercicio;

public class Pacientes {
    private String cedula;
    private String categoria;
    private String servicio;

    public Pacientes(String cedula , String categoria, String servicio){
        this.cedula = cedula;
        this.categoria = categoria;
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "Cédula: " + cedula + ", Categoría: " + categoria + ", Servicio: " + servicio;
    }
    
}
