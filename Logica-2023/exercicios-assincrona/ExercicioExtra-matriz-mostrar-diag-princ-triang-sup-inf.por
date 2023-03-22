programa
{/*Dissecando Matriz
* Algoritmo para preencher uma matriz de quarta ordem e mostrar:
* Os elementos da diagonal principal
* Os elementos do triangulo superior
* Os elementos do triangulo inferior
* A matriz completa
*/
	
	funcao inicio(){
		
		inteiro matriz[4][4], opcao=0

		para(inteiro i=0; i < 4; i++){
			para(inteiro j=0; j < 4; j++){
				escreva("Digite o valor para posição [", i, ", ", j, "]: ")
				leia(matriz[i][j])
			}
		}
		limpa()
		
		enquanto(opcao != 5){

			escreva("\n  MENU DE OPCOES  \n")
		     escreva("====================\n")
		     escreva("[1] Mostrar a Matriz\n")
		     escreva("[2] Diagonal Principal\n")
		     escreva("[3] Triangulo Superior\n")
		     escreva("[4] Triangulo Inferior\n")
		     escreva("[5] Sair\n")
		     escreva("Escolha uma opção: ")
			leia(opcao)		     			
				
			escolha(opcao){

			caso 1: mostrarMatriz(matriz)
			pare
			caso 2: diagonalPrincipal(matriz)
			pare
			caso 3: trianguloSup(matriz)
			pare
			caso 4: trianguloInf(matriz)
			pare
			caso 5: escreva("Programa encerrado\n")
			pare
			caso contrario: escreva ("Opção INVÁLIDA! Tente novamente (de 1 a 5) \n")
			}			
		}
	}

	funcao mostrarMatriz(inteiro m[][]){
		para(inteiro i=0; i < 4; i++){
			para(inteiro j=0; j < 4; j++){
				escreva(m[i][j])
			}
			escreva("\n")
		}
	}

	funcao diagonalPrincipal(inteiro m2[][]){
		para(inteiro i=0; i < 4; i++){
			escreva(m2[i][i])
			para(inteiro j=0; j < 4; j++){
				escreva("   ")
			}
		}
	}

	funcao trianguloSup(inteiro m3[][]){
		
	}

	funcao trianguloInf(inteiro m4[][]){
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 522; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 12, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */