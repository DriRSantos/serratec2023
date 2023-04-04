package application;

import java.util.Scanner;

public class TempoJogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Que horas o jogo começou? ");
		int hora_in = sc.nextInt();
		System.out.println("Que horas o jogo terminou? ");
		int hora_fim = sc.nextInt();
		
		int duracao;				
		if(hora_fim > hora_in) {
			duracao = hora_fim - hora_in;
			System.out.println("O jogo durou " + duracao + " horas");
		}
		else {
			duracao = (24 - hora_in) + hora_fim;
			System.out.println("O jogo durou " + duracao + " horas");
		}

		sc.close();
	}
}
