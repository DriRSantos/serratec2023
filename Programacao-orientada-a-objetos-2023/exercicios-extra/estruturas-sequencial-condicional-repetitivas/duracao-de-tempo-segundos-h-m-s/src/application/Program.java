package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int duracao, horas, minutos, segundos;

		System.out.print("Quantos segundos de duração? ");
		duracao = sc.nextInt();

		horas = duracao / 3600;
		minutos = (duracao % 3600) / 60;
		segundos = (duracao % 3600) % 60;

		System.out.print(horas + ":" + minutos + ":" + segundos);

		sc.close();
	}
}
