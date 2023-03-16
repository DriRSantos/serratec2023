programa
{
	
	funcao inicio(){
		cadeia carros[3][3] = {{"KIO-0908", "FUSCA", "Sim"},
					        {"JIO=12890", "FOX", "Sim"},
					        {"UOI-2390", "HB20", "Não"}}

		alterarDados(carros) // passou a matriz para esta função
	}

	funcao alterarDados(cadeia c[][]){ // a estruta c[][] aponta para carros[][] e altera os dados
		c[2][2] = "Sim"
		exibirCarros(c) // e chama a função debaixo para exibir
	}

	funcao exibirCarros(cadeia cart[][]){ // todas apontam para a matriz principal carros, mas nesta com a alteração
		para(inteiro i=0; i < 3; i++){
			para(inteiro j=0; j < 3; j++){
				escreva(cart[i][j], " ")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 651; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {c, 12, 28, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */