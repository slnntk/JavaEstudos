import java.util.Scanner;

public class Exercicio9 {

    public Exercicio9() {

        System.out.print("Quantos numeros voce vai digitar?: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        float vetor[] = new float[n];
        float maior[] = new float[2];

        maior[0] = 0;
        for(int i = 0;i < vetor.length;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextFloat();
            if (maior[0] < vetor[i]){
                maior[0] = vetor[i];
                maior[1] = i;
             }
        }

        System.out.println("MAIOR VALOR = " + maior[0] +
                       "\nPOSICAO DO MAIOR VALOR = " + maior[1]);

    }
}
