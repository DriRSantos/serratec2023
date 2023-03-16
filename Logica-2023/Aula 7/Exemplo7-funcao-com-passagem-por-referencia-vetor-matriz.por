programa
{
	funcao inicio(){

		inteiro is[5]={1, 10, 30, 50, 20}, ms[2][2] = {{1,2}, {3,4}}		
		
		imprimir(is)

		imprimir2(ms)
	}

	funcao imprimir(inteiro b[]){
		para(inteiro i=0; i < 5; i++){
			escreva(b[i], "\n")
		}
	}	

	funcao imprimir2(inteiro c[][]){
		para(inteiro i=0; i < 2; i++){
			para(inteiro j=0; j < 2; j++){
				escreva(c[i][j], "\t")	
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 118; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */