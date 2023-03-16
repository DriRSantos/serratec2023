programa
{
	inteiro numeros[3][2], soma=0, somaLinha=0, somaColuna=0
	
	funcao inicio(){

		entradaDados()
		linha()
		coluna()
		totalGeral()
	}

	funcao linha(){
		para(inteiro i=0; i < 3; i++){
			para(inteiro j=0; j < 2; j++){
				soma += numeros[i][j]
				somaLinha += numeros[i][j]						
			}
		escreva("TOTAL linha ", i, ": ", somaLinha, "\n")
		somaLinha=0
		}
	}

	funcao coluna(){
		para(inteiro j=0; j < 2; j++){
			somaColuna=0
			para(inteiro i=0; i < 3; i++){				
				somaColuna += numeros[i][j]	
			}
			escreva("Total coluna: ", j, ": ", somaColuna, "\n")
		}	
	}

	funcao entradaDados(){
		para(inteiro i=0; i < 3; i++){
			para(inteiro j=0; j < 2; j++){
				escreva("Digite o numero: ")
				leia(numeros[i][j])
			}
		}
	}

	funcao totalGeral(){
		escreva("TOTAL geral soma de todos números:", soma, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */