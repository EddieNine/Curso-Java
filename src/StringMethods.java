public class StringMethods {
    public static void main(String[] args) {
        // Criando uma variável do tipo String com seu nome completo
        String name = "Edcarlos cruz";

        // 1. length() – Verifica o comprimento da string
        int length = name.length(); // Retorna o número de caracteres na string
        System.out.println("Tamanho da string: " + length);

        // 2. charAt() – Retorna o caractere em uma posição específica (índice)
        char letter = name.charAt(0); // Retorna o caractere na posição 0
        System.out.println("Caractere no índice 0: " + letter);

        // 3. indexOf() – Retorna a posição da primeira ocorrência de um caractere
        int index = name.indexOf('o'); // Posição da primeira letra 'o'
        System.out.println("Primeiro índice de 'o': " + index);

        // lastIndexOf() – Retorna a posição da última ocorrência de um caractere
        int lastIndex = name.lastIndexOf('o');
        System.out.println("Último índice de 'o': " + lastIndex);

        // 4. toUpperCase() – Converte todos os caracteres para maiúsculo
        name = name.toUpperCase();
        System.out.println("Tudo maiúsculo: " + name);

        // toLowerCase() – Converte todos os caracteres para minúsculo
        name = name.toLowerCase();
        System.out.println("Tudo minúsculo: " + name);

        // 5. trim() – Remove espaços em branco no início e fim da string
        name = "   Edcarlos cruz   "; // Adicionando espaços extras
        System.out.println("Com espaços: '" + name + "'");
        name = name.trim(); // Remove espaços
        System.out.println("Sem espaços: '" + name + "'");

        // 6. replace() – Substitui caracteres na string
        name = name.replace('o', 'a'); // Substitui 'o' por 'a'
        System.out.println("Depois do replace: " + name);

        // 7. isEmpty() – Verifica se a string está vazia
        System.out.println("Está vazia? " + name.isEmpty()); // false

        // 8. contains() – Verifica se contém determinado caractere ou substring
        if (name.contains(" ")) {
            System.out.println("Seu nome contém um espaço.");
        } else {
            System.out.println("Seu nome não contém espaços.");
        }

        // 9. equals() – Compara duas strings (case-sensitive)
        if (name.equals("password")) {
            System.out.println("Seu nome não pode ser 'password'.");
        } else {
            System.out.println("Olá, " + name);
        }

        // 10. equalsIgnoreCase() – Compara ignorando maiúsculas/minúsculas
        if (name.equalsIgnoreCase("EDCARLOS CRUZ")) {
            System.out.println("As strings são iguais (ignorado maiúsculas/minúsculas).");
        } else {
            System.out.println("As strings são diferentes.");
        }
    }
}
