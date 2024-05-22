import java.util.List;

public class Main {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Renilson");
		Cliente cliente2 = new Cliente("Antonio");
		Cliente cliente3 = new Cliente("Andre");
		Conta cc1 = new ContaCorrente(cliente1);
		cc1.depositar(100);		
		Conta poupanca1 = new ContaPoupanca(cliente1);
		cc1.transferir(100, poupanca1);
		
		Conta cc2 = new ContaCorrente(cliente2);
		Conta poupanca2 = new ContaPoupanca(cliente2);
		
		Conta cc3 = new ContaCorrente(cliente3);
		Conta poupanca3 = new ContaPoupanca(cliente3);
		
		Banco banco = new Banco("Santander");
		banco.adicionarConta(cc1);
		banco.adicionarConta(poupanca1);
		banco.adicionarConta(cc2);
		banco.adicionarConta(poupanca2);
		banco.adicionarConta(cc3);
		banco.adicionarConta(poupanca3);
		
		banco.listarTodasContas();
		banco.excluirConta(poupanca3);
		banco.listarTodasContas();
		
		List<Conta> contasRenilson = banco.consultarContaPorCliente("Renilson");
		System.out.println(contasRenilson);
		
		cc1.imprimirExtrato();
		poupanca2.imprimirExtrato();
	}
}
