import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

    public void Exercicio01(){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x > 1000 || x < 1){
            x = sc.nextInt();
        }

        for (int i = 1; i < x; i ++){
            if (i % 2 != 0){
                System.out.printf(i + ";");
            }
        }
    }

    public void Exercicio02(){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in = 0;


        for (int i = 0;i < n; i++){
            int x = sc.nextInt();

            if (x <= 20 && x >= 10){
                 in += 1 ;
            }
        }

        System.out.println(in + " Dentro do intervalo [10,20]");
        System.out.println(n - in + " Fora do intervalo [10,20]");
    }

    public void Exercicio03(){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        //RECEBER O NUMERO DE LINHAS !

        int linhas = sc.nextInt();

        double [][] vetor = new double[linhas][3];
        double [] medias = new double[linhas];

        //LAÇO PARA RECEBER O INPUT DOS VALORES DAS NOTAS, EM UM VETOR [LINHAS][3] POR QUE PODEM SER INFINITAS LINHAS MAS SÃO APENAS 3 NOTAS.

        for (int i = 0; i < linhas;i++){
            for (int j = 0;j < 3; j++){
                vetor[i][j] = sc.nextDouble();
            }
        }

        //LAÇO DO CALCULO DA MÉDIA PONDERADA USANDO UM VETOR PARA ARMAZENAS AS MEDIAS !

        for (int i = 0; i < linhas;i++){
                medias[i] = (vetor[i][0] * 2) + (vetor[i][1]* 3) + (vetor[i][2] * 5);
                medias[i] = medias[i] / 10;
        }

        //LAÇO PARA IMPRIMIR OS NUMEROS DIGITADOS E AO LADO AS MEDIAS EM FORMA DE MATRIZ

        for (int i = 0; i < linhas;i++){
            System.out.print(i + 1 + ".");
            for (int j = 0;j < 3; j++){
                System.out.printf(" | " + vetor[i][j]);
            }
            System.out.printf(" Media linha: %.1f\n", medias[i]);
        }
    }

    public void Exercicio04(){

        Scanner sc = new Scanner(System.in);
        int qtdNumeros = sc.nextInt();

        int [][] vetor = new int[qtdNumeros][2];
        int [] saida = new int[qtdNumeros];

        for (int i = 0;i < qtdNumeros;i++){
            for (int j = 0; j < 2;j++){
                vetor[i][j] = sc.nextInt();
            }
        }

        for (int i = 0;i < qtdNumeros;i++){
            for (int j = 0; j < 2;j++){
                System.out.print(" |" + vetor[i][j]);
            }
            if (vetor[i][1] == 0){
                System.out.print("   -> divisao impossivel");
            }
            else{
                saida[i] = vetor[i][0] / vetor[i][1];
                System.out.print("   -> " + saida[i]);
            }
            System.out.println();
        }
    }

    public void Exercicio05(){

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        int fatorialN = 1;

        for (int i = 1;i <= numero;i++){
            fatorialN *= i;
        }
        System.out.println(fatorialN);
    }

    public void Exercicio06(){

        Scanner sc = new Scanner(System.in);
        int inteiro = sc.nextInt();

        for (int i = 1;i <= inteiro;i ++){
            if (inteiro % i == 0){
                System.out.print("," + i);
            }
        }


    }

    public void Exercicio07() {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int linhas = sc.nextInt();

        double[][] vetor = new double[linhas+1][3];

        for (int i = 1; i < linhas+1; i++) {
            vetor[i][0] = i;
            vetor[i][1] = Math.pow(i, 2);
            vetor[i][2] = Math.pow(i, 3);
        }
        for (int i = 1; i < linhas+1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.printf("%.0f " , vetor[i][j]);
            }
            System.out.println();
        }
    }



}
