programa
{
	inclua biblioteca Util	
	
	funcao inicio(){

		inteiro numSecreto, chute=99, cont=0, chances=5
		
		escreva("JOGO DE ADIVINHAR \n")
		escreva("----------------- \n")

		numSecreto = Util.sorteia(0, 10)
		
		enquanto(cont < chances e chute != numSecreto){
			escreva("Digite números de 1 a 10: ")
			leia(chute)

			cont = cont + 1
			se(chute == numSecreto){
				escreva("Você acertou! O número secreto é: ", numSecreto, "\n")
			}
		}
		se(chute != numSecreto){
			escreva("Você errou! Tente novamente. O número secreto era: ", numSecreto)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 566; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numSecreto, 7, 10, 10}-{chute, 7, 22, 5}-{cont, 7, 32, 4}-{chances, 7, 40, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */