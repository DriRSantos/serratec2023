programa
{
	
	funcao inicio(){
		caracter vogais[10]

		contaVogais(vogais)

		para(inteiro i=0; i < 10; i++){			
			escreva(vogais[i], " ")
		}
	}
	
	funcao contaVogais(caracter v[]){
		inteiro contA=0, contE=0, contI=0, contO=0, contU=0
		
		para(inteiro i=0; i < 10; i++){
			escreva("Digite uma vogal ")
			leia(v[i])
			
			se(v[i] == 'a'){
				contA++
			}
			senao se (v[i] == 'e'){
				contE++
			}
			senao se (v[i] == 'i'){
				contI++
			}
			senao se (v[i] == 'o'){
				contO++
			}
			senao se (v[i] == 'u'){
				contU++
			}
			senao{
				escreva("NÃO É VOGAL")
			}
		}
		escreva("\nQuantidade de a ", contA, "\n")
		escreva("Quantidade de e ", contE, "\n")
		escreva("Quantidade de i ", contI, "\n")
		escreva("Quantidade de o ", contO, "\n")
		escreva("Quantidade de u ", contU, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 58; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */