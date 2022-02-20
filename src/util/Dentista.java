package util;

public class Dentista {
    private String codigo = "";
    private String nombre = "";
    private String especialidad = "";

    public Dentista() { }

    public Dentista(String codigo, String nombre, String especialidad) {
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setEspecialidad(especialidad);
    }

    @Override
    public String toString() {
        return "Dentista #" + this.codigo + "\n"
                + "\tNombre: " + this.nombre + "\n"
                + "\tEspecialidad: " + this.especialidad + "\n";
    }

    // Getters
    public String getCodigo() { return this.codigo; }
    public String getNombre() { return this.nombre; }
    public String getEspecialidad() { return this.especialidad; }

    // Setters
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
}
