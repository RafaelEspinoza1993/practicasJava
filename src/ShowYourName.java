public class ShowYourName {
    public static void main(String[] args) {
        String hola = "Hello, my name is Rafael. Nice to meet you :) ";
        System.out.println(hola);
        System.out.println("hola.toUpperCase() = " + hola.toUpperCase());
        
        int numero = 11;

        boolean valor = true;
        //tomar en cuenta que las variables si quieres usarla en toda la funcion deben estar declaradas, si declaras una variable dentro de un if, solo podras usar esa variable dentro del if
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2= 10;
        }
        System.out.println("numero2 = " + numero2);

        // var podemos considerarlo como el any de typescript, se adapta al valor que se le asigne.
        var numero3 = "15";

        String nombre;

        nombre = "Andres";

        if(numero > 10){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);

        int edadPersona = 5;

        String prueba = numero > numero2 ? "numero a ganado" : "numero perdio";
        System.out.println("prueba = " + prueba);
    }
}
