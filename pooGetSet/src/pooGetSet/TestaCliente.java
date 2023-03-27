package pooGetSet;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Julia");
		cliente1.setRg(123456);
		cliente1.setCpf(123456);
		cliente1.setEndereco("amoOKkiki");
		cliente1.setIdade(21);
		
		cliente1.visualizar();

		
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Kiki");
		cliente2.setRg(123);
		cliente2.setCpf(456);
		cliente2.setEndereco("amoOKkiki2");
		cliente2.setIdade(210);
		
		cliente2.visualizar();
	
	}
}
