programa
{
	funcao inicio()
	{
		
		real area, largura, comprimento, preco, precoMetroQuadrado
		
		
		escreva("Qual largura do terreno? ")
		leia(largura)

		escreva("Qual comprimento do terreno? ")
		leia(comprimento)

		area = largura * comprimento

		escreva("Qual preco do metro quadrado? ")
		leia(precoMetroQuadrado)

		preco = area * precoMetroQuadrado

		escreva("O preco do terreno é R$", preco)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */