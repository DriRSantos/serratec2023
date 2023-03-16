programa
{
	funcao inicio(){ // função recursiva, não muito utilizada, preferência PARA
	
		/* para(inteiro i=20; i > 0; i--){
			escreva("O valor dae i é: ", i, "\n")
		} 
		*/
		exibir(20)
	}

	funcao exibir(inteiro i){
		// condicao de parada
		se(i==0){
			escreva(i)
		}
		senao {
			escreva("O valor de i é: ", i, "\n")
			// decremento (como no pára)
			exibir(i-1)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 91; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */