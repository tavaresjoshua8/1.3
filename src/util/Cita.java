package util;

import java.util.Date;

public class Cita {
    private static int IDGENERATOR = 0;
    private int id = IDGENERATOR++;
    private Paciente paciente;
    private Dentista dentista;
    private Date fecha;
    private int hora;
    private String descripcion;
    private String estatus;

    public Cita(Paciente paciente, Dentista dentista, Date fecha, int hora, String descripcion, String estatus) {
        this.setPaciente(paciente);
        this.setDentista(dentista);
        this.setFecha(fecha);
        this.setHora(hora);
        this.setDescripcion(descripcion);
        this.setEstatus(estatus);
    }

    // Getters
    public int getId() { return this.id; }
    public Paciente getPaciente() { return this.paciente; }
    public Dentista getDentista() { return this.dentista; }
    public Date getFecha() { return this.fecha; }
    public int getHora() { return this.hora; }
    public String getDescripcion() { return this.descripcion; }
    public String getEstatus() { return this.estatus; }

    // Setters
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    public void setDentista(Dentista dentista) { this.dentista = dentista; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public void setHora(int hora) { this.hora = (hora > 0) ? hora : 0; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setEstatus(String estatus) { this.estatus = estatus; }
}
