import java.util.Scanner;

public class Exercicios {

    public void Exercicio01(){
        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();

        while   (senha != 2002){
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
    }

    public void Exercicio02(){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        String quadrante;

        while (x != 0 || y != 0){
            x = sc.nextInt();
            y = sc.nextInt();
            if (x > 0 && y > 0){
                quadrante = "primeiro";
            }
            else if (x < 0 && y > 0){
                quadrante = "segundo";
            }
            else if (x < 0 && y < 0){
                quadrante = "terceiro";
            }
            else if (x > 0 && y < 0) {
                quadrante = "quarto";
            }
            else{
                quadrante = "";
            }
            System.out.println(quadrante);
        }
        sc.close();
    }

    public void Exercicio03(){

        Scanner sc = new Scanner(System.in);
        int combustivel = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (combustivel != 4){
            combustivel = sc.nextInt();
            switch (combustivel) {
                case 1 -> alcool += 1;
                case 2 -> gasolina += 1;
                case 3 -> diesel += 1;
            }
        }
        System.out.println("MUITO OBRIGADO !");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: "+ diesel);
    }

}
