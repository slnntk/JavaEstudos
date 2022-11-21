package pacotedefault;

import java.util.Scanner;

public class ContaBanco {

    private String nome;
    private int numeroConta;
    private float saldo;


    public ContaBanco(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public ContaBanco(String nome, int numeroConta, float saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void Depositar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nValor que deseja depositar: ");
        this.setSaldo(this.getSaldo() + sc.nextFloat());
        System.out.println(update());
    }

    public void Sacar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nValor que deseja sacar: ");
        this.setSaldo((this.getSaldo() - sc.nextFloat()) - 5);
        System.out.println(update());
    }

    @Override
    public String toString() {
        return "\n[ContaBanco]\n" +
                "Nome: " + nome +
                "\nConta nº " + numeroConta +
                "\nSaldo R$ " + saldo;
    }

    public String update() {
        return "\n[ContaBanco]\n" +
                "Conta " + this.numeroConta +
                ", Titular: " + this.getNome() +
                ", Saldo: R$ " + this.getSaldo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
