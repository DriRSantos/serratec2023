package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos segundos de duração? ");
		int segundos = sc.nextInt();
		
		int horas = segundos/3600;
		int minutos = (segundos%3600)/60;
		segundos = minutos%60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}
}
