programa
{/*Crie uma função que receba um número como parâmetro e escreva a tabuada desse número*/
	
	funcao inicio(){
		inteiro numero
		
		escreva("Digite um número ")
		leia(numero)

		tabuada(numero)
	}

	funcao tabuada(inteiro num){
		para(inteiro i=0; i <= 10; i++){
			escreva(num, " x ", i, " = ", num*i, "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 121; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */