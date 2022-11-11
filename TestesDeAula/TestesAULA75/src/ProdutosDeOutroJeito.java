import java.util.Scanner;

public class ProdutosDeOutroJeito {

    private String nome;
    private double preco;
    private int quantidade;

    public ProdutosDeOutroJeito(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double ValorTotal(){
        return this.getQuantidade() * this.getPreco();
    }

    public void AdicionarProdutos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de produtos que deseja adicionar: ");
        this.setQuantidade(this.getQuantidade() + sc.nextInt());
        System.out.println(upadate());
    }

    public void RemoverProdutos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de produtos que deseja remover: ");
        this.setQuantidade(this.getQuantidade() - sc.nextInt());
        System.out.println(upadate());
    }

    public String toString() {
        return "Produto informações: " +
                "" + this.getNome() +
                ", R$ " + this.getPreco() +
                ", " + this.getQuantidade() +
                " unidades" +
                "Valor Total: " + this.ValorTotal();
    }

    public String upadate() {
        return "Produto atualizações: " +
                "" + this.getNome() +
                ", R$ " + this.getPreco() +
                ", " + this.getQuantidade() +
                " unidades" +
                "Valor Total: " + this.ValorTotal();
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
}
