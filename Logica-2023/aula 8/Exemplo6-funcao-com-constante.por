programa
{
	inteiro a = 1000, num1, num2
	const cadeia titulo = "SERRATEC - 2023/1 - LÓGICA"
	caracter operacao
	
	funcao inicio()
	{	
		inteiro resultado = 0
		
		menu()
		escreva("\n\t\t\t\t", titulo, "\n")
		menu()
		escreva("\nDigite um numero: ")
		leia(num1)
		escreva("Digite um numero: ")
		leia(num2)
		//resultado = calcular(num1, num2)
		//escreva("Resultado ", resultado)
		escreva("Resultado nº 1 + nº 2 = ", calcular(num1, num2), "\n") // espera o retorno da funcao

		incrementa(a)
		escreva("a: ", a) // passou como parametro, alterou o valor dela
	}

	funcao menu(){
		para(inteiro i=0; i < 90; i++){
			escreva("=")
		}
	}

	funcao inteiro calcular(inteiro num1, inteiro num2){ // passagem parâmetros por valor
		retorne num1 + num2                            // espera retorno pois colocou o tipo
	}

	funcao incrementa(inteiro &b){ // só somou pois é &
		b += 10				// se você quer trocar o valor da variável tem que usar referência
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 958; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */