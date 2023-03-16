programa
{
	inclua biblioteca Matematica --> mat
		
	funcao inicio()
	{
		real tempC, tempF
			
		escreva("Qual temperatura atual? ")
		leia(tempC)

		tempF = (tempC * 1.8) + 32 	
		
		escreva(tempC, " graus Celsius equivalem a ", mat.arredondar(tempF, 2), ".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 40; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */