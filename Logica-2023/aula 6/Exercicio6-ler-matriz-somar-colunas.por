programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][2], somaLinha=0, somaColuna=0

		para(inteiro i=0; i < 3; i++){
			para(inteiro j=0; j < 2; j++){
				escreva("Digite número para adicionar na matriz: ")
				leia(matriz[i][j])
			}
		}

		para(inteiro i=0; i < 3; i++){
			escreva("[")
			para(inteiro j=0; j < 2; j++){
				escreva(matriz[i][j])
					se(j == 0){
						escreva("-")
				}
			}
			escreva("] \n")
		}

		para(inteiro i=0; i < 3; i++){
			somaLinha=0
			para(inteiro j=0; j < 2; j++){
				somaLinha+=matriz[i][j]
			}
			escreva("Soma da linha ", i+1, ": ", somaLinha, "\n")
		}

		para(inteiro j=0; j < 2; j++){ // soma coluna inverte os paras e faz a soma
			somaColuna=0
			para(inteiro i=0; i < 3; i++){
				somaColuna+=matriz[i][j]
			}
			escreva("Soma da coluna: ", j+1, ": ", somaColuna, "\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 679; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */