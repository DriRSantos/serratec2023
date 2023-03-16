programa
{/* Escreva programa entrada de dados matriz[4][3] tipo cadeia com as opções:
* 0 - Fim do programa
* 1 - Entrada dados (nome, telefone, vacinacao) - ler dados e atribuir "não" na vacinação
* 2 - Vacinação - busca nome da pessoa na matriz, se existe vacina e exibe "vacinação efeutada) alterando
* vacinação para "Sim". Se não existir informar paciente não existe.
* 3 - Imprimir matriz 
* Fazer as opções em funções
*/
	funcao inicio(){

		cadeia matriz[4][3]
		inteiro opc
			
		faca{
			escreva("\n******* MENU *******\n")
			escreva("0 - FIM DO PROGRAMA\n")
			escreva("1 - Entrada de Dados (nome, telefone, vacinacao)\n")
			escreva("2 - Vacina\n")
			escreva("3 - Imprimir matriz \n\n")
			escreva("********************\n")
			escreva("\nEscolha uma opção do menu ")
			leia(opc)

			escolha(opc){

			caso 0: escreva("Fim do Programa. Boa tarde!")
			pare
			caso 1: entradaDeDados(matriz)
			pare
			caso 2: vacinaPessoa(matriz)					
			pare
			caso 3: imprimir(matriz)
			pare
			caso contrario: escreva("Opção INVÁLIDA!!!")
			pare
			}			
		}enquanto(opc!=0)
	}

	funcao entradaDeDados(cadeia matr[][]){

		para(inteiro i=0; i < 4; i++){
			escreva("\nDigite seu nome: ")
			leia(matr[i][0])
			escreva("Digite o seu telefone: ")
			leia(matr[i][1])
			escreva("Vacinado? ")
			escreva(matr[i][2]="Não")
			escreva("\n")
		}		
	}

	funcao vacinaPessoa(cadeia &mat2[][]){
		cadeia nome
		
		escreva("Digite o nome do paciente ")
		leia(nome)
		
		para(inteiro i=0; i < 4; i++){
			para(inteiro j=0; j < 3; j++){
				se(mat2[i][j] == nome){
					mat2[i][2] = "Sim"
					escreva("Paciente vacinado com sucessso!")
				 	se (mat2[i][j] != nome){
					escreva("Paciente NÃO EXISTE!")
					}
				}
			}
		}
	}

	funcao imprimir(cadeia mat[][]){

		para(inteiro i=0; i <4; i++){
			para(inteiro j=0; j < 3; j++){
				escreva(mat[i][j], "\t")				
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
 * @POSICAO-CURSOR = 11; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */