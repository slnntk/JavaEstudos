public class Main {
    public static void main(String[] args) {
        String produto1 = "Computer";
        String produto2 = "Offce desk";

        int idade = 30;
        int codigos = 5290;
        char genero = 'F';

        double preco1 = 2100;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.printf("Produtos:\n%s, cujo o preço é R$ %.2f\n" +
                "%s, cujo o preco é R$ %.2f" +
                "\n\nRecordes: %d anos, fez %d códigos e é do gênero %c\n",
                produto1, preco1, produto2, preco2, idade, codigos, genero);
        System.out.printf("\nMedida com oito casas decimais: %.8f " +
                          "\nMedida com 3 casas decimais: %.3f", medida, medida);
    }
}