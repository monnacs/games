<p>
Ancoras servem para dar uma refer&ecirc;ncia para as suas RegEx. Por exemplo, voc&ecirc; pode querer reconhecer <code>tomate</code>,
mas n&atilde;o querer reconhecer <code>o tomate</code>.
</p><p>
Para fazer isso, voc&ecirc; pode usar um operador como o <code>^</code>, que ancora ao come&ccedil;o da linha, o <code>$</code> que 
ancora ao fim da linha e o <code>\b</code>, que ancora a qualquer coisa que n&atilde;o seja um caractere ou n&uacute;mero.
</p>
Exemplo:
<ul>
	<li>A RegEx <code>^tomate</code> <strong>reconhece</strong> o padr&atilde;o <code>tomate</code>, mas n&atilde;o reconhece <code>o tomate</code></li>
	<li>A RegEx <code>tomate$</code> <strong>reconhece</strong> o padr&atilde;o <code>tomate</code> e <code>bom tomate</code>, mas n&atilde;o reconhece <code>tomates</code></li>
	<li>A RegEx <code>\btomate\b</code> <strong>reconhece</strong> o padr&atilde;o <code>tomate</code> e <code>bom tomate</code> e <code>tomate gostoso</code>, mas n&atilde;o reconhece <code>tomates</code></li>
</ul>


