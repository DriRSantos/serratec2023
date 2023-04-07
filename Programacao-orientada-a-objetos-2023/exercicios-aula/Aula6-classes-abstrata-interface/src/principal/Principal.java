  package principal;

import contas.ContaCorrente;
import contas.ContaCorrenteEspecial;
import contas.ContaPoupanca;
import contas.ContaPoupancaEspecial;

public class Principal {

    public static void main(String[] args) {
    	
        System.out.println("Sistema Bancário");
        System.out.println();
        
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(1000);
        conta.setTitular("Marcelo");
        
        conta.imprimeExtrato();
        
        System.out.println();
        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(5000);
        cp.setTitular("Adriana");
        
        cp.imprimeExtrato();
        
        System.out.println();
        ContaPoupancaEspecial cpe = new ContaPoupancaEspecial(15, "Mariana", 900.00, "CP Especial", 8.5, 684.0);
        cpe.imprimeExtrato();
        
        System.out.println();
        
        ContaCorrenteEspecial cce = new ContaCorrenteEspecial(12, "Marcelo", 6500.00, "CC Especial", 150.00, 2500.00, 12000.0, 76000.00);
        cce.imprimeExtrato();
    }
}