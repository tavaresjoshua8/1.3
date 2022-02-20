package util;

public class Paciente {
    private String codigo = "";
    private String nombre = "";
    private String rfc = "";
    private String telefono = "";
    private int edad = 0;

    public Paciente() { }

    public Paciente(String codigo, String nombre, String rfc, String telefono, int edad) {
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.setEdad(edad);
    }

    @Override
    public String toString() {
        return "Paciente #" + this.getCodigo() + "\n"
            + "\tNombre: " + this.getNombre() + "\n"
            + "\tRFC: " + this.getRfc() + "\n"
            + "\tTeléfono: " + this.getTelefono() + "\n"
            + "\tEdad: " + this.getEdad() + "\n"; 
    }

    // Getters
    public String getCodigo() { return this.codigo; }
    public String getNombre() { return this.nombre; }
    public String getRfc() { return this.rfc; }
    public String getTelefono() { return this.telefono; }
    public int getEdad() { return this.edad; }

    // Setters
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setRfc(String rfc) { this.rfc = rfc; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setEdad(int edad) { this.edad = (edad > 0) ? edad : 0; }
}
