programa
{
	inteiro numeros[4][3]
	
	funcao inicio(){

		lerDados()
		imprimirMatriz()
		verificaNumeros()
	}

	funcao lerDados(){
		para(inteiro i=0; i < 4; i++){
			para(inteiro j=0; j < 3; j++){
				escreva("Digite número para adicionar na matriz: ")
				leia(numeros[i][j])
			}
		}
	}

	funcao imprimirMatriz(){
		para(inteiro i=0; i < 4; i++){
			para(inteiro j=0; j < 3; j++){
				escreva(numeros[i][j])
				se(j == 0 ou j == 1){
					escreva("-")
				}
			}
			escreva("\n")
		}
	}

	funcao verificaNumeros(){
		inteiro maior=0, menor=999
		
		para(inteiro i=0; i < 4; i++){
			para(inteiro j=0; j < 3; j++){
				se(numeros[i][j] > maior){
					maior = numeros[i][j]
				}
				se(numeros[i][j] < menor){
					menor = numeros[i][j]
				}
			}
		}
		escreva("\nMenor número", menor)
		escreva("\nMaior número", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 831; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */