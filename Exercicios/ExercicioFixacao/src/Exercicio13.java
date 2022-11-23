import java.util.Scanner;

public class Exercicio13 {

    public Exercicio13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String [][] vetor = new String [n][2];
        leituraDados(vetor);
        System.out.println("PESSOA MAIS VELHA: " + velho(vetor)[0] + " com " + velho(vetor)[1] + " anos");
    }
    public void leituraDados(String[][] vetorFuncao){
        String [] dados = new String [2];
        dados[0] = "Nome: ";
        dados[1] = "Idade: ";
        Scanner sc = new Scanner(System.in);

        for (int i = 0;i < vetorFuncao.length;i++){
            System.out.printf("Dados da %dª pessoa: \n", i+1);
            for (int j = 0;j < 2;j++){
                System.out.print(dados[j]);
                vetorFuncao[i][j] = sc.nextLine();
            }
        }
    }

    public String[] velho(String[][] vetorFuncao){
        String [] arraydafuncao = new String[2];
        arraydafuncao[1] = "0";
        for (int i = 0;i < vetorFuncao.length;i++){
            if (Integer.parseInt(arraydafuncao[1]) < Integer.parseInt(vetorFuncao[i][1])){
                arraydafuncao[0] = vetorFuncao[i][0];
                arraydafuncao[1] = vetorFuncao[i][1];
                }
            }
        return  arraydafuncao;
        }
}
