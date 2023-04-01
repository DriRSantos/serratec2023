package exercicioareas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAreas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTri, areaCirc, areaTrap, areaQuad, areaRet;
		
		System.out.println("Digite o primeiro valor");
		A = sc.nextDouble();
		System.out.println("Digite o segundo valor");
		B = sc.nextDouble();
		System.out.println("Digite o terceiro valor");
		C = sc.nextDouble();
		
		areaTri = A * B / 2.0;
		areaCirc = 3.14159 * C * C;
		areaTrap = (A + B) / 2.0 * C;
		areaQuad = B * B;
		areaRet = A * B;
		
		System.out.println("A área do triângulo é: " + areaTri);	
		System.out.println("A área do triângulo é: " + areaCirc);
		System.out.println("A área do triângulo é: " + areaTrap);
		System.out.println("A área do triângulo é: " + areaQuad);
		System.out.println("A área do triângulo é: " + areaRet);
		
		
		sc.close();
	}

}
