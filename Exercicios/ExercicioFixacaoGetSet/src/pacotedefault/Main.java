package pacotedefault;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        ContaBanco c1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();
        System.out.print("Numero da conta ");
        int numerConta = sc.nextInt();
        System.out.print("\nDeseja fazer um deposito inicial? (sim/nao): ");
        char operador = sc.next().charAt(0);

        if (operador == 's'){
            System.out.print("Valor do deposito: ");
            float dep = sc.nextFloat();
            c1 = new ContaBanco(nome, numerConta, dep);
            System.out.println(c1.update());
        }
        else{
            c1 = new ContaBanco(nome, numerConta);
        }

        c1.Depositar();
        c1.Sacar();

        System.out.println(c1.toString());




    }





}