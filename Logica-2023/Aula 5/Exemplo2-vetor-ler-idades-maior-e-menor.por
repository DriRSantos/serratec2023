programa
{
	funcao inicio(){
	
		inteiro idades[5]
		inteiro maior=0, menor=200

		para(inteiro i=0; i<5; i++){
			escreva("Digite sua idade: ")
			leia(idades[i])

			se(idades[i] > maior){
				maior = idades[i]
			}
			se(idades[i] < menor){  // não coloca senao pois o teste obrigatório para os dois valores
				menor = idades[i]
			}
		}	
		limpa()
		escreva("\n")
		escreva("Maior idade: ", maior, "\n")
		escreva("Menor idade: ", menor, "\n")
		
		escreva("\n")
		escreva("Idades digitadas: \n")
		para(inteiro i=0; i<5; i++){
			escreva(idades[i], ", ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 52; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */