import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inteiro = sc.nextInt();
        double numero = sc.nextDouble();
        char x = sc.next().charAt(0);


        sc.close();

        System.out.println(inteiro);
        System.out.println(numero);
        System.out.println(x);
    }
}