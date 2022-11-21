import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio5 {

    public Exercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar? "); int n = sc.nextInt();

        int vetor[] = new int [n];

        int numero;
        for (int i = 0;i < vetor.length; i++){
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            if (numero < 0){
                vetor[i] = numero;
            }
        }
        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0;i < vetor.length; i++){
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }
        sc.close();;
    }
}
