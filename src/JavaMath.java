import java.util.Scanner;

public class JavaMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercicio 1
        System.out.print("Digite o valor do lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("A hipotenusa é: %.2f cm\n", c);

        // Exercicio 2
        System.out.println("Digite o raio: ");
        double raio = scanner.nextDouble();

        double circunferencia = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.printf("Circunferencia: %.2f", circunferencia);
        System.out.printf("\nArea: %.2f", area);
        System.out.printf("\nVolume: %.2f", volume);

        scanner.close();
    }
}
