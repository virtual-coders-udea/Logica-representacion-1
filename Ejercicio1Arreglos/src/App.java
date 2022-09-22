import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        char opc;

        personas.add(new Persona("Ana", 20, 'F', 1.70));
        personas.add(new Persona("Brian", 30, 'M', 1.75));
        personas.add(new Persona("Isabel", 46, 'F', 1.50));
        personas.add(new Persona("Diana", 34, 'F', 1.65));
        personas.add(new Persona("Juan", 41, 'M', 1.79));

        do {
            opc = Menu();
            System.out.print("\n");
            switch (opc) {
                case '1':

                    String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre de la persona:",
                            "Arreglo de Personas", JOptionPane.INFORMATION_MESSAGE);

                    char sexo = JOptionPane.showInputDialog(null, "Ingrese el sexo de la persona (Ej: F o M):",
                            "Arreglo de Personas", JOptionPane.INFORMATION_MESSAGE).charAt(0);

                    String edad = JOptionPane.showInputDialog(null, "Ingrese la edad de la persona:",
                            "Arreglo de Personas", JOptionPane.INFORMATION_MESSAGE);

                    String estatura = JOptionPane.showInputDialog(null, "Ingrese la estarua de la persona (Ej: 1.70):",
                            "Arreglo de Personas", JOptionPane.INFORMATION_MESSAGE);

                    personas.add(new Persona(nombre, Integer.parseInt(edad), sexo, Double.parseDouble(estatura)));
                    // System.out.println(personas.get(0).nombre);
                    break;

                case '2':
                    for (int i = 0; i < personas.size(); i++) {
                        System.out.println(
                                "Nombre: " + personas.get(i).nombre + "\n" +
                                "Sexo: " + personas.get(i).sexo + "\n" +
                                "Edad: " + personas.get(i).edad + "\n" +
                                "Estatura: " + personas.get(i).estatura + "\n");
                    }
                    break;
                case '3':
                    int contador = 0;
                    int acumulador = 0;

                    for (int i = 0; i < personas.size(); i++) {
                        if (personas.get(i).sexo == 'M') {
                            acumulador = acumulador + personas.get(i).edad;
                            contador++;
                        }
                    }

                    System.out.println("Hay " + contador + " hombres y su promedio de edad es: " + acumulador / contador);
                    break;

                case '5':
                    int personaMayor = 0;
                    int posicion = 0;

                    for (int i = 0; i < personas.size(); i++) {
                        if (personas.get(i).edad > personaMayor) {
                            personaMayor = personas.get(i).edad;
                            posicion = i;
                        }
                    }

                    System.out.println("La persona mayor es: "+ personas.get(posicion).nombre);
                    break;
                default:
                    break;

            }
        } while (opc != '7');
        System.out.print("\n");
    }

    /**
     *
     * menu
     */
    static char Menu() {
        char opcion;
        do {
            opcion = JOptionPane.showInputDialog(null,
                    "1.  Añadir Personas al arreglo\n2.  Mostrar listado original\n3.  Calcular promedio edad hombres\n4.  Calcular promedio estatura mujeres\n5.  Retirar persona de mayor edad\n6.  Mostrar listado final\n7.  Salir",
                    "Menu de Opciones Manejo Cola", JOptionPane.INFORMATION_MESSAGE).charAt(0);
        } while (opcion < '1' || opcion > '7');
        return opcion;
    }
}
