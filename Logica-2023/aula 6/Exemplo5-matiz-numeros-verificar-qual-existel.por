programa
{/*Preencher uma matriz[4][2] com valores iniciais e 
* fazer uma rotina para o usuário ler um número e exibir
* uma mensagem se este número existe na matriz, se existir 
* pedir ao usuário para preencher com outro valor.
*/
	
	funcao inicio(){
	     inteiro aux, numeros[4][2] = {{10,20},{30,40},{50,60},{70,80}}
	     logico achei = falso
		
		faca{
			escreva("\nDigite o número que deseja adicionar: ")
			leia(aux)
			
			para(inteiro i=0; i < 4; i++){
				para(inteiro j=0; j < 2; j++){
					se(numeros[i][j] == aux){
						achei = verdadeiro
						escreva("Número já existe na matriz ")		
					}
				}
			}
		}enquanto(aux > 0)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */