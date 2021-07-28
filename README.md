<h1>Questões 1, 2, 3, 7, 8 e 9 - Livro Introdução à Programação Orientada a Objetos</h1>
<h2>1) Escreva um modelo para representar uma lâmpada que está à venda em um supermercado. Que dados devem ser representados por esse modelo?</h2>

<h3>Lampada</h3>
<p>-fabricante: String</p>
<p>-valor: double</p>
<p>-cor: String</p>
<p>-potencia: int</p>
<p>-modelo: String</p>
<p>-voltagem: boolean</p>
<p>--ehBivolt: boolean</p>
<p>-ehWifi: boolean</p>
<p>-ehCompativelComAI: boolean</p>

<h2>2) Crie um modelo para representar um time de um esporte qualquer em um
campeonato desse esporte. Que dados e operações esse modelo deve ter?</h2>

<h3>TimeFutebol</h3>
<p>-nome: String</p>
<p>-vitorias: int</p>
<p>-derrotas: int</p>
<p>-empates: int</p>
<p>-jogadores: Jogador</p>

<h2>3) Modifique a operação <strong>mostraDados()</strong> do modelo <strong>ContaBancariaSimplificada( )</strong> para que, caso o saldo esteja negativo, uma mensagem de alerta seja impressa. Dica: O saldo só poderá ser negativo se a conta for especial.</h2>

<h3>ContaBancariaSimplificada</h3>
<p>-nomeDoCorrentista: String</p>
<p>-saldo: double</p>
<p>-contaEhEspecial: boolean</p>

<p>+abreConta(nome: String, deposito: double, ehEspecial: boolean)</p>
<p>+abreContaSimples(nome: String)</p>
<p>+depositar(valor: double)</p>
<p>+retira(valor: double)</p>
<p>+mostrarDados(ehEspecial: boolean)</p>

<h2>7) Identifique e explique o(s) erro(s) na classe abaixo:</h2>
<p>A declaração do nome da classe não pode ter espaços</p>
<p>forma errada declarada na questão: class Registro De Eleitor</p>
<p>forma certa para a questão: class RegistroDeEleitor</p>

<h2>8) Identifique e explique o(s) erro(s) na classe abaixo:</h2>
<p>A declaração dos metodos maior() e menor() existem erros</p>
<p>No metodo maior existe uma comparação de duas variáveis que não são passadas em seu parametro</p>
<p>forma errada declarada do metodo: int maior() </p>
<p>forma certa do metodo: int maior(int num1, int num2) </p>
<p>No metodo menor existe o uso de return em um metodo void, esses metodos não retornam nada</p>

<h2>8) Identifique e explique o(s) erro(s) na classe abaixo:</h2>
<p>Existe um return true na class main do projeto e isso não pode acontecer</p>