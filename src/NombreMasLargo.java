import javax.swing.JOptionPane;

public class NombreMasLargo {
    public static void main(String[] args) {
        // Pedir el nombre completo de tres personas
        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre completo de la primera persona:");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre completo de la segunda persona:");
        String nombre3 = JOptionPane.showInputDialog("Ingrese el nombre completo de la tercera persona:");

        // Obtener el nombre más largo
        String nombreMasLargo = obtenerNombreMasLargo(nombre1, nombre2, nombre3);

        // Imprimir el resultado
        JOptionPane.showMessageDialog(null, nombreMasLargo + " tiene el nombre más largo.");
    }

    public static String obtenerNombreMasLargo(String nombre1, String nombre2, String nombre3) {
        // Obtener la longitud de cada nombre
        int longitud1 = obtenerLongitudNombre(nombre1);
        int longitud2 = obtenerLongitudNombre(nombre2);
        int longitud3 = obtenerLongitudNombre(nombre3);

        // Comparar las longitudes y devolver el nombre más largo
        if (longitud1 >= longitud2 && longitud1 >= longitud3) {
            return nombre1;
        } else if (longitud2 >= longitud1 && longitud2 >= longitud3) {
            return nombre2;
        } else {
            return nombre3;
        }
    }

    public static int obtenerLongitudNombre(String nombreCompleto) {
        // Dividir el nombre completo en nombre y apellido
        String[] partes = nombreCompleto.split(" ");
        // Devolver la longitud del nombre (parte en el índice 0)
        return partes[0].length();
    }
}
