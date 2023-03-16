programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		para(inteiro num=1; num <= 100; num++){
			
			escreva("   ", num, "\n")
			u.aguarde(100)
			
			se(num == 50){
				pare
			}
		}
		escreva(">> FIM <<")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 219; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */