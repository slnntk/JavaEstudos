import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

    public void Exercicio01(){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        char operador;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double temperaturaC = sc.nextDouble();
            double temperaturaF = ((9 * temperaturaC) / 5) + 32;
            System.out.printf(" \nEquivalente a: %.2f\n", temperaturaF);
            System.out.print("Deseja repetir? (s/n) :");
            operador = sc.next().charAt(0);
        }while (operador != 'n');

        sc.close();
    }


}
