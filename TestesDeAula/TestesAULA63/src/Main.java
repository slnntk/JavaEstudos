import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        TrianguloCompleto t1 = new TrianguloCompleto();
        TrianguloSimples x = new TrianguloSimples();
        double a = x.area(3.0, 4.0 ,5.0);
        System.out.println(a);
        t1.lerValores();
    }

}