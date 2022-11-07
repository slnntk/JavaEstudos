public class Exercicios {

    String original = "abcde FGHIJ ABC abc DEFG      ";

     public void Formatacao(){
         System.out.println("Lower Case (minusculas): " + original.toLowerCase());
         System.out.println("Upper Case (maiscula): "+ original.toUpperCase());
         System.out.println("Trim (sem espaços): "+ original.trim());
     }

     public void Recortar(){
         System.out.println("Recortar (inicio): " + original.substring(6));
         System.out.println("Recortar (inicio, fim): " + original.substring(6, 12));
     }

     public  void Substituir(){
         System.out.println("Substituir (char, char) : " + original.replace("a", "b"));
     }

     public void Buscar(){
         System.out.println("Buscar a letra (a) POSIÇÃO: " + original.indexOf('a'));
         System.out.println("Buscar a letra (A) POSIÇÃO: " + original.trim().lastIndexOf('A'));
     }

     public void Separador(){
         String[] vetor = original.split(" ");
         System.out.println("Vetor [0] gerado pelo split separado pelo espaço:  "+vetor[0]);

     }




}
