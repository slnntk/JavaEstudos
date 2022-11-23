import java.util.Scanner;

public class Exercicio11 {

    public Exercicio11() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double [] vetor = new double[n];
        double media = 0;

        for(int i = 0;i < vetor.length;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            media += vetor[i];
        }
        media = media / vetor.length;
        sc.close();
        System.out.println("\nMEDIA DO VETOR = " + media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0;i < vetor.length;i++){
            if (vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }

    }

}
