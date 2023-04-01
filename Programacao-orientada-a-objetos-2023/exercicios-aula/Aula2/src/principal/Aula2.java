package principal;

import java.util.Locale;

public class Aula2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("BEM VINDO A AULA 2 \n");
		
		int var1 = 12;
		int var2 = 20; 
		
		int soma = var1 + var2;
		double divisao = (double) var1 / (double) var2;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A divisão é: " + divisao + "\n");
		
		caracteres();
		operacoesSimples();
		prioridades();
		divisoesInteiras();
		potencia();
		trocaVariaveis();
		maioridadePenal();
		alturaMedia();
		lojaDeFerramentas();
		quantosDias();
	}
	
	public static void caracteres() {
		
		char A = 'A';
		char B = 'B';
		
		int soma1 = A + B;
		int inteiro = 65;
		char caractere = (char) inteiro;
		
		System.out.println("A soma das letras é A + B: " + soma1);
		System.out.println("O inteiro " + inteiro + " representa o caractere " + caractere + "\n");
	}
	
	public static void operacoesSimples() {
		
		double a = 5.0;
		double b = 6.0;
		
		double soma = a + b;
		double sub  = a - b;
		double mult = a * b;
		double div  = a / b;
		
		System.out.println("A soma dos números é igual a: " + soma);
		System.out.println("A subtração dos números é igual a: " + sub);
		System.out.println("A multiplicação dos números é igual a: " + mult);
		System.out.printf("A divisão dos números é igual a: %.2f", div);
	}
	
	public static void prioridades() {
		
		double resultado = 5.0 + 4.0 * 2.0;
		System.out.println("\n\nOperação: 5 + 4 * 2 = " + resultado);
			
		double resultado1 = (5.0 + 4.0) * 2.0;
		System.out.println("Operação: (5.0 + 4.0) * 2.0 = " + resultado1);
		
		double resultado2 = 1.0 + 2.0 / 3.0 * 4.0; 
		System.out.printf("Operação: 1.0 + 2.0 / 3.0 * 4.0 = %.2f", resultado2);
		
		double resultado3 = (1.0 + 2.0) / (3.0 * 4.0);
		System.out.printf("\nOperação: 1.0 + 2.0 / 3.0 * 4.0 = %.2f", resultado3);
	}
	
	public static void divisoesInteiras() {
		
		int valor = 13;
		double metade_inteira = (double) valor / 2;
		
		double resto = valor % 3;
		
		System.out.println("\n\nA metade inteira do numero é: " + metade_inteira);
		System.out.println("O resto (mod) da divisão por 3 é: " + resto);
	}
	
	public static void potencia() {
		
		double valor = 5;
				
		double pot1 = valor * valor * valor;
		
		System.out.println("\nO número ao cubo é: " + pot1);
	}
	
	public static void trocaVariaveis() {
		
		int a = 2;
		int b = 4;
		
		System.out.println("\nVariáveis antes da troca:" + "\nA = " + a + ", B = " + b);
		
		int aux = a;
		a = b; 
		b = aux;
		
		System.out.println("\nVariáveis depois da troca:" + "\nA = " + a + ", B = " + b);
	}
	
	public static void maioridadePenal() {
		
		int maioridade = 18;
		int idade = 16; 
		int anos = maioridade - idade;
		
		if(anos > 0) {
			System.out.println("\nFalta(m) " + anos + " ano(s) para você atingir a maioridade\n");
		}
		else {
			System.out.println("\nVocê já atingiu a maioridade \n");
		}
	}
	
	public static void alturaMedia() {
		
		double altura1 = 1.62;
	    double altura2 = 1.65;
	    double altura3 = 1.90;
	    double media_altura = (altura1 + altura2 + altura3) / 3;
	    
	    System.out.printf("\nA média das alturas é: %.2f m", media_altura);		
	}
	
	public static void lojaDeFerramentas() {
		
		double preco_parafuso = 1.50;
		double preco_arruela = 2.00;
		double preco_porca = 2.50;
		
		String nome = "Marcelo Collares";
		
		int quantidade_parafusos = 50;
		int quantidade_arruelas = 60;
		int quantidade_porcas = 30;
		
		double total_parafusos = preco_parafuso * quantidade_parafusos;
		double total_arruelas = preco_arruela * quantidade_arruelas;
		double total_porcas = preco_porca * quantidade_porcas;

 		double total_pagar = total_parafusos + total_arruelas + total_porcas;
 		
 		System.out.println("\n\nCliente: " + nome);
 		System.out.println("==========================");
 		System.out.println("Parafusos: " + quantidade_parafusos);
 		System.out.println("Arruelas: " + quantidade_arruelas);
 		System.out.println("Porcas: " + quantidade_porcas);
 		System.out.println("==========================");
 		System.out.println("Total a pagar:  R$ " + total_pagar);
	}		
	
	public static void quantosDias() {
		
		int ano_atual = 2023;
		
		int qtd_anos_bi = ano_atual / 4;
		int dias = (ano_atual - 1) * 365 + qtd_anos_bi;
		
		System.out.println("\nJá se passaram " + dias + " dias desde 01/01/0001");
	}
}
