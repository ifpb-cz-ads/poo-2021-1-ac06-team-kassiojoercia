package CBBAtividade6Questoes;

//Classe RegistraAluno
public class CBBAtividade6Exer4 {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;

    private static int contadorEstudantes;

    public double getMedia() {
        double resultado = 0;
        resultado = (notaMatematica + notaPortugues + notaGeografia) / 3;
        return resultado;
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public String getEndereco() {
      return endereco;
    }

    public void setEndereco(String endereco) {
      this.endereco = endereco;
    }

    public int getIdade() {
      return idade;
    }

    public void setIdade(int idade) {
      this.idade = idade;
    }

    public double getNotaPortugues() {
      return notaPortugues;
    }

    public void setNotaPortugues(double notaPortugues) {
      this.notaPortugues = notaPortugues;
    }

    public double getNotaMatematica() {
      return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
      this.notaMatematica = notaMatematica;
    }

    public double getNotaGeografia() {
      return notaGeografia;
    }

    public void setNotaGeografia(double notaGeografia) {
      this.notaGeografia = notaGeografia;
    }

    public static int getContadorEstudantes() {
      return contadorEstudantes;
    }

    public static void setContadorEstudantes(int contadorEstudantes) {
      CBBAtividade6Exer4.contadorEstudantes = contadorEstudantes;
    }
}
