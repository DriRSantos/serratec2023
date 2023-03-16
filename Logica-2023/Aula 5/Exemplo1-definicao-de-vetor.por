programa
{
	funcao inicio(){
		
		//variável do tipo cadeia, vetor com 5 posições
		cadeia nomes[5]  // tamanho vetor
		nomes[0] = "José"
		nomes[1] = "Maria"
		nomes[2] = "Edu"
		nomes[3] = "Paulo"
		nomes[4] = "Jorge"

		escreva(nomes[3])
		escreva("\n")

		cadeia uf[5] = {"RJ","SP","MG","PR","TO"}
		escreva(uf[0])
		escreva("\n")

		cadeia uf1[] = {"RJ","SP","MG","PR","TO"}
		escreva(uf1[2])
		escreva("\n")
		
		para(inteiro i=0; i<5; i++){
			escreva(nomes[i], ",")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 34; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */