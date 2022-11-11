import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    double quantidade;
    double moeda;
    Scanner sc = new Scanner(System.in);

    public Exercicio4() {
        System.out.print("Quantos dolares quer comprar? ");
        this.quantidade = sc.nextDouble();
        Scanner sc = new Scanner(System.in);
        System.out.print("Preço do dollar: ");
        this.moeda = sc.nextDouble();
        converter(this.quantidade, this.moeda);
    }

    public double converter(double quantidade, double moeda){
        double resultado = (quantidade * dolar(moeda)) * 1.06;
        System.out.println("Vai pagar em reais: " + resultado);
        return resultado;
    }

    public static double dolar(double moeda){
        return moeda;
    }



}
