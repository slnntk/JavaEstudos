public class MATH {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x); // RAIZ QUADRADA DE X
        B = Math.sqrt(y); // RAIZ QUADRADA DE Y
        C = Math.sqrt(25); // RAIZ QUADRADA DE Z

        System.out.printf("\nRaiz quadrada de %.2f = %.4f", x, A);
        System.out.printf("\nRaiz quadrada de %.2f = %.4f", y, B);
        System.out.printf("\nRaiz quadrada de 25 = %.4f\n", C);

        A = Math.pow(x, y); // X ELEVADO A Y
        B = Math.pow(x, 2.0); //X ELEVADO A 2
        C = Math.pow(5.0, 2.0); //5 ELEVADO A 2

        System.out.println("\n" + x + " elevado a : " + y + " = " + A);
        System.out.println(x + " elevado a : " + "2.0" + " = " + B);
        System.out.println("5.0" + " elevado a : " + "2.0" + " = " + C);

        A = Math.abs(y); //VALOR ABSOLUTO DE Y;
        B = Math.abs(z); //VALOR ABSOLUTO DE Y;

        System.out.println("\nValor absoluto de : " + y + " é igual a: " + A);
        System.out.println("Valor absoluto de : " + z + " é igual a: " + B);

        TESTESDEMATH p1 = new TESTESDEMATH();
        p1.TeoremaDePitagoras();
        p1.Baskara();


    }
}