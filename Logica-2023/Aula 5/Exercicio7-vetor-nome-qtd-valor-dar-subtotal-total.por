programa
{// Criar um algoritmo que leia em um vetor o nome, a quantidade e o valor de uma lista 
// de três produtos.  Ao final deverá calcular o subtotal de cada produto e no final 
// exibir o total geral da compra

	inclua biblioteca Matematica --> mat
	
	funcao inicio(){

		inteiro qtd[3]
		real valor[3], subtotal[3], total=0
		cadeia produtos[3]

		para(inteiro i=0; i<3; i++){
			escreva("Qual o nome do produto? ")
			leia(produtos[i])
			escreva("Qual a quantidade de produtos? ")
			leia(qtd[i])
			escreva("Qual o valor do produto? ")
			leia(valor[i])
		}
		para(inteiro i=0; i<3; i++){
			subtotal[i] = valor[i] * qtd[i]
			total += subtotal[i]
		}

		escreva("\n")		
		para(inteiro i=0; i<3; i++){
			escreva("Subtotal do produto ", produtos[i], ": ", subtotal[i])
			escreva("\n")		
		}
		escreva("\n")	
		escreva("O total geral da compra foi de: ", mat.arredondar(total, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 896; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */