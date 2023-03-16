programa
{

	funcao inicio()
	{
		real paes, broas, valor, valorTotal
		
		escreva("Quantos pães foram vendidos ")
		leia(paes)
		escreva("Quantos broas foram vendidas ")
		leia(broas)

		valor = paes * 0.50 + broas * 5.00
		valorTotal = valor * 0.10
		
		escreva("Ele arrecadou com as vendas R$ " , valor, " deve guardar ", valorTotal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 173; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */