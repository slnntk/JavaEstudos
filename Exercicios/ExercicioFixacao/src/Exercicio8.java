import java.util.Scanner;

public class Exercicio8 {

    public Exercicio8() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt() + 1;

        int[] vetor = new int[n];

        for (int i = 1;i < vetor.length;i++){
            System.out.print("Digite um numero: ");
            int temporario = sc.nextInt();
            if (temporario % 2 == 0){
                vetor[i] = temporario;
                vetor[0] ++;
            }
        }

        int [] sequencia = new int[vetor[0]];

        int j = 0;
        for (int i = 1;i < vetor.length;i++){
            if (vetor[i] % 2 == 0 && vetor[i] != 0){
                sequencia[j] = vetor[i];
                j++;
            }
        }

        System.out.println("\nNumero de pares : " + vetor[0]);

        for (int i = 0;i < j;i++){
            System.out.print(sequencia[i] + " ");
        }


    }
}
