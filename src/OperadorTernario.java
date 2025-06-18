public class OperadorTernario {
    public static void main(String[] args) {

        // EXEMPLO 1: Verificando se a nota é suficiente para passar
        int score = 70;
        // Se score >= 60, retorna "Passou", senão "Reprovou"
        String resultado = score >= 60 ? "Passou" : "Reprovou";
        System.out.println("Resultado da nota: " + resultado);

        // EXEMPLO 2: Verificando se um número é par ou ímpar
        int numero = 3;
        // numero % 2 == 0 verifica se o número é divisível por 2 (ou seja, par)
        String parOuImpar = numero % 2 == 0 ? "Par" : "Ímpar";
        System.out.println("O número " + numero + " é: " + parOuImpar);

        // EXEMPLO 3: Verificando se é AM ou PM com base em horas (formato militar)
        int hora = 13;
        // Se hora < 12, retorna "AM", senão retorna "PM"
        String periodo = hora < 12 ? "AM" : "PM";
        System.out.println("O período é: " + periodo);

        // EXEMPLO 4: Calculando a taxa de imposto com base na renda
        double renda = 60000;
        // Se renda >= 40000, taxa é 0.25 (25%), senão é 0.15 (15%)
        double taxa = renda >= 40000 ? 0.25 : 0.15;
        System.out.println("A taxa de imposto é: " + taxa);

        // EXEMPLO EXTRA: Alterando os valores para testar outros casos
        score = 55;
        resultado = score >= 60 ? "Passou" : "Reprovou";
        System.out.println("Resultado da nota (score 55): " + resultado);

        numero = 4;
        parOuImpar = numero % 2 == 0 ? "Par" : "Ímpar";
        System.out.println("O número " + numero + " é: " + parOuImpar);

        hora = 9;
        periodo = hora < 12 ? "AM" : "PM";
        System.out.println("O período com hora 9 é: " + periodo);

        renda = 30000;
        taxa = renda >= 40000 ? 0.25 : 0.15;
        System.out.println("A taxa de imposto com renda 30.000 é: " + taxa);
    }
}
