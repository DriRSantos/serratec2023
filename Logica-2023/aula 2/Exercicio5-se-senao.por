programa
{
	
	funcao inicio()
	{
		cadeia nome, condEspecial
		inteiro idade
 
		escreva("Digite seu nome ")
		leia(nome)
		escreva("Digite sua idade ")
		leia(idade)
		escreva("Digite condição especial ")
		leia(condEspecial)

		se (idade >= 65 ou condEspecial == "deficiente" ou condEspecial == "gestante" ) {
			escreva("Usa fila preferencial ")
		}
		senao escreva("Use fila comum")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 126; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */