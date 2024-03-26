/*

Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe

 */

import java.util.Scanner;

public class ManejoDeNombres {
    public static void main(String[] args) {
        // Crear un scanner para leer desde la consola
        Scanner scanner = new Scanner(System.in);

        // Solicitar y procesar cada nombre
        String resultado = procesarNombre(obtenerNombre(scanner)) + "_" +
                procesarNombre(obtenerNombre(scanner)) + "_" +
                procesarNombre(obtenerNombre(scanner));

        // Cerrar el scanner
        scanner.close();

        // Imprimir el resultado
        System.out.println(resultado);
    }

    // Método para obtener un nombre desde la consola
    private static String obtenerNombre(Scanner scanner) {
        System.out.print("Ingrese un nombre: ");
        return scanner.nextLine();
    }

    // Método para procesar un nombre según las especificaciones
    private static String procesarNombre(String nombre) {
        // Verificar que el nombre tenga al menos dos caracteres
        if (nombre.length() < 2) {
            System.out.println("El nombre debe tener al menos dos caracteres.");
            return "";
        }

        // Tomar el segundo carácter y convertirlo a mayúscula
        char segundoCaracter = Character.toUpperCase(nombre.charAt(1));

        // Tomar los dos últimos caracteres del nombre
        String ultimosCaracteres = nombre.substring(nombre.length() - 2);

        // Concatenar los resultados y devolver el nuevo nombre
        return segundoCaracter + "." + ultimosCaracteres;
    }
}
