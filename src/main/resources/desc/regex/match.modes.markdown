<p>
Imagine que voc&ecirc; quer fazer uma RegEx que reconhece <code>flor</code>, mas que tamb&eacute;m reconhe&ccedil;a <code>Flor</code> e <code>fLoR</code>.
Embora <code>[fF][lL]o[rR]</code> funcione, ela n&atilde;o &eacute; muito elegante.
</p><p>
Para situa&ccedil;&otilde;es como essa, onde voc&ecirc; quer que a RegEx n&atilde;o diferencie mai&uacute;sculas de min&uacute;sculas, voc&ecirc; pode colocar <code>(?i)</code> na frente dela.
</p>

Exemplo:
<ul>
	<li>A RegEx <code>(?i)ab</code> <strong>reconhece</strong> <code>ab</code>, <code>Ab</code>, <code>aB</code> e <code>AB</code></li>
</ul>

<p>
Em algumas outras situa&ccedil;&otilde;es, queremos que o operador <code>.</code> tamb&eacute;m seja capaz de reconhecer <code>-Quebra-de-Linha-</code>. Para isso, 
voc&ecirc; pode colocar <code>(?s)</code> no come&ccedil;o da RegEx.
</p>

Exemplo:
<ul>
	<li>A RegEx <code>(?s).{1, 3}</code> <strong>reconhece</strong> o padr&atilde;o <code>-Quebra-de-Linha-</code>, <code>-Quebra-de-Linha-a</code>, <code>8-Quebra-de-Linha-</code>, entre outros.</li> 
</ul>


