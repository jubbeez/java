package pooGetSet;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;
	
	public PessoaJuridica(String nome,int rg,String endereco,int idade) {
		super(nome, rg, endereco, idade);
		this.cnpj = cnpj;
	}

	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizarPessoaJuridica() {
		System.out.println("CNPJ: " + getCnpj());
		System.out.println();
		System.out.println("========================");
	}
	
}
