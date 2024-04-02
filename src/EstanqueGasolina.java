import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la medida actual del estanque en litros:");
        double medidaActual = scanner.nextDouble();
        String medidaTexto = verificarEstanque(medidaActual);
        System.out.println(medidaTexto);
        scanner.close();
    }

    private static String verificarEstanque(double medidaActual) {
        if (medidaActual == 70) {
            return "Estanque lleno";
        } else if (medidaActual >= 60 && medidaActual < 70) {
            return "Estanque casi lleno";
        } else if (medidaActual >= 40 && medidaActual < 60) {
            return "Estanque 3/4";
        } else if (medidaActual >= 35 && medidaActual < 40) {
            return "Medio Estanque";
        } else if (medidaActual >= 20 && medidaActual < 35) {
            return "Suficiente";
        } else if (medidaActual > 0 && medidaActual < 20) {
            return "Insuficiente";
        } else {
            return "Medida inválida";
        }
    }
}
