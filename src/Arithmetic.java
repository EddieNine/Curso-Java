public class Arithmetic {
    public static void main(String[] args) {
        // Operadores Aritméticos Básicos
        int x = 10;
        int y = 2;
        int z;

        z = x + y; // Adição: z = 12
        z = x - y; // Subtração: z = 8
        z = x * y; // Multiplicação: z = 20
        z = x / y; // Divisão: z = 5
        z = x % 3; // z = 1 (resto da divisão)

        // Operadores de Atribuição Composta
        // int x = 10;
        x += 3; // x agora é 13
        x -= 2; // x agora é 11
        x *= 2; // x agora é 22
        x /= 2; // x agora é 11

        // Incremento e Decremento
        // int x = 5;
        x++; // x = 6
        x--; // x = 5

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Divisão de Inteiros vs Doubles
        int a = 10;
        int b = 3;
        int resultado = a / b; // 3 (não 3.33!)

        // double resultado = a / 3.0; // 3.3333

        // Ordem de Operações (PEMDAS)
        // double resultado = 3 + 4 * (7 - 5) / 2.0;
        /*
        Parênteses: (7 - 5) = 2
        Multiplicação: 4 * 2 = 8
        Divisão: 8 / 2.0 = 4.0
        Adição: 3 + 4.0 = 7.0
         */

    }
}
