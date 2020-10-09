import java.util.Scanner;

public class Kuzel {

    public static void main(String[] args) {
        double polomerK, vyskaK, objK, obsK;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Urci polomer podstavy:");
        polomerK = scanner.nextDouble();

        System.out.println("Urci vysku kuzela:");
        vyskaK = scanner.nextDouble();

        obsK = Math.PI * polomerK * (polomerK + Math.sqrt(vyskaK * vyskaK + polomerK * polomerK));

        objK = 1.0 / 3 * (Math.PI * polomerK * polomerK * vyskaK);

        System.out.format("Obsah kuzelu je = %.3f\n", obsK);
        System.out.format("Objem kuzelu je = %.3f\n", objK);
    }
}