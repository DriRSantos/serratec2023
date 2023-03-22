programa
{	/*
     * Membros Grupo 2:
     * Adriana dos Santos Neves	
     * Fernanda Meirelles
     * Luiz Otávio Cidade
     * Rodrigo Bastos
     */
    funcao inicio(){
    		inteiro linha=0, coluna=0, cinema[10][12]    	    		
        	
	faca{		
		imprima(cinema)
		escreva("\nDigite a linha (1 a 10) e coluna (1 a 12):\n")
		leia(linha, coluna)
		reserva(linha, coluna, cinema)    
    	   }enquanto(linha >= 0 e coluna >= 0)
    }

	funcao imprima(inteiro assentos[][]){
		para(inteiro i=0; i < 10; i++){
			para(inteiro j=0; j < 12; j++){
                    escreva(assentos[i][j], " ")
            	}
            	escreva("\n")
          }
	}
	
	funcao reserva(inteiro linha, inteiro coluna, inteiro assent[][]){		
		se(linha > 10 ou coluna > 12){
            	escreva("\nOpção inválida!!\n")
            	espere()
          }
          senao se(linha < 0 ou coluna < 0){
          	escreva("Programa finalizado!\n\n")
          }
          senao se(linha == 0 ou coluna== 0){
          	escreva("Opção inválida! Linhas de 1 a 10 e colunas de 1 a 12 \n")
            	espere()
		}          
          senao se (assent[linha-1][coluna-1] == 0){
               escreva("Assento reservado com sucesso!\n")
               assent[linha-1][coluna-1] = 1
               espere()
          }
          senao se(assent[linha-1][coluna-1] == 1){
          	escreva("Assento já está reservado!\n")
          	espere()
          } 
	}
	
	funcao espere(){
        cadeia _ 

        escreva("\nPressione ENTER para selecionar outra poltrona...\n")
        leia(_)
    }    
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 332; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */