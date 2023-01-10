package Modelo;

public class Concessionaria {
	private String nome;
	private int capacidade;
	private int numVendedores;
	private String endConcessionaria;

	public Concessionaria(String nome, int capacidade, int numVendedores, String endConcessionaria) {
		this.nome = nome;
		this.capacidade = capacidade;
		this.numVendedores = numVendedores;
		this.endConcessionaria = endConcessionaria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getNumVendedores() {
		return numVendedores;
	}

	public void setNumVendedores(int numVendedores) {
		this.numVendedores = numVendedores;
	}

	public String getEndConcessionaria() {
		return endConcessionaria;
	}

	public void setEndConcessionaria(String endConcessionaria) {
		this.endConcessionaria = endConcessionaria;
	}

	@Override
	public String toString() {
		return "CONCESSIONARIA"  + " " + 
				"|"	+ "Nome da Concessionaria:" + " " + nome +
				"|"	+ "Capacidade de Veiculos :" + " " + capacidade + 
				"|"	+"Numero de Vendedores :" + " " + numVendedores +
				"|" +"Endereco Concessionaria" + " " + endConcessionaria;
	}

}