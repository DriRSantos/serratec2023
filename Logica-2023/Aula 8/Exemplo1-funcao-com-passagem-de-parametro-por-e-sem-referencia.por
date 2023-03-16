programa
{	
	funcao inicio(){
	
		inteiro a=1000, b=2000

		alterarValor(a, b)
		escreva("O valor de a é: ", a, "\n")
		escreva("O valor de b é: ", b, "\n")
	}

	funcao alterarValor(inteiro &v, inteiro y){ // v altera a, y não altera b
		v = 1500
		y = 0
		escreva("O valor de v é ", v, "\n")
		escreva("O valor de y é ", y, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 122; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */