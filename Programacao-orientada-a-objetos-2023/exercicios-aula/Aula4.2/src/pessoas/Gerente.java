package pessoas;

public class Gerente extends Funcionario {

		private int senha;
		private int numeroFuncionarios;
		
		public Gerente() {
			
		}	
		
		public Gerente(String nome, String cpf, double salario, String matricula) {
			super(nome, cpf, salario, matricula);
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

		@Override
		public String toString() {
			return "Gerente [senha=" + senha + ", numeroFuncionarios=" + numeroFuncionarios + ", Nome=" + getNome()
					+ ", Cpf=" + getCpf() + ", Salario=" + getSalario() + ", Matricula=" + getMatricula()
					+ "]";
		}	
}
