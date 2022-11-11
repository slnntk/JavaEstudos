import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ProdutosDoMeuJeito p1 = new ProdutosDoMeuJeito();
        //System.out.println(p1.toString());//
        //p1.AdicionarProdutos();//

        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        ProdutosDeOutroJeito p2 = new ProdutosDeOutroJeito(nome, preco, quantidade);
        System.out.println(p2.toString());
        p2.AdicionarProdutos();

    }
}