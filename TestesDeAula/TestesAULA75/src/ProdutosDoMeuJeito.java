import java.util.Scanner;

public class ProdutosDoMeuJeito {

    private String nome;
    private double preco;
    private int quantidade;

    public ProdutosDoMeuJeito() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        this.nome = sc.nextLine();
        System.out.print("Preço: ");
        this.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        this.quantidade = sc.nextInt();
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

    @Override
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
