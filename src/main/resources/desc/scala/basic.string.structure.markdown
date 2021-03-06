<p>
Em Scala, palavras ou frase s&atilde;o representadas atrav&eacute;s do que &eacute; chamado <code>String</code>.

Para se criar uma <code>String</code>, basta que voc&ecirc; escreva o texto que quiser entre duas <code>"</code>
</p>
<ul>
	<li><code>"azul"</code> &eacute; a <code>String</code> que representa a palavra <strong>azul</strong></li>
</ul>

<p>
Caso seu texto contenha <code>"</code>, &eacute; melhor utilizar outra forma de criar <code>String</code> em scala. Voc&ecirc;
envolve o texto em <code>"""</code>:
</p>
<ul>
	<li><code>"""gato "preto" """</code> &eacute; a <code>String</code> que representa o texto <strong>gato "preto" </strong></li>
</ul>

<p>
&Eacute; poss&iacute;vel fazer muitas coisas com <code>Strings</code> em Scala.
</p>
<ul>
<li>Voc&ecirc; pode concaten&aacute;-las: <code>"abra " + "kadabra"</code> vira a <code>String</code> <code>"abra kadabra"</code></li>
<li>Voc&ecirc; pode invert&ecirc;-las: <code>"atrop".reverse</code> vira a <code>String</code> <code>"porta"</code></li>
<li>Voc&ecirc; pode ver o tamanho dela: <code>"texto bem longo".length</code> &eacute; <code>15</code></li>
<li>Voc&ecirc; pode compar&aacute;-las: <code>"abd" > "abc"</code> &eacute; <code>true</code></li>
<li>E <code>Strings</code> s&atilde;o t&atilde;o importantes, que voc&ecirc; consegue transformar qualquer coisa em <code>String</code>:
	<code>123.toString</code> vira a <code>String</code> <code>"123"</code></li>
</ul>

