import java.util.Scanner;

public class Exercicio2 {
    private String nome;
    private double SalarioBruto;
    private double imposto;
    private double SalarioLiquido;

    public Exercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        this.setNome(sc.nextLine());
        System.out.print("SalarioBruto: ");
        this.setSalarioBruto(sc.nextDouble());
        System.out.print("Imposto: ");
        this.setImposto(sc.nextDouble());
        this.setSalarioLiquido(this.getSalarioBruto() - this.getImposto());

    }

    public void AumentarSalario(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual porcentagem de aumento do salario: ");
        double porcentagem = sc.nextDouble();
        this.setSalarioLiquido(this.getSalarioBruto() * (1 + (porcentagem / 100)));
        System.out.println(Update());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario: '" + this.getNome() + '\'' +
                ", R$ " + this.getSalarioLiquido();
    }

    public String Update() {
        return  "Upadate -> " +
                "Funcionario: '" + this.getNome() + '\'' +
                ", R$ " + (int) this.getSalarioLiquido();
    }

    public double getSalarioBruto() {
        return SalarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        SalarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getSalarioLiquido() {
        return SalarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        SalarioLiquido = salarioLiquido;
    }
}
