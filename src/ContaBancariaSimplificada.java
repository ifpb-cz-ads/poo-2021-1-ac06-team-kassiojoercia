/*
* 6) Modifique o método “abreContaSimples” da classe “ContaBancariaSimplificada”
* de forma que o cliente só possa abrir uma conta com um valor mínimo de R$ 100,00.
*/

public class ContaBancariaSimplificada {
  String nomeDoCorrentista;
  float saldo;
  boolean contaEhEspecial;

  void abreContaSimples(String nome, float valor) {
    if (saldo < 100.00) {
      System.out.println("Valor insuficiente para abertura de uma conta");
    } else {
      nomeDoCorrentista = nome;
      valor = saldo;
      contaEhEspecial = false;
    }
  }

}
