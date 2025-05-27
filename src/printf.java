public class printf {
    public static void main(String[] args) {
        String name = "Bob esponja";
        char firstLetter = 'b';
        int age = 30;
        double height = 50.5;
        boolean estaAtivo = true;

        System.out.printf("Hello %s\n", name);              // Hello Bob esponja
        System.out.printf("Your name starts with %c\n", firstLetter); // Your name starts with B
        System.out.printf("You are %d years old\n", age);  // You are 30 years old
        System.out.printf("You are %.1f inches tall\n", height); // You are 50.5 inches tall
        System.out.printf("Employed: %b\n", estaAtivo);   // Está ativo: true

    }
}
