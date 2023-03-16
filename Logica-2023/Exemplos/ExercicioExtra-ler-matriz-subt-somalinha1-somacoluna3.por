programa
{/* exercicio ler matriz 4 x 4 dar somaLinha 1 e somaCOluna3 depois da subtração */
	
	funcao inicio(){
		inteiro matriz[4][4], somaLinha1=0, somaColuna3=0, sub 
		
		para(inteiro i=0; i < 4; i++){
			para(inteiro j=0; j < 4; j++){
				escreva("Digite número para adicionar na matriz: ")
				leia(matriz[i][j])	
			}
		}

		para(inteiro i=0; i < 4; i++){
			para(inteiro j=0; j < 4; j++){
				escreva(matriz[i][j], "\t")	
			}
			escreva("\n")
		}

		para(inteiro j=0; j < 4; j++){  // soma apenas a linha 1 da matriz, por isso fixa a posição 0
			somaLinha1+=matriz[0][j]
		}
		escreva("Soma da linha : ", somaLinha1, "\n")

		para(inteiro i=0; i < 4; i++){ // soma apenas a coluna3, fixa a matriz na coluna3
			somaColuna3+=matriz[i][3]
		}
		escreva("Soma da coluna4 : ", somaColuna3, "\n")
	
		escreva("Subtração ", somaLinha1 - somaColuna3)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */