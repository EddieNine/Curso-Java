import java.util.Locale;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double largura = 0;
        double altura = 0;
        double area = 0;

        System.out.print("Digite a largura: ");
        largura = scanner.nextDouble();

        System.out.print("Digite a altura: ");
        altura = scanner.nextDouble();
        
        area = largura * altura;
        System.out.println("A área do rantângulo é: " + area);


        scanner.close();
    }
}
