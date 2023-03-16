programa
{
	inclua biblioteca Matematica --> mat	

	funcao inicio(){
	
		cadeia nomes[3] 
		real notas[3][4] // três alunos e quatro notas

		real medias[3] // média de três alunos

		para(inteiro i=0; i<3; i++){
			escreva("Digite o nome do aluno ", i+1, ": ")	
			leia(nomes[i])
		}

		escreva("\n")
		para(inteiro i=0; i<3; i++){			
			real soma = 0.0
		    	para(inteiro j=0; j<4; j++){
		    		escreva("Digite as notas do aluno ", i+1, ": ")	
		 		leia(notas[i][j])
		 		soma += notas[i][j] 
		    	}
		    	medias[i] = soma/4.0 // media do aluno, cada aluno é uma linha
		    	escreva("\n")
		}

		para(inteiro i=0; i<3; i++){	
			escreva("Notas aluno ", nomes[i], ": ")
			para(inteiro j=0; j<4; j++){
				escreva(" ", notas[i][j], ", ")
			}
			escreva("\n")
		}	
		
		escreva("\n")
		para(inteiro i=0; i<3; i++){	
			escreva("Médias alunos ", nomes[i], ": ")
			escreva(" ", mat.arredondar(medias[i], 2))
			se (medias[i] > 7){
				escreva(" APROVADO \n")
			}
			senao {
				escreva(" REPROVADO \n")
			}
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 70; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */