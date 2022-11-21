import java.util.Scanner;

public class Exercicio6 {

    public Exercicio6() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar: ");int n = sc.nextInt();
        double vetor[] = new double[n];

        double soma = 0;
        for (int i = 0;i < n;i++){
            System.out.print("Digite um numero: ");vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        System.out.print("VALORES = ");
       for (int i=  0;i < vetor.length; i++){
           System.out.printf(" %.1f ", vetor[i]);
       }
        System.out.printf("\nSOMA = %.1f\n", soma);
        System.out.printf("MEDIA = %.1f", (soma / vetor.length));
    }

}
