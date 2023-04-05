package application;

import entities.BalancoPatrimonial;

public class Program {

	public static void main(String[] args) {
		
		BalancoPatrimonial construtorDefault = new BalancoPatrimonial();
		
		BalancoPatrimonial gastos = new BalancoPatrimonial(15000.0, 23000.0, 17000.0);
		System.out.println(gastos);
		
		gastos.gastosTrimestre(15000.0, 23000.0, 17000.0);
		
		gastos.setValorAbril(9000.0);
		gastos.setValorMaio(17000.0);
		gastos.setValorJunho(19000.0);
		gastos.setValorJulho(13000.0);
		
		System.out.println(gastos);
		
		System.out.println("\nGastos de julho: " + gastos.getValorJulho());
		
		BalancoPatrimonial balancoJanJul = new BalancoPatrimonial(12000.0, 5000.0, 6000.0,
				8000.0, 15000.0,18000.0, 4000.0);
		System.out.println(balancoJanJul);
		
		System.out.println("\nGastos de julho: " + balancoJanJul.getValorJulho());		
		
		balancoJanJul.gastosJanJul(12000.0, 5000.0, 6000.0, 8000.0, 15000.0, 18000.0, 4000.0);				
		
		balancoJanJul.setValorJulho(20000.0);
		System.out.println(balancoJanJul);
	}
}
