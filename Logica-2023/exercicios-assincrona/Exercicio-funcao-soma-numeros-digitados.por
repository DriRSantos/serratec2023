programa
{
	funcao inicio(){
		inteiro num
		
		escreva("Digite um número ")
		leia(num)
	
		escreva("\nA soma dos números digitados foi ", somaNumeros(num), "\n")
	}

	funcao inteiro somaNumeros(inteiro n){
		inteiro soma=0

		enquanto(n > 0){
			soma += n
			escreva("Digite um número ")
			leia(n)
		}
		retorne soma	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 109; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */