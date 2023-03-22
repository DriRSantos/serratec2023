programa
{
	
	funcao inicio(){
	
		inteiro cont, soma=0, fatorial

		para(inteiro i=1; i < 10; i++){
			se(i % 2 == 1){
				cont = i
				fatorial = 1
				faca{
					escreva(cont, " x ")
					fatorial = fatorial * cont
					cont = cont - 1
					}enquanto(cont >= 1)
				soma += fatorial
				escreva("\nO fatorial de ", i, " é igual a ", fatorial, "\n")
			}
		}
		escreva("A soma do fatorial é ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 61; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {cont, 6, 10, 4}-{soma, 6, 16, 4}-{fatorial, 6, 24, 8}-{i, 8, 15, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */