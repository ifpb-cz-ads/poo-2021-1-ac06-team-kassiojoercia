package CBBAtividade6Questoes;

public class CBBAtividade6Exer4App {
  public static void main(String[] args) throws Exception {
    CBBAtividade6Exer4 ana = new CBBAtividade6Exer4();
    CBBAtividade6Exer4 beto = new CBBAtividade6Exer4();
    CBBAtividade6Exer4 carlos = new CBBAtividade6Exer4();

    ana.setNome("Ana Machado");
    beto.setNome("Roberto da Silva");
    carlos.setNome("Carlos Alberto");

    System.out.println(ana.getNome());
    System.out.println("Contador: " + CBBAtividade6Exer4.getContadorEstudantes());
  }
}
