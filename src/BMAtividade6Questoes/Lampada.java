package BMAtividade6Questoes;
/*
* 4) Crie uma classe em Java correspondente ao modelo criado na questão 1.
*/

public class Lampada {

  private String fabricante;
  private double valor;
  private String cor;
  private int potencia;
  private String modelo;
  private boolean voltagem;
  private boolean bivolt;
  private boolean wifi;
  private boolean compativelComAI;

  public Lampada() {
  }

  public Lampada(String fabricante, double valor, String cor, int potencia, String modelo, boolean voltagem, boolean bivolt, boolean wifi, boolean compativelComAI) {
    this.fabricante = fabricante;
    this.valor = valor;
    this.cor = cor;
    this.potencia = potencia;
    this.modelo = modelo;
    this.voltagem = voltagem;
    this.bivolt = bivolt;
    this.wifi = wifi;
    this.compativelComAI = compativelComAI;
  }

  public String getFabricante() {
    return fabricante;
  }

  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getPotencia() {
    return potencia;
  }

  public void setPotencia(int potencia) {
    this.potencia = potencia;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public boolean isVoltagem() {
    return voltagem;
  }

  public void setVoltagem(boolean voltagem) {
    this.voltagem = voltagem;
  }

  public boolean isBivolt() {
    return bivolt;
  }

  public void setBivolt(boolean bivolt) {
    this.bivolt = bivolt;
  }

  public boolean isWifi() {
    return wifi;
  }

  public void setWifi(boolean wifi) {
    this.wifi = wifi;
  }

  public boolean isCompativelComAI() {
    return compativelComAI;
  }

  public void setCompativelComAI(boolean compativelComAI) {
    this.compativelComAI = compativelComAI;
  }
}
