package entities;

public class BalancoPatrimonial {

	private double valorJaneiro;
	private double valorFevereiro;
	private double valorMarco;
	private double valorAbril;
	private double valorMaio;
	private double valorJunho;
	private double valorJulho;
	
	public BalancoPatrimonial() {
		System.out.println("Construtor default criado");
	}

	public BalancoPatrimonial(double valorJaneiro, double valorFevereiro, double valorMarco) {
		this.valorJaneiro = valorJaneiro;
		this.valorFevereiro = valorFevereiro;
		this.valorMarco = valorMarco;
	}
	
	public BalancoPatrimonial(double valorJaneiro, double valorFevereiro, double valorMarco, double valorAbril,
			double valorMaio, double valorJunho, double valorJulho) {
		this.valorJaneiro = valorJaneiro;
		this.valorFevereiro = valorFevereiro;
		this.valorMarco = valorMarco;
		this.valorAbril = valorAbril;
		this.valorMaio = valorMaio;
		this.valorJunho = valorJunho;
		this.valorJulho = valorJulho;
	}

	public double getValorJaneiro() {
		return valorJaneiro;
	}

	public void setValorJaneiro(double valorJaneiro) {
		this.valorJaneiro = valorJaneiro;
	}

	public double getValorFevereiro() {
		return valorFevereiro;
	}

	public void setValorFevereiro(double valorFevereiro) {
		this.valorFevereiro = valorFevereiro;
	}

	public double getValorMarco() {
		return valorMarco;
	}

	public void setValorMarco(double valorMarco) {
		this.valorMarco = valorMarco;
	}

	public double getValorAbril() {
		return valorAbril;
	}

	public void setValorAbril(double valorAbril) {
		this.valorAbril = valorAbril;
	}

	public double getValorMaio() {
		return valorMaio;
	}

	public void setValorMaio(double valorMaio) {
		this.valorMaio = valorMaio;
	}

	public double getValorJunho() {
		return valorJunho;
	}

	public void setValorJunho(double valorJunho) {
		this.valorJunho = valorJunho;
	}

	public double getValorJulho() {
		return valorJulho;
	}

	public void setValorJulho(double valorJulho) {
		this.valorJulho = valorJulho;
	}

	public void gastosTrimestre(double valJaneiro, double valFevereiro, double valMarco) {
		 double soma = this.valorJaneiro + this.valorFevereiro + this.valorMarco;
		 System.out.println("\n>>> O total de gastos no trimestre foi de: " + soma + " <<<");
	}
	
	public void gastosJanJul(double valJaneiro, double valFevereiro, double valMarco, double valAbril, double valMaio, double valJunho, double Julho) {
		 double soma = this.valorJaneiro + this.valorFevereiro + this.valorMarco + this.valorAbril + this.valorMaio + this.valorJunho + this.valorJulho;
		 System.out.println("\n>>> O total de gastos de Janeiro a Julho foi de: " + soma + " <<<");
	}

	@Override
	public String toString() {
		return "\nBalanco [Janeiro = " + valorJaneiro + ", Fevereiro = " + valorFevereiro
				+ ", Marco = " + valorMarco + ", Abril = " + valorAbril + ", \n" + ", Maio = " + valorMaio
				+ ", Junho = " + valorJunho + ", Julho = " + valorJulho + "]";
	}
}
