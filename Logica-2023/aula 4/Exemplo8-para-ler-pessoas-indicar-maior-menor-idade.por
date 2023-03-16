programa
{
	
	funcao inicio()
	{
		inteiro pessoas, idade, totMenor=0, totMaior=0
		
		escreva("Escreva quantas pessoas: ")
		leia(pessoas)

		para(inteiro i=0; i < pessoas; i++){
			escreva("Digite a idade: ")
			leia(idade)

			se(idade >= 18){
				totMaior++
			}
			senao {
				totMenor++
			}
		}					
		escreva("Total menor ", totMenor, "\n")
		escreva("Total maior ", totMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 377; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */