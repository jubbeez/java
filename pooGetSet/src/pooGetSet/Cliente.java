package pooGetSet;

public class Cliente {
	public String nome;
	public int rg;
	public int cpf;
	public String endereco;
	public int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void visualizar() {
		System.out.println("Nome: " + getNome());
		System.out.println("Rg: " + getRg());
		System.out.println("Cpf: " + getCpf());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Idade: " + getIdade());
		System.out.println();
		System.out.println("========================");
	}
}
