programa
{
	/*Criar um matriz 5x2 do tipo cadeia onde deverá ser inicializada com usuários e senhas. Na função inicio o usuário 
	*deverá ler um usuário e senha. Deverá ser criada uma função para buscar na matriz se este usuário e senha foram encontrados
	*e retornar se achou ou não este usuário, caso o usuário for encontrado escreva uma mensagem "Bem ao sistema" 
	*/
	funcao inicio(){
		logico acessoLiberado = falso
		cadeia usuario, senha
		cadeia dados[5][2] = {{"Fernanda", "123"},
						  {"Adriana", "123"},
						  {"Rodrigo", "123"},
						  {"Luiz", "123"},
						  {"Julia", "123"}}
		
		
		escreva("Digite o nome do usuario que deseja buscar: ")
		leia(usuario)
		escreva("Digite a senha que deseja verificar: ")
		leia(senha)

		acessoLiberado = usuarioPodeLogar(usuario, senha, dados)

		se(acessoLiberado){
			escreva("\nBem Vindo ao Sistema!!")
		}
		senao{
			escreva("\nACESSO NEGADO!!")		
		}
		
		imprimirNomes(dados)
	} 

	funcao logico usuarioPodeLogar(cadeia u, cadeia s, cadeia matriz[][]){
		
		para(inteiro i=0; i < 5; i++){
			se(matriz[i][0] == u e matriz[i][1] == s){ //percorre a coluna dos nomes e das senhas
				retorne verdadeiro  // quando chega no retorne ele não executa mais nada
			}
		}
		retorne falso
	}
	
	funcao imprimirNomes(cadeia matriz[][]){
		escreva("\nNomes cadastrados no sistema\n")
		para(inteiro i=0; i < 5; i++){
			escreva(matriz[i][0], " \n")		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 904; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */