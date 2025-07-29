// Importamos a classe Scanner para permitir a entrada de dados pelo teclado
import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {

        // Criamos um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variáveis necessárias
        // temp: temperatura informada pelo usuário
        // newTemp: temperatura convertida
        // unit: unidade de conversão (C ou F)
        double temp;
        double newTemp;
        String unit;

        // Pedimos ao usuário que informe a temperatura
        System.out.print("Digite a temperatura: ");
        temp = scanner.nextDouble(); // Captura um número do tipo double

        // Perguntamos para qual unidade ele quer converter (C ou F)
        System.out.print("Converter para Celsius ou Fahrenheit (C/F): ");
        unit = scanner.next().toUpperCase();
        // toUpperCase(): garante que a letra digitada fique em maiúsculo

        /*
         * Agora utilizamos o operador ternário para fazer a conversão:
         *
         * - Se o usuário digitou "C", significa que ele quer converter de Fahrenheit para Celsius
         *   Fórmula: (temp - 32) * 5 / 9
         *
         * - Caso contrário (F), significa que ele quer converter de Celsius para Fahrenheit
         *   Fórmula: (temp * 9 / 5) + 32
         */
        newTemp = unit.equals("C")
                ? (temp - 32) * 5 / 9
                : (temp * 9 / 5) + 32;

        // Exibimos o resultado formatado com apenas 1 casa decimal
        // %.1f = número decimal com uma casa
        // %s = texto (nossa unidade)
        System.out.printf("A temperatura convertida é: %.1f°%s\n", newTemp, unit);

        // Fechamos o Scanner para liberar os recursos
        scanner.close();
    }
}
