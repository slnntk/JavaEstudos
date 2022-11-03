import java.util.Scanner;

public class Exercicios {

    public void Exercicio01(){
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();

        if (numero < 0){
            System.out.println("NEGATIVO");
        }
        else{
            System.out.println("NÃO NEGATIVO");
        }
    }

    public void Exercicio02(){
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();

        if (numero % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
    }

    public void Exercicio03(){
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

       if (A % B == 0 || B % A == 0){
           System.out.printf("São Multiplos");
       }
       else{
           System.out.println("Não são multiplos");
       }
    }

    public void Exercicio04(){
        Scanner sc = new Scanner(System.in);
        int HORA1 = sc.nextInt();
        int HORA2 = sc.nextInt();

        if (HORA1 > HORA2){
            int FINAL = (24 - HORA1) + HORA2;
            System.out.printf("\nO JOGO DUROU %d HORA(S)", FINAL);
        }
        else{
            int FINAL = HORA2 - HORA1;
            System.out.printf("\nO JOGO DUROU %d HORA(S)", FINAL);
        }
    }

    




}
