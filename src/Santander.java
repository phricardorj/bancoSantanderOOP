public class Santander {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Pedro Ricardo");
		cliente.setCpf("222.222.222-22");
		cliente.setProfissao("Engenheiro de Software - Fullstack");

		Conta ContaCorrente = new ContaCorrente(123, 123001);
		ContaCorrente.deposita(5000);
		ContaCorrente.setTitular(cliente);

		Conta ContaPoupanca = new ContaPoupanca(456, 456001);
		ContaPoupanca.deposita(5000);
		ContaPoupanca.setTitular(cliente);

		ContaCorrente.transfere(1000, ContaPoupanca);

		System.out.println("Saldo da Conta Corrente: " + ContaCorrente.getSaldo());
		System.out.println("Saldo da Conta Poupanca: " + ContaPoupanca.getSaldo());
	}
}