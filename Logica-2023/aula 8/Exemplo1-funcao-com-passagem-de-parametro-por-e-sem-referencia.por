programa
{	
	funcao inicio(){
	
		inteiro a=1000, b=2000

		alterarValor(a, b)
		escreva("O valor de a é: ", a, "\n")
		escreva("O valor de b é: ", b, "\n")
	}

	funcao alterarValor(inteiro &v, inteiro y){ // v tem a referência de a e não o valor, ele sabe o caminho para
		v = 1500							// enxergar o a, representa o a e ALTERA O VALOR dele
		y = 0							// y recebe apenas o valor e NÃO ALTERA o VALOR de a
		escreva("O valor de v é ", v, "\n")
		escreva("O valor de y é ", y, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 488; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */