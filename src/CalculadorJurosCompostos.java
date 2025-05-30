import java.util.Scanner;

public class CalculadorJurosCompostos {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declarando as variáveis necessárias
        double principal;     // Valor inicial investido
        double rate;          // Taxa de juros em formato decimal
        int timesCompounded;  // Número de vezes que os juros são compostos por ano
        int years;            // Número de anos de investimento
        double amount;        // Valor final após os juros compostos

        // Solicitando o valor principal (investimento inicial)
        System.out.print("Digite o valor principal (ex: 10000): ");
        principal = scanner.nextDouble();

        // Solicitando a taxa de juros (ex: 5 para 5%)
        System.out.print("Digite a taxa de juros (ex: 5 para 5%): ");
        rate = scanner.nextDouble() / 100; // Convertendo porcentagem para decimal

        // Solicitando o número de vezes que os juros são compostos por ano
        System.out.print("Digite o número de vezes que os juros são compostos por ano (ex: 1 = anual, 4 = trimestral): ");
        timesCompounded = scanner.nextInt();

        // Solicitando o número de anos de investimento
        System.out.print("Digite o número de anos de investimento: ");
        years = scanner.nextInt();

        // Fórmula de juros compostos: A = P * (1 + r/n)^(nt)
        amount = principal * Math.pow(1 + (rate / timesCompounded), timesCompounded * years);

        // Exibindo o resultado com formatação
        System.out.printf("Após %d anos, você terá: $%.2f%n", years, amount);

        // Fechando o scanner
        scanner.close();
    }
}
