programa
{
	funcao inicio()
{	
		inteiro a = 100

		incrementa(a) 

		escreva("O valor do incremento é: ", incrementa(a), "\n")
		escreva("O valor da variável a é: ", a, "\n") // mexe no valor da variável original
	
	}

	// função com passagem de parâmetro por referência, o & INDICA ISSO
	funcao inteiro incrementa(inteiro &i){ // quando coloca o &, avisa que está passando referência para a variável, atalho
		i = i + 10      // ALTERA variável a. Vantagem de passar como referência é não precisar criar variável global
 		retorne i 
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {a, 5, 10, 1}-{i, 15, 36, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */