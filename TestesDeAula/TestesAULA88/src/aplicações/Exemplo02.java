package aplicações;


import entities.Produto;

import java.util.Scanner;

public class Exemplo02 {
    Scanner sc = new Scanner(System.in);
    public Exemplo02() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de produtos: ");int n = sc.nextInt();
        Produto[] vetor = new Produto[n];
        System.out.printf("\nMedia nos preços dos produtos: %.2f", (ListarProdutos(vetor) / n));
        for (int i = 0;i < n; i++){
            System.out.print("\n" + vetor[i].toString());
        }
    }

    public double ListarProdutos(Produto vetor[]){
        double soma = 0;
        for (int i = 0;i < vetor.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nome: ");String nome = sc.nextLine();
            System.out.print("Preco: ");double preco = sc.nextDouble();
            vetor[i] = new Produto(nome, preco);
            soma += vetor[i].getPreco();
        }
        sc.close();
        return soma;
    }

}
