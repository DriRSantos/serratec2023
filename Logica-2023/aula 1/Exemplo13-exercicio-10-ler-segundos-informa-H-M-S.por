programa
{
	
	funcao inicio()
	{
		inteiro segundos, horas, minutos, resto, segundos2
		
		escreva("Quantos segudos quer converter para hora:minuto:segundos? ")
		leia(segundos)

		horas = segundos / 3600
		resto = segundos % 3600 // resto recebe os segundos restantes da divisão
		minutos = resto / 60  
		segundos2 = resto % 60  // segundos2 recebe segundos que restaram da divisão com os minutos
		

		escreva("Os segundos digitados equivalem a ", horas, ":", minutos, ":", segundos2)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */