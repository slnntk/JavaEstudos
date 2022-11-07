import java.util.Locale;
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
           System.out.println("São Multiplos");
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

    public void Exercicio05(){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int item = sc.nextInt();
        int quantidade = sc.nextInt();
        
        double valor = 0;
        if (item == 1){
            valor =  4 * quantidade;
        }
        else if (item == 2){
            valor =  4.50 * quantidade;
        }
        else if (item == 3){
            valor =  5 * quantidade;
        }
        else if (item == 4){
            valor =  2 * quantidade;
        }
        else if (item == 5){
            valor = 1.5 * quantidade;
        }
        else{
            System.out.println("PRODUTO INDISPONIVEL");
        }
        sc.close();

        System.out.printf("\nTotal: R$%.2f", valor);
    }

    public void Exercicio06(){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double intervalo = sc.nextDouble();

        if (intervalo  < 0 || intervalo > 100){
            System.out.println("Fora de intervalo.");
        }
        else if (intervalo <= 25){
            System.out.println("Intervalo: " + "(0,25]");
        }
        else if (intervalo <= 50){
            System.out.println("Intervalo: " + "(25,50]");
        }
        else if (intervalo <= 75){
            System.out.println("Intervalo: " + "(50,75]");
        }
        else if (intervalo <= 100){
            System.out.println("Intervalo: " + "(75,100]");
        }
    }

    public void Exercicio07(){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0){
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0){
            System.out.println("Q4");
        }
        else{
            System.out.println("Origem");
        }
    }

    public void Exercicio08(){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double renda = sc.nextDouble();
        double imposto = 0;

        if (renda <= 2000){
            imposto = 0;
        }
        else if (renda <= 3000){
            imposto = (renda - 2000) * 0.08;
        }
        else if (renda <= 4500){
            imposto = (renda - 3000) * 0.18 + 1000 * 0.08;
        }
        else if (renda > 4500){
            imposto = (renda - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (imposto == 0.0){
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$: %.2f", imposto);
        }


    }






}
