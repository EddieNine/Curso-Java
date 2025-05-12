import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjetivo;
        String substantivo;
        String adjetivo2;
        String verbo;
        String adjetivo3;

        // Entrada de dados
        System.out.print("Digite um adjetivo: ");
        adjetivo = scanner.nextLine();

        System.out.print("Digite um substantivo: ");
        substantivo = scanner.nextLine();

        System.out.print("Digite outro adjetivo: ");
        adjetivo2 = scanner.nextLine();

        System.out.print("Digite um verbo: ");
        verbo = scanner.nextLine();

        System.out.print("Digite mais um adjetivo: ");
        adjetivo3 = scanner.nextLine();

        // Exibição da história
        System.out.println("\n--- Sua História Maluca ---\n");
        System.out.println("Era uma vez um " + adjetivo + " " + substantivo + ".");
        System.out.println("Ele vivia em uma floresta " + adjetivo2 + " e adorava " + verbo + " todos os dias.");
        System.out.println("Todos diziam que ele era o ser mais " + adjetivo3 + " de toda a região.");

        scanner.close();
    }
}
