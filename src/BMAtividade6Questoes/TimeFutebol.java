package BMAtividade6Questoes;
/*
* 5) Crie uma classe em Java correspondente ao modelo criado na questão2.
*/

public class TimeFutebol {
  private String nome;
  private int vitorias;
  private int derrotas;
  private int empates;
  private Jogador jogadores;

  public TimeFutebol(){

  }

  public TimeFutebol(String nome, int vitorias, int derrotas, int empates, Jogador jogador) {
    this.nome = nome;
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
    this.jogadores = jogadores;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getVitorias() {
    return vitorias;
  }

  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }

  public int getDerrotas() {
    return derrotas;
  }

  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }

  public int getEmpates() {
    return empates;
  }

  public void setEmpates(int empates) {
    this.empates = empates;
  }

  public Jogador getJogadores() {
    return jogadores;
  }

  public void setJogadores(Jogador jogadores) {
    this.jogadores = jogadores;
  }
}
