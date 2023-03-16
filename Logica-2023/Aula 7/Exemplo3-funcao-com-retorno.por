programa
{
	
	funcao inicio(){
		real nota1, nota2

		escreva("Digite a nota 1 ")
		leia(nota1)
		escreva("Digite a nota 2 ")
		leia(nota2)

		imprimir(media(nota1,nota2)) // chamou a media da funcao, lançou para imprimir
		//escreva("A média é: ", media(nota1,nota2))
	}

	// funcao com retorno tipo real, tem que especificar
	funcao real media(real nota1, real nota2){ 
		retorne (nota1+nota2)/2	
	}

	// funcao sem retorno (void)
	funcao imprimir(real m){
		escreva("\n***** RESULTADO DA MÉDIA *******\n")
		escreva("A média é: ", m, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */