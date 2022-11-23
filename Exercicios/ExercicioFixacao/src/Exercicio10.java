import java.util.Scanner;

public class Exercicio10 {

    public Exercicio10() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0;i < A.length;i++){
            System.out.printf("A[%d]: ", i);
            A[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0;i < A.length;i++){
            System.out.printf("B[%d]: ", i);
            B[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0;i < A.length;i++){
            A[i] = A[i] + B[i];
            System.out.println(A[i]);
        }

    }
}
