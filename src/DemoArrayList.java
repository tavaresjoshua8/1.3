import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DemoArrayList {
    ArrayList<String> miAList = new ArrayList<>();
    // Declarando y creando un objeto de tipo ArrayList

    public static void main(String args[]) {
        DemoArrayList objArray = new DemoArrayList();
        objArray.menu();
    }

    public void menu() {
        String op;
        do {
            op = JOptionPane.showInputDialog(null, "1. Introducir dato\n"
                    + "2. Modificar dato\n"
                    + "3. Eliminar dato\n"
                    + "4. Buscar dato\n"
                    + "5. Mostrar datos\n"
                    + "6. Salir");
            switch (op) {
                case "1":// Bloque para introducir datos al array list
                    String a;
                    a = JOptionPane.showInputDialog(null, "Capture un dato: ");
                    miAList.add(a); // Método add - permite agregar elementos al ArrayList
                    break;
                case "2":// Bloque para Modificar un dato del arrayList
                    String b, c;
                    int indice;
                    b = JOptionPane.showInputDialog(null, "Ingrese el dato a Modificar: ");
                    if (miAList.contains(b)) {
                        indice = miAList.indexOf(b);
                        c = JOptionPane.showInputDialog(null, "Ingrese el nuevo dato: ");
                        miAList.set(indice, c);// Método set - permite actualizar elementos al ArrayList
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe el dato a modificar !", "",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "3":// Bloque para eliminar un dato del arrayList
                    b = JOptionPane.showInputDialog(null, "Ingrese el dato a eliminar: ");
                    for (int i = 0; i < miAList.size(); i++) {
                        if (miAList.get(i).equals(b)) {
                            miAList.remove(i);// Método remove - permite eliminar elementos del ArrayList
                        }
                    }
                    break;
                case "4":// Bloque para buscar datos en el array list
                    String mostrarDatos = "No se ha encontrado nada!";
                    c = JOptionPane.showInputDialog(null, "Ingrese el dato a buscar: ");
                    for (int i = 0; i < miAList.size(); i++) {
                        if (miAList.get(i).equals(c)) {
                            mostrarDatos = "";
                            mostrarDatos += "El dato esta en la posición " + i + " : " + miAList.get(i);
                        }
                    }
                    JOptionPane.showMessageDialog(null, mostrarDatos);
                    break;
                case "5":// Bloque para mostar los datos del array list
                    String Salida = "";
                    for (int i = 0; i < miAList.size(); i++) {
                        Salida += "Número de posición " + i + " : " + miAList.get(i) + "\n";
                    }
                    JOptionPane.showMessageDialog(null, Salida);
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida !");
                    break;
            }
        } while (!op.equals("6"));
    }
}