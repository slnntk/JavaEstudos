public class Main {
    public static void main(String[] args) {
        Exercicios e1 = new Exercicios();
        System.out.print("Original:");
        System.out.println(" abcde FGHIJ ABC abc DEFG      ");
        //FORMATAÇÃO :
        e1.Formatacao(); //transformar minusculo/transformar maiúsculo/tirar espaços no final
        //RECORTAR:
        e1.Recortar(); // recortar dizendo apenas o inicio, e recortar um trecho especifico !
        //SUBSTITUIR
        e1.Substituir();
        // BUSCAR
        e1.Buscar();
        //SEPARAR
        e1.Separador();

    }
}