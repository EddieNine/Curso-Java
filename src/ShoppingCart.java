import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double preco;
        int quantidade;
        char simbolo = '$';
        double total;

        System.out.println("Qual item você deseja comprar? ");
        item = scanner.nextLine();

        System.out.println("Qual o preço por unidade? ");
        preco = scanner.nextDouble();

        System.out.println("Quantos você deseja comprar? ");
        quantidade = scanner.nextInt();

        total = preco * quantidade;

        System.out.println("\nVocê comprou " + quantidade + " " + item + (quantidade > 1 ? "s" : ""));
        System.out.println("Seu total é: " + simbolo + total);

        scanner.close();
    }
}
