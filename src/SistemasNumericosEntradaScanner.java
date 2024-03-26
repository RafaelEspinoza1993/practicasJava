import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner consoleGetData = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:*");
        int numeroDecimal = 0;

        try {
            numeroDecimal = consoleGetData.nextInt();

        } catch (Exception e){
            System.out.println("Error debe ingresar un numero entero");
            main(args);

            System.exit(0);
        }

        String mensaje = getMensaje(numeroDecimal);

        System.out.println(mensaje);
    }

    private static String getMensaje(int numeroDecimal) {
        String mensajeDecimal = "numeroDecimal = " + numeroDecimal;
        String mensajeBinario = "numero binario de  = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "numeroOctal = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHex =  "numeroHex = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeDecimal;
        mensaje += "\n" + mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHex;
        return mensaje;
    }
}
