import java.util.Scanner;
/*
    La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
    Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
    Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales.
    Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
    Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
    Por ejemplo, el resultado podría ser algo así:
    La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882



    IMPORTANTE: Como nota aparte todas las tareas publicadas en el curso son opcionales,
    no afecta en nada en el avance del curso ni en el temario, tampoco afecta en la entrega
    final del diploma o reconocimiento por haber finalizado el curso, son 100% opcionales y
    todas traen incluidas el código de solución.
    Así es como funciona el sistema de tareas de udemy, las tareas no quedan marcadas con
    checked (como realizadas), esta funcionalidad no tiene nada que ver con nuestro curso
    ni el instructor, así es como funciona la plataforma de Udemy.
*/
public class DetalleDeFactura {
    private static final Scanner helperScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String titulo = obtenerProducto();
        double valorPrimerProducto = obtenerValor("primer");
        double valorSegundoProducto = obtenerValor("segundo");
        double sumaValorBruto =valorPrimerProducto + valorSegundoProducto;
        double impuesto = sumaValorBruto * 0.19F;
        double sumarImpuesto = sumaValorBruto + impuesto;
        System.out.println("La factura con nombre o descripcion: '" + titulo + "' tiene un total bruto de " + sumaValorBruto + ", con un impuesto de " + impuesto + " y el monto después de impuesto es de " + sumarImpuesto);
        helperScanner.close();
    }

    private static String obtenerProducto(){
        String titulo = "default";
        boolean checkWhile = true;
        while (checkWhile) {
            try {
                System.out.println("Ingrese un nombre o descripcion para la factura:");
                titulo = helperScanner.nextLine();
                checkWhile = false;
            } catch (Exception e){
                System.out.println("Error debe ingresar un nombre o descripcion. No un numero");
                helperScanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        return titulo;
    }
    private static double obtenerValor(String orden){
        double valor = 0;
        boolean checkWhile = true;
        while (checkWhile) {
            try {
                System.out.println("Ingrese valor del " + orden + " producto:*");
                valor = helperScanner.nextDouble();
                helperScanner.nextLine();
                checkWhile = false;
            } catch (Exception e){
                System.out.println("Error debe ingresar un numero valido. Puedes usar ',' para indicar decimales pero no '.'");
                helperScanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        return valor;
    }

}
