programa
{
	funcao inicio(){  // pilha

		inteiro numero

		escreva("Digite o numero: ")
		leia(numero)
		escreva("Resultado: ", somarNumAnteriores(numero))
	}

	funcao inteiro somarNumAnteriores(inteiro numero){
		
		inteiro resultado
		// condição de parada
		se(numero <= 1){
			retorne 1
		}
		senao{
			// recursividade
			resultado = somarNumAnteriores(numero - 1) + numero
			retorne resultado
		}
	}
}

/* primeira chamada
resultado = somarNumAnteriores(4-1) = 10  (empilha e depois vai tirando, dá 10)
segunda chamada
resultado = somarNumAnteriores(3-1) = 6
terceira chamada
resultado = somarNumAnteriores(2-1) = 3
*/
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 509; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */