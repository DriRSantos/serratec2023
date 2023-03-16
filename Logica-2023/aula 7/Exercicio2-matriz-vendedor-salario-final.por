programa
{	/* Escrever um algoritmo que calcule o salario final de um vendedor, 
	* mostre o salário fixo, o valor de vendas e o salario final incluindo a comissão 
	* sobre as vendas no mês
	*/
	inclua biblioteca Matematica --> mat
	
    funcao inicio(){
        real salario, vendas, comissaoPerc
        cadeia nome
         
          escreva("Digite o nome do vendedor: ")
          leia(nome)
          escreva("Digite o salário: ")
          leia(salario)
          escreva("Informe o valor das suas vendas deste no mês: ")
          leia(vendas)
          escreva("Digite a comissão (em percentual): ")
          leia(comissaoPerc)

		calculoComissao(vendas, comissaoPerc, salario)
		
          imprimir(nome, salario, vendas, comissaoPerc)
    }

	funcao real calculoComissao(real vendas, real comissaoPerc, real salario){
		real valorComissao

		valorComissao = vendas * comissaoPerc/100
          retorne mat.arredondar(valorComissao, 2)
	}    

     funcao imprimir(cadeia nome, real salario, real vendas, real comissaoPerc){
     	real salarioFinal
	
		escreva("\n// -------------- R E S U M O --------------\n")
    		escreva("Nome: ", nome, "\n")
          escreva("Salário: ", mat.arredondar(salario, 2), "\n")
	     escreva("Valor comissão: ", calculoComissao(vendas, comissaoPerc, salario), "\n")
          salarioFinal = salario + calculoComissao(vendas, comissaoPerc, salario)
          escreva("Salário final (salário + comissão): ", salarioFinal, "\n")
          escreva("// -----------------------------------------")
	}  
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1063; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */