import java.util.Scanner;

public class TrianguloCompleto {

        public double[][] lerValores(){

        Scanner sc = new Scanner(System.in);
        double [][] vetor = new double [2][3];

        for (int triangulo = 0; triangulo < 2;triangulo++){
            for (int lado = 0; lado < 3;lado++){
                System.out.printf("Medidas do Lado [%d] - > Triangulo [%d] :  ", lado+1, triangulo+1);
                vetor[triangulo][lado] = sc.nextDouble();
            }
        }
        CalcularArea(vetor);
        return vetor;
    }

    public double[] CalcularArea(double valores[][]){

        double [] temporario = new double [2];

        for (int i = 0;i <= 1;i++){
            temporario[i] = ((valores[i][0] + valores[i][1] + valores[i][2]) / 2);
            temporario[i] = Math.sqrt(temporario[i] * ((temporario[i] - valores[i][0])*(temporario[i] - valores[i][1])*(temporario[i] - valores[i][2]))  );
        }
        ExibirArea(Maior(temporario));
        for (int i = 0;i <= 1;i++){
            System.out.printf("Triangulo %d area: %f\n", i+1, temporario[i]);
        }
        return temporario;
    }

    public String Maior(double valoresArea[]){

        String maiorstring;

        if (valoresArea[0] > valoresArea[1]){
            return maiorstring = "1";
        }
        else if (valoresArea[0] < valoresArea[1]){
            return maiorstring = "2";
        }
        else{
            return maiorstring = "São iguais";
        }
    }

    public void ExibirArea(String maiorArea){
        System.out.println("\nMaior areá é a do triangulo: " + maiorArea);
    }







}
