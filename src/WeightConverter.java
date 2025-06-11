import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o objeto scanner para capturar a entrada do usuário

        // Exibe o menu de opções
        System.out.println("Conversor de Peso");
        System.out.println("Digite 1 para converter de kg para libras");
        System.out.println("Digite 2 para converter de libras para kg");

        int escolha = scanner.nextInt(); // Lê a escolha do usuário (1 ou 2)

        // Se o usuário escolheu 1, faz a conversão de quilos para libras
        if (escolha == 1) {
            System.out.print("Digite o peso em quilos: ");
            double kg = scanner.nextDouble(); // Lê o valor em quilos
            double libras = kg * 2.20462;     // Realiza a conversão para libras
            System.out.printf("Resultado: %.2f libras%n", libras); // Exibe o resultado formatado
        }

        // Se o usuário escolheu 2, faz a conversão de libras para quilos
        if (escolha == 2) {
            System.out.print("Digite o peso em libras: ");
            double libras = scanner.nextDouble(); // Lê o valor em libras
            double kg = libras / 2.20462;         // Realiza a conversão para quilos
            System.out.printf("Resultado: %.2f quilos%n", kg); // Exibe o resultado formatado
        }

        // Se a escolha for diferente de 1 ou 2, mostra que a opção é inválida
        if (escolha != 1 && escolha != 2) {
            System.out.println("Opção inválida."); // Mensagem de erro
        }

        scanner.close(); // Fecha o scanner (boa prática)
    }
}
