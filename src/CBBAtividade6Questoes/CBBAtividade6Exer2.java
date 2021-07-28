package CBBAtividade6Questoes;

public class CBBAtividade6Exer2 {
    public static void main(String[] args) throws Exception {
       String frase3;
       String frase4;

       frase3 = new String("Testando igualdade");
       frase4 = frase3;

       System.out.println("Frase 1: " + frase3);
       System.out.println("Frase 2: " + frase4);
       System.out.println("Frase 1 e Frase 2 são iguais? R: " + (frase3 == frase4));
    }
}
