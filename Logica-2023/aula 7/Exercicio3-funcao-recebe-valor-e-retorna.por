programa
{ /* Crie uma função que receba um valor como parâmetro e retorne do dobro do valor e exiba na tela este valor.*/
	funcao inicio(){
		inteiro valor
		
		escreva("Digite um valor: ")
		leia(valor)

		escreva("\nO dobro do valor é: ", dobroValor(valor), "\n")
		escreva("\nO valor do incremento é: ", somaV(valor), "\n")
		escreva("O valor da variável é: ", valor, "\n")
	}

	funcao inteiro dobroValor(inteiro v){
		retorne v*2
	}

	funcao inteiro somaV(inteiro &v){ // altera a variável valor ao passar por referência &
		v = v + 10
		retorne v
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */