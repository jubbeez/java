package pooGetSet;

public class Cliente {
	public String nome;
	public int rg;
	public String endereco;
	public int idade;
	
	
	public Cliente(String nome, int rg, String endereco, int idade) {
		this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
		this.idade = idade;
	}
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
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
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Idade: " + getIdade());
		System.out.println();
		System.out.println("========================");
	}
}
