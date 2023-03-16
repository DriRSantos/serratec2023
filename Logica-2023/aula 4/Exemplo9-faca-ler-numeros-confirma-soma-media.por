programa
{
	
	funcao inicio()
	{
		inteiro num, soma=0, contador=0
		caracter confirmar='S'
		
		faca{

			escreva("Digite um número: ")
			leia(num)
			
			soma =+ num
			contador++

			escreva("Deseja continuar (S/s)? ")
			leia(confirmar)
		}
		enquanto (confirmar == 'S' ou confirmar == 's')
		
		escreva("Soma: ", soma, "\n")
		escreva("Media: ", soma/contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */