programa
{
	funcao inicio(){

		inteiro numero, resultado=1

		escreva("Digite o número: ")
		leia(numero)

		/* fatorial com pára
		para(fatorial=1; fatorial <= numero; fatorial++){ 
			resultado = resultado * fatorial
		}
		escreva("O fatoral de ", numero, " é: ", resultado) */
		
		escreva("\nO fatorial de ",numero, " usando recursão é: ", fatorial(numero))
	}
		
		funcao inteiro fatorial(inteiro num){ // função recursividade
		
		inteiro resultado
		// condição de parada
		se (num <= 1) 
		{
			retorne 1
		}
		senao
		{	// recursividade
			resultado = fatorial(num-1)*num
			retorne resultado
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */