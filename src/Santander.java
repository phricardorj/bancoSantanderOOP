public class Santander {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Pedro Ricardo");
		cliente.setCpf("222.222.222-22");
		cliente.setProfissao("Engenheiro de Software - Fullstack");

		Conta conta = new Conta(1234,234987);
		conta.deposita(5000);
		conta.setTitular(cliente);

		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular());
	}
}