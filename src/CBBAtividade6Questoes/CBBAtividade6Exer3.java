package CBBAtividade6Questoes;

public class CBBAtividade6Exer3 {
    public static void main(String[] args) throws Exception {
       String frase1;
       String frase2;

       frase1 = new String("Testando igualdade");
       frase2 = new String("Testando igualdade");

       System.out.println("Frase 1: " + frase1);
       System.out.println("Frase 2: " + frase2);
       System.out.println("Frase 1 e Frase 2 são iguais? R: " + (frase1.equals(frase2)));
    }
}
