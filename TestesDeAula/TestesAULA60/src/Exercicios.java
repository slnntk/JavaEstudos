
import java.util.Scanner;

public class Exercicios {

    public void MaiorNumero1(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números quer?: ");
        double x = sc.nextDouble();
        double numeros;
        double maior = 0;
        System.out.printf("Digite %.0f números: ", x);

        for (int i = 0;i < x;i++)
        {
            System.out.printf("Numero [%d] ", i + 1);
            numeros = sc.nextDouble();
            if (i == 0){
                maior = numeros;
            }
            else{
                if (numeros > maior){
                    maior = numeros;
                }
            }
        }
        System.out.printf("O maior é: %.0f", maior);
    }

    public void MaiorNumero2(){


        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números quer?: ");
        int x = sc.nextInt();
        int [] vetor = new int [x];

        System.out.printf("Digite %d números", x);
        for (int i = 0;i < x;i++){
            System.out.printf("Numero [%d] ", i + 1);
            vetor[i] = sc.nextInt();
        }
        mostrarResult(max(vetor, vetor.length));
    }

    public int max(int vetor[], int tamanhoVetor){

        int maior = vetor[0];
        for (int i = 0;i < tamanhoVetor;i++){

            if (vetor[i] > maior){
                maior = vetor[i];
            }

        }
        return maior;
    }

    public void mostrarResult(int maiorvalor){
        System.out.println("O maior valor é: " + maiorvalor);
    }


}
