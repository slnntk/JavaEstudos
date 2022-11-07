import java.util.Scanner;

public class Exemplo {

    public void EstruturaFor(){

        Scanner sc = new Scanner(System.in);
        int numerodetermos = sc.nextInt();
        int soma = 0;
        for (int i = numerodetermos; i > 0;i--){
            int numeros = sc.nextInt();
            soma += numeros;
        }
        System.out.println(soma);
    }

}
