programa
{
	inteiro numeros[8]
	funcao inicio()
	{
		inteiro soma=0, qtdPar=0, qtdImpar=0, media=0

		para(inteiro i=0; i<8; i++){
			escreva("Digite o número desejado: ")
			leia(numeros[i])

			soma += numeros[i]
			se(numeros[i] % 2 == 0){
				qtdPar++
			}
			senao { 
				qtdImpar++
			}
		}	
	
		escreva("\n")
		listarNumeros()
		escreva("\n")
		escreva("Quantidade de pares: ", qtdPar, "\n")
		escreva("Quantidade de impares: ", qtdImpar, "\n")
		escreva("Soma dos números digitados: ", soma, "\n")
	}

	funcao listarNumeros(){
		escreva("*******Números Digitados****** \n")
		para(inteiro i=0; i<8; i++){
			escreva(numeros[i], " ")
		}
		escreva("\n******************************* \n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 675; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */