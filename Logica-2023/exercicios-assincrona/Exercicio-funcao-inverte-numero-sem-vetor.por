programa
{/*Inverter a ordem dos números sem utilizar vetor, usando função*/
	
	funcao inicio()
	{
		inteiro num
		escreva("Informe um número ")
		leia(num)

		se (num > 0){
			invertePositivo(num)
		}
		senao{
			inverteNegativo(num)
		}		
	}

	funcao invertePositivo(inteiro num2){
		inteiro inverteP
		faca{
			inverteP = num2 % 10 // o resto da divisão de um nº inteiro por 10 é seu algarimos da unidade
			escreva(inverteP)
			num2 = num2 / 10 // diminui o número, pegando ele e dividando por 10, vai removendo
		}enquanto(num2 != 0)  // as casas decimais
		escreva("\n")
	}
	
	funcao inverteNegativo(inteiro num3){
		num3 = num3 - 1
		escreva("-") // caractere que é um sinal de -, não é o negativo
		inteiro inverteN
		faca{
			inverteN = num3 % 10 
			escreva(inverteN)
			num3 = num3 / 10 
		}enquanto(num3 != 0) 
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 710; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num2, 18, 32, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */