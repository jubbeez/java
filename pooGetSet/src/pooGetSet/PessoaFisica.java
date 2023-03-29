package pooGetSet;

public class PessoaFisica extends Cliente {
	private String cpf;
	
	public PessoaFisica(String nome,int rg,String endereco,int idade) {
		super(nome,rg,endereco,idade);
		this.cpf = cpf;
	}

	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizarPessoaFisica() {
		System.out.println("CPF: " + getCpf());
		System.out.println();
		System.out.println("========================");
	}
	
}
