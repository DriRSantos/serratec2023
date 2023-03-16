programa
{
	real notas[4]	
	
	funcao inicio(){
	
		real media, menorNota=11.0, maiorNota=0.0, somaNotas=0.0
		inteiro cont=0 // teste desnecessário aqui

		para(inteiro i=0; i<4; i++){

			faca{
				escreva("Digite a nota ", i+1, ": ")
				leia(notas[i])	
			}enquanto(notas[i]<0 ou notas[i]>10) //atenção, quando quer continuar em caso de nota inválida

			se(notas[i] > maiorNota){
				maiorNota = notas[i]
			}
			se (notas[i] < menorNota){
				menorNota = notas[i]
			}
			somaNotas += notas[i]
			cont++ // teste contador
		} 		
		media = somaNotas/cont
		escreva("\n")
		escreva("Maior nota: ", maiorNota, "\n")
		escreva("Menor nota: ", menorNota, "\n")

		se (media > 7){
			escreva("Media: ", media, " APROVADO!! \n")
		}
		senao {
			escreva("Media: ", media," REPROVADO \n")
		}
		escreva("\n")
		listarNotas()		
	}
	
	funcao listarNotas(){
		escreva("*************Notas******************* \n")
		para(inteiro i=0; i<4; i++){
			escreva(" * ", notas[i], " * ")
		}
		escreva("\n************************************ \n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1029; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */