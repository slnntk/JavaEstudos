import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        sc.close();

        System.out.printf("Nome: %s \nIdade: %d\nPeso: %.1f", x, y, z);
    }
}
