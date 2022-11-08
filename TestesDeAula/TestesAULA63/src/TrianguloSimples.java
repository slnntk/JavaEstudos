public class TrianguloSimples {

    public double lado1;
    public double lado2;
    public double lado3;

    public double area(double v, double v1, double v2){
        double p = (v + v1 + v2) / 2;

        return Math.sqrt(p * (p - v)* (p - v1)* (p - v2));
    }



}
