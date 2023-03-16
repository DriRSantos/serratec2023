programa
{
	
	funcao inicio () 
	{
		cadeia nome, sobrenome
		inteiro idade
		real peso, altura
		caracter estadoCivil
		logico empregado=falso

		escreva("Digite seu nome: ")
		leia (nome)

		escreva("Digite seu sobrenome: ")
		leia (sobrenome)
		
		escreva("Digite sua idade: ")
		leia (idade)

		escreva("Qual seu peso: ")
		leia (peso)

		escreva("Qual sua altura? ")
		leia(altura)

		escreva("Seu estado civil? Casado/a (C), solteiro/a (S), viúvo/a (V)")
		leia(estadoCivil)

		escreva("Está empregado? (verdadeiro|falso) ")
		leia(empregado)

		escreva("Seu nome é: ", nome, " ", " sobrenome ", sobrenome, " idade ", idade, " peso ", peso, " altura ", altura, " estado civil ", estadoCivil, " empregado? ", empregado, "\n")
		escreva("Seu nome e sobrenome é "+nome+sobrenome)
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 768; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */