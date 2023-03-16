programa
{
	inclua biblioteca Util
	inclua biblioteca Texto
	
	funcao inicio(){

		inteiro resultado
		cadeia texto
		inteiro posicoes[10]
				
		escreva(Util.sorteia(1, 1000), "\n") // sorteia valor de 1 a 1000
		resultado = Util.sorteia(1, 1000)
		escreva(resultado)
		Util.aguarde(2000)

		escreva("\n\nTexto:")
		leia(texto)
		escreva("\n", Texto.caixa_alta(texto))

		//contar quanto caracteres tem o texto digitado
		escreva("\n", Texto.numero_caracteres(texto))

		// indica índica de letra (lembrando que começa em zero)
		escreva("\n", Texto.obter_caracter(texto, 2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 580; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */