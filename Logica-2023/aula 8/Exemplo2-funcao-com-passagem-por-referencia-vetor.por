programa
{
	
	funcao inicio()
	{
		inteiro a, vet[10]={100,90,30,60,80,15,27,80,90,34}

		trocaValor(vet,0)
		imprimir(vet)
	}

	funcao trocaValor(inteiro v[], inteiro i){ // a variável de vetor já aponta para um índice, por isso o & nela
		v[i] = 5000					// não faz diferença, ele já passa o valor para o vetor
	}

	funcao imprimir(inteiro v[]){
		para(inteiro i=0; i < 10; i++){
			escreva(v[i], " ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */