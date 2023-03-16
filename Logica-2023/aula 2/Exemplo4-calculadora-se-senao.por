programa
{
	
	funcao inicio()
	{
		real num1, num2
		caracter sel
	
		escreva("Digite um número ")
		leia(num1)
		escreva("Digite mais um número ")
		leia(num2)

		escreva("Qual operação deseja fazer? S / N / M / D ")
		leia(sel)

		se(sel == 'S') {
			escreva(num1 + num2)
		}
		senao se (sel == 'N'){
			escreva(num1 - num2)
		}
		senao se (sel == 'M'){
			escreva(num1 * num2)
		}
		senao se (sel == 'D'){
			escreva(num1 / num2) 
		}
		senao escreva("Valor inválido!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */