import java.util.Scanner;

public class Exercicio7 {


    Scanner sc = new Scanner(System.in);private int velhos = 0;

    public Exercicio7() {
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        String dados[][] = new String[n][3];

        digitacao(dados);

        System.out.printf("Altura media: %.2f", alturaMedia(dados));
        double temporario = (float) ((idadePorcentagem(dados).length - velhos) * 100) / dados.length;
        System.out.println("\nPessoas com menos de 16 anos: " + temporario);
        for (int i = 0; i < (dados.length);i++){
            if (idadePorcentagem(dados)[i] != null){
                System.out.print(idadePorcentagem(dados)[i] + ",");
            }
            else;
        }
    }
    public void digitacao(String vetordepessoas[][]) {

        for (int i = 0; i < vetordepessoas.length; i++) {
            System.out.printf("Dados da %dº pessoa: ", i+1);
            System.out.print("\nNome: ");vetordepessoas[i][0] = sc.next();
            System.out.print("Idade: ");vetordepessoas[i][1] = sc.next();
            System.out.print("Altura: ");vetordepessoas[i][2] = sc.next();
        }
        alturaMedia(vetordepessoas);
    }
    public double alturaMedia(String vetordepessoas[][]){
        double temporaria = 0;
        for (int i = 0; i < vetordepessoas.length; i++) {
                temporaria += Double.parseDouble(vetordepessoas[i][2]);
        }
        return temporaria / vetordepessoas.length;
    }
    public String[] idadePorcentagem(String vetordepessoas[][]){
        String temporario[] = new String[vetordepessoas.length];
        for (int i = 0; i < temporario.length;i++) {
            if (Double.parseDouble(vetordepessoas[i][1]) < 16) {
                temporario[i] = vetordepessoas[i][0];
            }
            else if (Double.parseDouble(vetordepessoas[i][1]) >= 16) {
                this.velhos++;
            }
        }
        return temporario;
    }
}
