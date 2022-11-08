import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    Scanner sc = new Scanner(System.in);

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double TotalDeValorNoEstoque(){
        return this.getPreco()*this.getQuantidade();
  }

    public void AdicionarProdutos(){
        System.out.print("Escreva o numero que deseja adicionar no estoque ");
        this.setQuantidade(this.getQuantidade() + sc.nextInt());
        System.out.println(toString());

    }
    public void RemoverProdutos(){
        System.out.print("Escreva o numero que deseja remover no estoque ");
        this.setQuantidade(this.getQuantidade() - sc.nextInt());
        System.out.println(toString());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.getNome() +
                ", R$: " + this.getPreco() +
                " ," + this.getQuantidade() + " unidades, " +
                "Total de R$: " + this.TotalDeValorNoEstoque();
    }
}
