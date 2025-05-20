import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testar idade

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 65) {
            System.out.println("🧓 Você é um idoso!");
        } else if (idade >= 18) {
            System.out.println("🧑 Você é um adulto!");
        } else if (idade == 0) {
            System.out.println("👶 Você é um bebê!");
        } else if (idade < 0) {
            System.out.println("👻 Você ainda nem nasceu!");
        } else {
            System.out.println("🧒 Você é uma criança!");
        }

        // Strings
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        if (nome.isEmpty()) {
            System.out.println("😠 Você não digitou seu nome!");
        } else {
            System.out.println("😊 Olá, " + nome + "!");
        }

        // Testando valores booleanos
        System.out.println("Você é estudante? (true/false) ");
        boolean estudante = scanner.nextBoolean();

        if(estudante) {
            System.out.println("Você é um estudante");
        } else {
            System.out.println("Você não é um estudante");
        }


        scanner.close();
    }
}
