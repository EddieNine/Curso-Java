public class NestedIfStatement {
    public static void main(String[] args) {

        // Variáveis booleanas indicando se a pessoa é estudante ou idosa
        boolean isStudent = true;   // Altere para true ou false para testar
        boolean isSenior = true;    // Altere para true ou false para testar

        // Preço original do ingresso
        double price = 9.99;

        // Verifica se a pessoa é estudante
        if (isStudent) {
            System.out.println("Você recebeu um desconto de estudante de 10%.");
            price *= 0.9;  // Aplica 10% de desconto (90% do valor original)

            // Dentro do if de estudante, verifica se também é idoso
            if (isSenior) {
                System.out.println("Você também recebeu um desconto de idoso de 20%.");
                price = 9.99 * 0.7;  // Aplica desconto combinado (30%)
            }
        }
        // Se não for estudante
        else {
            // Verifica se é idoso
            if (isSenior) {
                System.out.println("Você recebeu um desconto de idoso de 20%.");
                price *= 0.8;  // Aplica 20% de desconto
            } else {
                // Nenhum desconto aplicado
                price *= 1;  // Mantém o preço original
            }
        }

        // Imprime o valor final com duas casas decimais
        System.out.printf("O preço final do ingresso é: R$ %.2f\n", price);
    }
}
