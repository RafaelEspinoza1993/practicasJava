public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat= 1.5e-10F; // cuando llega a correr tanto la coma se muestra en la consola directamente un resultado cientifico
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo byte corresponde en byte a " + Float.BYTES);
        System.out.println("tipo byte corresponde en bite a " + Float.SIZE);
        System.out.println("valor maximo de un byte: " + Float.MAX_VALUE);
        System.out.println("valor maximo de un byte: " + Float.MIN_VALUE);

        double realDouble = 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo byte corresponde en byte a " + Double.BYTES);
        System.out.println("tipo byte corresponde en bite a " + Double.SIZE);
        System.out.println("valor maximo de un byte: " + Double.MAX_VALUE);
        System.out.println("valor maximo de un byte: " + Double.MIN_VALUE);

        var varFlotante = 3.1416F;
        System.out.println("varFlotante = " + varFlotante);
    }
}
