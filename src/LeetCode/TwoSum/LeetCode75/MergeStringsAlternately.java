package LeetCode.TwoSum.LeetCode75;

public class MergeStringsAlternately {

    // method que vai fazer a junção alternada de letras de duas palavras
    // Este method NÃO é static, então precisa de um objeto da classe para ser usado
    public String mergeAlternately(String word1, String word2) {
        // StringBuilder é usado para juntar os caracteres de forma eficiente
        StringBuilder merged = new StringBuilder();

        // Criamos um índice que será usado para percorrer as letras das palavras
        int i = 0;

        // Enquanto ainda tiver letras em uma das duas palavras
        while (i < word1.length() || i < word2.length()) {

            // Se ainda houver uma letra em word1 na posição i, adiciona ao resultado
            if (i < word1.length()) {
                merged.append(word1.charAt(i)); // Pega a letra da posição i de word1
            }

            // Se ainda houver uma letra em word2 na posição i, adiciona ao resultado
            if (i < word2.length()) {
                merged.append(word2.charAt(i)); // Pega a letra da posição i de word2
            }

            // Passa para o próximo índice (posição da letra)
            i++;
        }

        // Quando terminar, transforma o conteúdo do StringBuilder em uma String e retorna
        return merged.toString();
    }

    // method principal que roda quando o programa é executado
    public static void main(String[] args) {
        // Criamos um objeto da classe MergeStrings para usar o method mergeAlternately
        MergeStringsAlternately obj = new MergeStringsAlternately();

        // Chamamos o method passando duas palavras e mostramos o resultado no terminal
        System.out.println(obj.mergeAlternately("abc", "pqr"));   // Saída: apbqcr
        System.out.println(obj.mergeAlternately("ab", "pqrs"));   // Saída: apbqrs
        System.out.println(obj.mergeAlternately("abcd", "pq"));   // Saída: apbqcd
    }
}
