<p>Imagine que agora gostariamos de, por exemplo, pegar parte de um	texto reconhecido por nossa RegEx, 
e o substituir por outras partes. Na maioria das vezes desejamos pegar parte do nosso texto e fazer 
manipula&ccedil;&otilde;es sobre ele. Isso essencialmente &eacute; algo que d&aacute; bastante sentido 
para se utilizar RegEx, somos capazes de fazer buscas de padr&otilde;es complexos e fazer algum tipo de 
processamento.
</p><p>

Para isso a RegEx tem um recurso chamado de <strong>grupos de captura</strong>.
</p><p>

Para definir um grupo de captura voc&ecirc; utiliza os caracteres<code>(</code>	e <code>)</code> envolvendo 
o <strong>padr&atilde;o de RegEx</strong> que voc&ecirc; que capturar no seu texto.
</p>

Exemplo:
<ul>
	<li>A RegEx <code>Assunto: (\w+)</code> <strong>reconhece</strong> o padr&atilde;o <code>Assunto: importante</code> e <strong>captura</strong>
		<code>importante</code> no grupo <code>1</code>.
	</li>
	<li>A RegEx <code>(parametro=(\w+))</code> <strong>reconhece</strong> o padr&atilde;o <code>parametro=legal</code> e <strong>captura</strong>
		<code>parametro=legal</code> no grupo <code>1</code> e <code>legal</code> no grupo <code>2</code>.
	</li>
</ul>