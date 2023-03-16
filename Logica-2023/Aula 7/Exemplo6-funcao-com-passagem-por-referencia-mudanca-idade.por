programa
{
	
	funcao inicio(){

		cadeia nome
		inteiro idade
		
		escreva("Digite o seu nome: ")
		leia(nome)
		escreva("Digite a sua idade: ")
		leia(idade)

		imprimir(nome,idade)

		escreva("*****************\n")
		escreva(nome," - ", idade)
		
	}

	funcao imprimir(cadeia n, inteiro &i){ // nome passa normal, idade passa alterada pela função (&)
		escreva("Nome: ", n, "\n")
		escreva("Idade: ", i, "\n")
		n = "Joaquim"
		i=15
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 158; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */