
public class Main {

	public static void main(String[] args) throws SaldoInsuficienteException {
		Cliente venilton = new Cliente("Venilton", "333222555-89");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
