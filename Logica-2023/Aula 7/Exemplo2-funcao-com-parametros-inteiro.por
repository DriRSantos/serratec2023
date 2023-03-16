programa
{
	// geralmente na função passa dois ou três parâmetros, não passar mais que isso
	funcao inicio()
	{
		inteiro num1, num2

		escreva("Digite os números ")
		leia(num1, num2)

		soma(num1, num2)
		subtracao(num1, num2)
		multiplicacao(num1, num2)
	}

	funcao soma(inteiro num1, inteiro num2){ 
		escreva("Soma: ", num1+num2, "\n")
	}

	funcao subtracao(inteiro num1, inteiro num2){
		escreva("Subtração: ", num1-num2, "\n")
	}

	funcao multiplicacao(inteiro num1, inteiro num2){
		escreva("Subtração: ", num1*num2, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */