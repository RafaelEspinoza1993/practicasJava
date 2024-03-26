import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);

            System.exit(0);
        }

        String mensaje = getMensaje(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);
    }

    private static String getMensaje(int numeroDecimal) {
        String mensajeDecimal = "numeroDecimal = " + numeroDecimal;
        String mensajeBinario = "numero binario de  = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "numeroOctal = " + Integer.toBinaryString(numeroDecimal) + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHex =  "numeroHex = " + Integer.toOctalString(numeroDecimal) + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeDecimal;
        mensaje += "\n" + mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHex;
        return mensaje;
    }
}
