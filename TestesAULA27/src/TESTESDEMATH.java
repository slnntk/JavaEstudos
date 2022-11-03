
public class TESTESDEMATH {

    public void TeoremaDePitagoras(){
        double cateto1 = 3;
        double cateto2 = 4;
        double hipotenusa;
        hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        System.out.println("\nTeorema de pitagoras : " + Math.sqrt(hipotenusa) + "²" + " = " + cateto1 + "²" + " + "  + cateto2 + "²");
    }

    public void Baskara(){
        double a = 1;
        double b = -3;
        double c = -54;

        double delta = (Math.pow(b, 2)) - (4 * a * c);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("\nA: " + a + "\nB: " + b + "\nC: " + c);
        System.out.println("\nX1 : " + x1 + "\nX2 : " + x2);

    }

}
