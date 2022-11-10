import java.util.Scanner;

public class Exercicio1 {

    private double altura;
    private double largura;

    public Exercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura: ");
        this.setAltura(sc.nextDouble());
        System.out.print("Largura: ");
        this.setLargura(sc.nextDouble());
    }

    public double Area(){
        return this.getAltura() * this.getLargura();
    }

    public double Perimetro(){
        return (this.getAltura() * 2) + (this.getLargura() * 2);
    }

    public double Diagonal(){
        return Math.sqrt(Math.pow(this.getAltura(), 2) + Math.pow(this.getLargura(), 2));
    }

    @Override
    public String toString() {
        return "Retangulo : " +
                " Altura: " + altura +
                ", Largura: " + largura +
                "\nArea: " + this.Area() +
                "\nPerimetro: " + this.Perimetro() +
                "\nDiagonal: " + this.Diagonal();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
