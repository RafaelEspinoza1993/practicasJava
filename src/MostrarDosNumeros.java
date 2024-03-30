import java.util.Scanner;
import java.util.Arrays;

public class MostrarDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Llamamos a la función para obtener los números del usuario
        double[] numeros = obtenerNumeros(scanner);

        // Ordenamos los números de mayor a menor
        Arrays.sort(numeros);
        // Invertimos el orden para que queden de mayor a menor
        for (int i = 0; i < numeros.length / 2; i++) {
            double temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        // Mostramos los números ordenados de mayor a menor
        System.out.println("Los números ingresados ordenados de mayor a menor son: ");
        for (double numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }

    public static double[] obtenerNumeros(Scanner scanner) {
        double[] numeros = new double[2]; // Creamos un array para almacenar los números

        System.out.println("Ingrese el primer número:");
        numeros[0] = scanner.nextDouble(); // Pedimos al usuario el primer número y lo guardamos en el array

        System.out.println("Ingrese el segundo número:");
        numeros[1] = scanner.nextDouble(); // Pedimos al usuario el segundo número y lo guardamos en el array

        return numeros; // Devolvemos el array con los números ingresados
    }
}
