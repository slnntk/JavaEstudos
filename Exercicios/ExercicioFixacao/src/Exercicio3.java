import java.util.Scanner;

public class Exercicio3 {

    private final String nome;
    private final double nota1;
    private final double nota2;
    private final double nota3;

    public Exercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        this.nome = sc.nextLine();
        System.out.print("1º Tri: ");
        this.nota1 = sc.nextDouble();
        System.out.print("2º Tri: ");
        this.nota2 = sc.nextDouble();
        System.out.print("3º Tri: ");
        this.nota3 = sc.nextDouble();
        notaFinal();
        System.out.println(aprovadoOuReprovados());
    }

    public double notaFinal(){
        return nota1 + nota2 + nota3;
    }

    public String aprovadoOuReprovados(){

        System.out.println("NOTA FINAL : " + this.notaFinal());

        if (notaFinal() >= 60){
            return "APROVADO";
        }
        else{
            return "REPROVADO" + "\nFaltando: "  +  (60 - this.notaFinal()) + " pontos";
        }

    }


}
