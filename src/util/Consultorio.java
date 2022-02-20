package util;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Consultorio {
    private final static String NOMBRE = "Consultorio Joshua";
    private final static Scanner input = new Scanner(System.in);
    private final static ArrayList<Paciente> pacientes = new ArrayList<>();
    private final static ArrayList<Dentista> dentistas = new ArrayList<>();
    private final static ArrayList<Cita> citas = new ArrayList<>();

    public static int menuPacientes() {
        System.out.println("1. Agregar paciente");
        System.out.println("2. Buscar paciente");
        System.out.println("3. Listar pacientes");
        System.out.println("4. Eliminar paciente");
        System.out.println("5. Regresar");

        System.out.print("\nSeleccione una opción: \n> ");
        return input.nextInt();
    }

    public static int menuDentistas() {
        System.out.println("1. Agregar dentista");
        System.out.println("2. Buscar dentista");
        System.out.println("3. Listar dentistas");
        System.out.println("4. Eliminar dentista");
        System.out.println("5. Regresar");

        System.out.print("\nSeleccione una opción: \n> ");
        return input.nextInt();
    }

    public static int menuCitas() {
        System.out.println("1. Agregar cita");
        System.out.println("2. Buscar cita");
        System.out.println("3. Listar citas");
        System.out.println("4. Eliminar cita");
        System.out.println("5. Regresar");

        System.out.print("\nSeleccione una opción: \n> ");
        return input.nextInt();
    }

    public static int menuPrincipal() {
        System.out.println("1. Pacientes");
        System.out.println("2. Dentistas");
        System.out.println("3. Citas");
        System.out.println("4. Salir");

        System.out.print("\nSeleccione una opción: \n> ");
        return input.nextInt();
    }

    public static void main(String[] args) throws ParseException {
        int opcion;
        do {
            opcion = menuPrincipal();

            switch(opcion) {
                case 1:
                    int opcionPaciente;
                    do {
                        opcionPaciente = menuPacientes();

                        switch(opcionPaciente) {
                            case 1:
                                System.out.print("\nIngrese el código del paciente: \n> ");
                                String codigo = input.next();
                                System.out.print("\nIngrese el nombre del paciente: \n> ");
                                String nombre = input.next();
                                System.out.print("\nIngrese el RFC del paciente: \n> ");
                                String rfc = input.next();
                                System.out.print("\nIngrese el teléfono del paciente: \n> ");
                                String telefono = input.next();
                                System.out.print("\nIngrese la edad del paciente: \n> ");
                                int edad = input.nextInt();

                                pacientes.add(new Paciente(codigo, nombre, rfc, telefono, edad));
                                break;
                            case 2:
                                System.out.print("\nIngrese el código del paciente: \n> ");
                                String codigoBuscar = input.next();
                                for (Paciente paciente : pacientes) {
                                    if (paciente.getCodigo().equals(codigoBuscar)) {
                                        System.out.println("\nPaciente encontrado: ");
                                        System.out.println(paciente);
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("\nLista de pacientes: ");
                                for (Paciente paciente : pacientes) {
                                    System.out.println("#" + paciente.getCodigo() + " - " + paciente.getNombre());
                                }
                                break;
                            case 4:
                                System.out.print("\nIngrese el código del paciente: \n> ");
                                String codigoEliminar = input.next();
                                for (Paciente paciente : pacientes) {
                                    if (paciente.getCodigo().equals(codigoEliminar)) {
                                        pacientes.remove(paciente);
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("\nOpción inválida");
                        }
                    } while(opcionPaciente != 5);
                    break;
                case 2:
                    int opcionDentista;
                    do {
                        opcionDentista = menuDentistas();

                        switch(opcionDentista) {
                            case 1:
                                System.out.print("\nIngrese el código del dentista: \n> ");
                                String codigo = input.next();
                                System.out.print("\nIngrese el nombre del dentista: \n> ");
                                String nombre = input.next();
                                System.out.print("\nIngrese la especialidad del dentista: \n> ");
                                String especialidad = input.next();

                                dentistas.add(new Dentista(codigo, nombre, especialidad));
                                break;
                            case 2:
                                System.out.print("\nIngrese el código del dentista: \n> ");
                                String codigoBuscar = input.next();
                                for (Dentista dentista : dentistas) {
                                    if (dentista.getCodigo().equals(codigoBuscar)) {
                                        System.out.println("\nDentista encontrado: ");
                                        System.out.println(dentista);
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("\nLista de dentistas: ");
                                for (Dentista dentista : dentistas) {
                                    System.out.println("#" + dentista.getCodigo() + " - " + dentista.getNombre());
                                }
                                break;
                            case 4:
                                System.out.print("\nIngresel el código del dentista: \n> ");
                                String codigoEliminar = input.next();
                                for (Dentista dentista : dentistas) {
                                    if (dentista.getCodigo().equals(codigoEliminar)) {
                                        dentistas.remove(dentista);
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("\nOpción inválida");
                        }
                    } while(opcionDentista != 5);
                    break;
                case 3:
                    int opcionCita;
                    do {
                        opcionCita = menuCitas();

                        switch(opcionCita) {
                            case 1:
                                System.out.print("\nIngrese el código del paciente: \n> ");
                                String codigoPaciente = input.next();
                                System.out.print("\nIngrese el código del dentista: \n> ");
                                String codigoDentista = input.next();
                                System.out.print("\nIngrese la fecha de la cita: \n> ");
                                Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(input.next());
                                System.out.print("\nIngrese la hora de la cita: \n> ");
                                int hora = input.nextInt();
                                System.out.print("\nIngrese la descripcion de la cita: \n> ");
                                String descripcion = input.next();
                                System.out.print("\nIngrese el status de la cita: \n> ");
                                String estatus = input.next();
                                
                                Paciente paciente = pacientes.stream().filter(p -> p.getCodigo().equals(codigoPaciente)).findFirst().get();
                                Dentista dentista = dentistas.stream().filter(d -> d.getCodigo().equals(codigoDentista)).findFirst().get();

                                citas.add(new Cita(paciente, dentista, fecha, hora, descripcion, estatus));
                                break;
                            case 2:
                                System.out.print("\nIngrese el código de la cita: \n> ");
                                int codigoBuscar = input.nextInt();
                                for (Cita cita : citas) {
                                    if (cita.getId() == codigoBuscar) {
                                        System.out.println("\nCita encontrada: ");
                                        System.out.println("Dentista: " + cita.getDentista().getNombre());
                                        System.out.println("Paciente: " + cita.getPaciente().getNombre());
                                        System.out.println("Fecha: " + cita.getFecha());
                                        System.out.println("Hora: " + cita.getHora());
                                        System.out.println("Descripcion: " + cita.getDescripcion());
                                        System.out.println("Estatus: " + cita.getEstatus());
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("\nLista de citas: ");
                                for (Cita cita : citas) {
                                    System.out.println("#" + cita.getId() + " - " + cita.getDentista().getNombre() + " - " + cita.getPaciente().getNombre() + " - " + cita.getFecha());
                                }
                                break;
                            case 4:
                                System.out.print("\nIngrese el código de la cita: \n> ");
                                int codigoEliminar = input.nextInt();
                                for (Cita cita : citas) {
                                    if (cita.getId() == codigoEliminar) {
                                        citas.remove(cita);
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("\nOpción inválida");
                        }              
                    } while(opcion != 4);
            }
        } while(opcion != 4);
    }
}
