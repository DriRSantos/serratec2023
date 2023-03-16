programa
{
	
	funcao inicio()
	{	
		inteiro num

		escreva("Digite um número ")
		leia(num)
	
		para(inteiro i=num; i <= 100; i++){

			escreva("   ", num++, "\n")						
			
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
 * @POSICAO-CURSOR = 149; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */