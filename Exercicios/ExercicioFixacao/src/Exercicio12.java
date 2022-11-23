import java.util.Scanner;

public class Exercicio12 {

    public Exercicio12() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");int n = sc.nextInt();
        int[] vector = new int[n];
        double media = 0;
        int j = 0;

        for (int i = 0;i < vector.length;i++){
            System.out.print("Digite um numero: "); vector[i] = sc.nextInt();
            if (vector[i] % 2 == 0){
                media += vector[i];
                j++;
            }
        }
        if (media != 0){
            System.out.println("MEDIA DOS PARES = " + media / j);
        }
        else{
            System.out.printf("NENHUM NUMERO PAR");
        }

    }
}
