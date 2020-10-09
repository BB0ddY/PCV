public class Kuzel2 {

    public static void main(String[] args) {
        double polomerK = 7, vyskaK = 9, objK, obsK;

        obsK = Math.PI * polomerK * (polomerK + Math.sqrt(vyskaK * vyskaK + polomerK * polomerK));

        objK = 1.0 / 3 * (Math.PI * polomerK * polomerK * vyskaK);

        System.out.format("Obsah kuzelu je = %.3f\n", obsK);
        System.out.format("Objem kuzelu je = %.3f\n", objK);
    }
}
