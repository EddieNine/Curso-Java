// É necessário importar a classe 'Scanner' para que possamos ler a entrada do teclado do usuário.
import java.util.Scanner;

public class FatiadorEmail {

    public static void main(String[] args) {

        // 1. CRIAÇÃO DO SCANNER
        // Criamos um objeto da classe Scanner que vai "escutar" a entrada do sistema (System.in),
        // ou seja, o que o usuário digitar no console.
        Scanner scanner = new Scanner(System.in);

        // 2. INTERAÇÃO COM O USUÁRIO
        // Exibimos uma mensagem na tela pedindo para o usuário digitar seu e-mail.
        // Usamos print() em vez de println() para que o cursor do usuário fique na mesma linha.
        System.out.print("Digite o seu e-mail para fatiar: ");

        // Lemos a linha inteira que o usuário digitou e a armazenamos na variável 'email'.
        String email = scanner.nextLine();

        // 3. VALIDAÇÃO E LÓGICA PRINCIPAL
        // Antes de tentar fatiar, verificamos se o texto digitado contém o caractere '@'.
        // Isso é uma validação simples para evitar erros se o usuário digitar um e-mail inválido.
        if (email.contains("@")) {

            // Se o e-mail contém '@', o código dentro deste bloco 'if' será executado.

            // Encontramos a posição (o índice numérico) do caractere '@' dentro da String do e-mail.
            int posicaoDoArroba = email.indexOf('@');

            // Usamos o método substring() para extrair o nome de usuário.
            // O corte começa no índice 0 e vai ATÉ a posição do '@' (sem incluir o próprio '@').
            String nomeDeUsuario = email.substring(0, posicaoDoArroba);

            // Usamos o substring() novamente para extrair o domínio.
            // O corte começa na posição LOGO APÓS o '@' (por isso somamos +1) e vai até o final da String.
            String dominio = email.substring(posicaoDoArroba + 1);

            // 4. EXIBIÇÃO DO RESULTADO
            // Imprimimos o resultado de forma organizada para o usuário.
            System.out.println("------------------------------------");
            System.out.println("✅ Análise do E-mail Concluída!");
            System.out.println("Seu nome de usuário é: " + nomeDeUsuario);
            System.out.println("O domínio do seu e-mail é: " + dominio);
            System.out.println("------------------------------------");

        } else {

            // Se o e-mail NÃO contém '@', o código dentro do bloco 'else' será executado.
            System.out.println("------------------------------------");
            System.out.println("❌ Erro: E-mail inválido! O e-mail deve conter o caractere '@'.");
            System.out.println("------------------------------------");
        }

        // 5. FECHAMENTO DO SCANNER
        // É uma boa prática de programação sempre fechar o objeto Scanner quando não for mais usá-lo.
        // Isso libera os recursos do sistema que ele estava utilizando.
        scanner.close();
    }
}
