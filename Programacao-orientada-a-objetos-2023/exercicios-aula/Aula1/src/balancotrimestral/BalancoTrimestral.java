package balancotrimestral;

public class BalancoTrimestral {

	public static void main(String[] args) {
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestres = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("Os gastos do trimestre foram: " + gastosTrimestres);
	}
}
