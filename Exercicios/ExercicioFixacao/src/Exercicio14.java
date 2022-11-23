import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Exercicio14 {

    public Exercicio14() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos quartos vão ser alugados?  ");
        int n = sc.nextInt();
        String[][] quartos = new String[10][4];
        alugar(quartos, n);
        quartosOcupados(quartos);
    }

    public void alugar(String[][] matriz, int quantosalugueis) {
        Scanner sc = new Scanner(System.in);
        String[] dados = new String[3];
        dados[0] = "Nome: ";
        dados[1] = "Email: ";
        dados[2] = "Quarto: ";
        for (int i = 0; i < quantosalugueis; i++) {
            System.out.printf("Aluguel #%d\n", i + 1);
            matriz[i][3] = "" + (i + 1);
            for (int j = 0; j < 3; j++) {
                System.out.print(dados[j]);
                matriz[i][j] = sc.nextLine();
            }
        }
    }

    public void quartosOcupados(String[][] matriz) {
        int menor = 0;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][2] != null) {
                menor = parseInt(matriz[i][2]);
                contador++;
            } else ;

        }


        int[] dados = new int[contador];
        int[] sorted = new int[contador];

        System.out.println("Quartos ocupados! ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][2] != null) {
                    dados[i] = parseInt(matriz[i][2]);
                    sorted[i] = i;
                }
            }
        }

        for (int i = 0; i < dados.length; i++) {
            System.out.print("\nQuarto: " + dados[i] + " PessoaMatriz: " + sorted[i]);
            Arrays.sort(dados);
        }
    }
}
