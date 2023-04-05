package pessoas;

public class Gerente extends Funcionario {

		private int senha;
		private int numeroFuncionarios;
		private double estoque;
		
		public Gerente() {
			
		}
		
		public Gerente (int numeroFuncionarios, double estoque) {
			this.numeroFuncionarios = numeroFuncionarios;
			this.setEstoque(estoque);
		}
		
		public Gerente(int senha, int numeroFuncionarios) {
			
			this.senha = senha;
			this.numeroFuncionarios = numeroFuncionarios;
		}

		public int getSenha() {
			return senha;
		}
		public void setSenha(int senha) {
			this.senha = senha;
		}
		public int getNumeroFuncionarios() {
			return numeroFuncionarios;
		}
		public void setNumeroFuncionarios(int numeroFuncionarios) {
			this.numeroFuncionarios = numeroFuncionarios;
		}
		
		public double getEstoque() {
			return estoque;
		}

		public void setEstoque(double estoque) {
			this.estoque = estoque;
		}
		
		public boolean autentica(int senha) {
			if(this.senha == senha) {
				System.out.println("Acesso permitido!");
				return true;
			}
			else {
				System.out.println("Acesso negado!");
				return false;
			}
		}
}
