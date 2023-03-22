programa
{	/*Crie um algoritmo que leia os limites inferior e superior de um intervalo e imprimir todos os números 
	* pares no intervalo aberto e seu somatório. Suponha que os dados digitados são para 
	* um intervalo crescente, ou seja, o primeiro valor é menor que o segundo.*/
	
	funcao inicio(){

		inteiro limiteInf, limiteSup, somaPar=0

		escreva("Digite o limite inferior ")
		leia(limiteInf)
		escreva("Digite o limite superior ")
		leia(limiteSup)

		para(inteiro i=limiteInf; i < limiteSup; i++){
			se(i % 2 == 0){
				escreva(i, " ")
				somaPar += i				
			}
		}
		escreva("\n\nA soma dos pares é: ", somaPar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 636; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */