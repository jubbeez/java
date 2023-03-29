package pooGetSet;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Julia");
		cliente1.setRg(123456);
		cliente1.setEndereco("amoOKkiki");
		cliente1.setIdade(21);
		
		cliente1.visualizar();

		
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Kiki");
		cliente2.setRg(123);
		cliente2.setEndereco("amoOKkiki2");
		cliente2.setIdade(210);
		
		cliente2.visualizar();
		
		
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setCpf("33344455567");
		pessoaFisica.visualizarPessoaFisica();
		
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setCnpj("333444555678910");
		pessoaJuridica.visualizarPessoaJuridica();
	
	}
}
