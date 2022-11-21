package aplicações;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {

    public Exemplo01() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDe quantas pessoas deve ser calculado a média?: ");
        int n = sc.nextInt();
        double [] vetor = new double[n];
        System.out.printf("\nA média das Alturas é de :  %.2f",  Altura(vetor, n));
    }

    public double Altura(double vetor[], int numerodepessoas){
        double somatoria = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i < numerodepessoas;i++){
            System.out.print("Pessoa de numero "+ (i+1) + " ");
            vetor[i] = sc.nextDouble();
            somatoria += vetor[i];
        }
        for (int i = 0;i < numerodepessoas;i++){
            System.out.print(", " + vetor[i]);
        }
        sc.close();
        return somatoria / numerodepessoas;
    }
}
