<h1>Questões 1, 2, 3, 7, 8 e 9</h1>
<h2>1) Escreva um modelo para representar uma lâmpada que está à venda em um supermercado. Que dados devem ser representados por esse modelo?</h2>

<h3>Lampada</h3>
<p>-fabricante: String</p>
<p>-valor: double</p>
<p>-cor: String</p>
<p>-potencia: int</p>
<p>-modelo: String</p>
<p>-voltagem: String</p>
<p>--ehBivolt: boolean</p>
<p>-ehWifi: boolean</p>
<p>-ehCompativelComAlexa: boolean</p>

<h2>2) Crie um modelo para representar um time de um esporte qualquer em um
campeonato desse esporte. Que dados e operações esse modelo deve ter?</h2>

<h3>TimeFutebol</h3>
<p>-nome: String</p>
<p>-vitorias: int</p>
<p>-derrotas: int</p>
<p>-empates: int</p>
<p>-jogadores: Jogador</p>

<h2>3) Modifique a operação <strong>mostraDados()</strong> do modelo <strong>ContaBancariaSimplificada( )</strong> para que, caso o saldo esteja negativo, uma mensagem de alerta seja impressa. Dica: O saldo só poderá ser negativo se a conta for especial.</h2>

<h3>ContaBancariaSiplificada</h3>
<p>-nomeDoCorrentista: String</p>
<p>-saldo: double</p>
<p>ContaEhEspecial: boolean</p>

<p>+abreConta(nome: String, deposito: double, ehEspecial: boolean)</p>
<p>+abreContaSimples(nome: String)</p>
<p>+depositar(valor: double)</p>
<p>+retira(valor: double)</p>
<p>+mostrarDados(ehEspecial: boolean)</p>