programa
{
	
	funcao inicio()
	{
		cadeia dados[2][3]
		para(inteiro i=0; i < 2; i++){
			para(inteiro j=0; j < 3; j++){
				se(j==0){
					escreva("Nome: ")
					leia(dados[i][j])
				} senao se (j==1) {
					escreva("Telefone: ")
					leia(dados[i][j])
				} senao {
					escreva("E-mail: ")
					leia(dados[i][j])
				}
			}
		}
		para(inteiro i=0; i < 2; i++){
			para(inteiro j=0; j < 3; j++){
				escreva(dados[i][j])
				se(j==0 ou j==1){
					escreva(" , ")
				}
			}
			escreva("\n")
		}
	}
}

/*
 * programa (outra forma)
{
	
// matriz 2x3 = nome, telefone, e-mail e imprimir no console
	funcao inicio()
	{
		cadeia dados[2][3]

		para(inteiro lin=0; lin < 2; lin++){
			para(inteiro col=0; col < 3; col++){
				se(col == 0){
					escreva(lin+1," - Digite o nome: ")
				}
				se(col == 1){
					escreva(lin+1," - Digite o telefone: ")
				}
				se(col == 2){
					escreva(lin+1," - Digite o e-mail: ")
				}
				leia(dados[lin][col])
			}
		}
		para(inteiro lin=0; lin < 2; lin++){
			para(inteiro col=0; col < 3; col++){
				escreva(dados[lin][col])
				se(col == 0 ou col == 1){
					escreva("-") 
				}	
		}
		escreva("\n")
		}
	}
}
 * 
 * 
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */