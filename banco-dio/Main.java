import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws SaldoInsuficienteException, TempoInsuficienteException {

		Cliente danilo = new Cliente("Danilo Arruda", "333222555-89");
		
		Conta cc = new ContaCorrente(danilo);
		Conta poupanca = new ContaPoupanca(danilo);

		cc.depositar(200);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		TituloDeCapitalizacao t1 = new TituloDeCapitalizacao();
		t1.contratarInvestimento(poupanca, 250.00,
				LocalDate.parse("2022-05-30"),
				LocalDate.parse("2023-08-30"));

		System.out.println(t1.resgatarInvestimento());
		System.out.println();

	}

}
