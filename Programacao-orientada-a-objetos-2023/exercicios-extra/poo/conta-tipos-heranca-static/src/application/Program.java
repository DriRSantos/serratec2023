package application;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaCorrenteEspecial;
import entities.ContaPoupanca;
import entities.ContaPoupancaEspecial;

public class Program {

    public static void main(String[] args) {
        System.out.println("Sistema Bancário");
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.setAgencia(1);
        cp.setTitular("Adriana");
        cp.depositar(500.0);
        cp.setTipo("Poupança");
        cp.setRendimento(5.0);
        
        System.out.println(cp);
        
        System.out.println();
        
        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(5);
        cc.setTitular("Fernanda");
        cc.depositar(1000.0);
        cc.setTipo("Corrente");
        cc.setLimite(1800.0);
        cc.setTarifa(85.5);
        
        System.out.println(cc);
        
        System.out.println();
        
        ContaPoupancaEspecial cpe = new ContaPoupancaEspecial();
        cpe.setAgencia(8);
        cpe.setTitular("Marcelo");
        cpe.depositar(800.0);
        cpe.setTipo("Poupança");
        cpe.setRendimento(5.0);
        cpe.setCartaoDebito(1250.0);
        
        System.out.println(cpe);
             
        ContaCorrenteEspecial cce = new ContaCorrenteEspecial();
        cce.setAgencia(10);
        cce.setTitular("Mariane");
        cce.depositar(1200.0);
        cce.setTipo("Corrente");
        cce.setLimite(1900.0);
        cce.setTarifa(85.5);
        cce.setCartaoCredito(3000.0);
        cce.setInvestimento(1000.0);
        
        System.out.println("\n" + cce);
        
        Conta cont = new ContaCorrente(); 
        cont.setAgencia(15);
        cont.setTitular("Edu");
        System.out.println("\n" + cont);
        
        System.out.println("\nTotal de contas cadastradas: " + Conta.getTotalDeContas());
        
        ContaPoupanca cp2 = new ContaPoupanca(Conta.getTotalDeContas(), 51, "Jose", 5.0, "Poupanca", 2.5);
        System.out.println("\nNova CP2 " + cp2);
        
        cp2.depositar(980.0);
        System.out.println("\nCP2 " + cp2);
        cp2.transferir(cce, 200.0);
        System.out.println("CP2 transferiu 200 para CCE ");
        System.out.println("\nSaldo CP2 após transferir " + cp2.getSaldo());
        System.out.println("Saldo CCE após transferência " + cce.getSaldo());        
    }
}