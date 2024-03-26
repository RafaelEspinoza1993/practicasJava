public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43E-3;
        float f = 12345e2F;
        System.out.println("f = " + f);

        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
