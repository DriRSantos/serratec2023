programa
{
	
	funcao inicio()
	{
		cadeia nome, senha

		escreva("Entre com o nome ")
		leia(nome)
		escreva("Entre com a senha ")
		leia(senha)

		// as linguagens são case sensitive		
		se(nome == "Maria" e senha == "123"){
			escreva("Bem vindo ao Sistsma")
		}
		senao {
			escreva("Acesso negado!")
		}

		escreva("\n", 20>10 e 5>10)
		escreva("\n", 10>20 ou 20>10)
		escreva("\n", nao(10>20)ou(20>10))  //nega tudo, inverte a resposta
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 280; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */