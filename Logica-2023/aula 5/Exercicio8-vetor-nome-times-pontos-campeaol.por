programa
{//Elabore um algoritmo que leia em um vetor
// - um vetor com os nomes de seis times.
//- outro vetor com a pontuação dos seis times.
// Exibir ao final o nome do time campeão e o último colocado na pontuação.
	
	funcao inicio(){

		cadeia nomes[6]
		inteiro pontos[6], maior=0, menor=99, iMaior=0, iMenor=0

		para(inteiro i=0; i < 6; i++){
			escreva("Digite o nome do time ", i+1, ": ")
			leia(nomes[i])
			escreva("Digite os pontos: ")
			leia(pontos[i])

			se(pontos[i] > maior){
				maior = pontos[i]
				iMaior = i
			}
			se(pontos[i] < menor){
				menor = pontos[i]
				iMenor = i 
			}
		}
		escreva("\n")
		escreva("O time CAMPEÃO foi ", nomes[iMaior], " com ", pontos[iMaior], "\n")
		escreva("O time perdedor foi ", nomes[iMenor], " com ", pontos[iMenor], "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 733; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */