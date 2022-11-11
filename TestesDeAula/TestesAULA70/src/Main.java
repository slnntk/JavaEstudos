import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Raio : ");
        double raio = sc.nextDouble();

        Calculos c1 = new Calculos();
        System.out.printf("Circunferencia: %.2f\n", c1.circunferencia(raio));
        System.out.printf("Volume: %.2f", c1.volume(raio));
    }
}