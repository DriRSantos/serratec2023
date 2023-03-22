programa
{
	
	funcao inicio()
	{
		inteiro x, y
		
		escreva("digite valores ")
		leia(x,y)
		escreva("O resultado é: ", soma(x,y), "\n") // a soma do que for digitado
		escreva("Valor de x ", x, "\n")  // sempre 10 
		escreva("Valor de y ", y)  // sempre 20
	}

	funcao inteiro soma(inteiro &x, inteiro&y){ // passagem por referência MUDA VALOR
		inteiro resultado
		resultado = x + y
		x = 10
		y = 20
		retorne resultado
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */