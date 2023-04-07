package principal;

import pessoas.Assistente;
import pessoas.Diretor;
import pessoas.Funcionario;
import pessoas.Gerente;
import pessoas.OperadorDeCaixa;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario("Adriana", "987654932115", 1800.0, "45");
		System.out.println(func);
		
		OperadorDeCaixa operador = new OperadorDeCaixa("Edu", "5648972315", 1900.0, "61");
		System.out.println(operador);
		
		Assistente assist = new Assistente("Carlos", "65487921358", 2100.0, "23");
		System.out.println(assist);
        	
		Gerente gerente = new Gerente("Marcelo", "12365478995", 3500.0, "18");
		System.out.println(gerente);
		
		Diretor diretor = new Diretor("Maria", "56487987985", 4200.0, "12");
		System.out.println(diretor);
		
		
	}
}