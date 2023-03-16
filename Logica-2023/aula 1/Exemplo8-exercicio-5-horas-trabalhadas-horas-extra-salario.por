programa
{
	
	funcao inicio()
	{
		real salario, horasTrab, horasExtra

		escreva("Digite o número de horas trabalhadas no ano : ")
		leia(horasTrab)

		escreva("Digite o número de horas extras trabalhadas no ano : ")
		leia(horasExtra)

		salario = (horasTrab * 10.00) + (horasExtra * 15.00)	
		
		escreva("Seu salário anual é de : R$ ", salario)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */