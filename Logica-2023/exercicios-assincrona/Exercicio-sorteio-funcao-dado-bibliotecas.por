programa
{/*Crie uma função chamada Dado() que retorna, através de sorteio um número inteiro 
* de 1 até 6, lance o dado 1 milhão de vezes. Conte quantas vezes cada número saiu e a porcentagem
* dos números */
	inclua biblioteca Util
	inclua biblioteca Matematica --> mat	
	
	funcao inicio()
	{
		inteiro num1=0, num2=0, num3=0, num4=0, num5=0, num6=0

		para(inteiro i=0; i < 1000000; i++){
			escolha(dado()){
				caso 1: num1++
				pare
				caso 2: num2++
				pare
				caso 3: num3++
				pare
				caso 4: num4++
				pare
				caso 5: num5++
				pare
				caso 6: num6++
				pare
			}
		}
		escreva("Número 1 sorteado ", num1, " vezes com porcentagem de "
		, mat.arredondar((num1/1000000.0)*100, 2), "\n")
		escreva("Número 2 sorteado ", num2, " vezes com porcentagem de "
		, mat.arredondar((num1/1000000.0)*100, 2), "\n")
		escreva("Número 3 sorteado ", num3, " vezes com porcentagem de "
		, mat.arredondar((num1/1000000.0)*100, 2), "\n")
		escreva("Número 4 sorteado ", num4, " vezes com porcentagem de "
		, mat.arredondar((num1/1000000.0)*100, 2), "\n")
		escreva("Número 5 sorteado ", num5, " vezes com porcentagem de "
		, mat.arredondar((num1/1000000.0)*100, 2), "\n")
		escreva("Número 6 sorteado ", num6, " vezes com porcentagem de "
		, mat.arredondar((num1/1000000.0)*100, 2), "\n")
		escreva("Total sorteados ", num1+num2+num3+num4+num5+num6)
	}

	funcao inteiro dado(){

		retorne Util.sorteia(1, 6)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 355; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */