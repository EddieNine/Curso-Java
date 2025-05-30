public class printf {
    public static void main(String[] args) {

        // Declaração de variáveis de diferentes tipos
        String name = "Bob esponja";
        char firstLetter = 'b';
        int age = 30;
        double height = 50.5;
        boolean estaAtivo = true;

        // %s → placeholder para strings
        // \n → quebra de linha
        System.out.printf("Hello %s\n", name); // Saída: Hello Bob esponja

        // %c → placeholder para um único caractere
        System.out.printf("Your name starts with %c\n", firstLetter); // Saída: Your name starts with b

        // %d → placeholder para inteiros (d = decimal)
        System.out.printf("You are %d years old\n", age); // Saída: You are 30 years old

        // %.1f → placeholder para números de ponto flutuante com 1 casa decimal
        System.out.printf("You are %.1f inches tall\n", height); // Saída: You are 50.5 inches tall

        // %b → placeholder para valores booleanos (true/false)
        System.out.printf("Employed: %b\n", estaAtivo); // Saída: Employed: true
    }
}
