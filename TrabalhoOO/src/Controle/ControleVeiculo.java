package Controle;
import java.util.List;


import Modelo.Veiculo;

public class ControleVeiculo {
	
	private List<Veiculo> veiculosProntos;
	private Veiculo veiculo = new Veiculo();
	
	public ControleVeiculo() {
	}
	public ControleVeiculo(ControleDados dados) {
		veiculosProntos = dados.getDadosListaVeiculo();	
	}
	public List<Veiculo> getVeiculosProntos() {
		return veiculosProntos;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculosProntos(List<Veiculo> veiculosProntos) {
		this.veiculosProntos = veiculosProntos;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	/*
	public boolean cadastrarVeiculo(String nomeVeiculo, int ano, String cor, int finalPlaca,
			int numPortas, int preco, String quilometragem, String categoria, String marca) {
		
		if(nomeVeiculo != null && nomeVeiculo.length() > 0 && cor!= null && cor.length() >0 &&
				 finalPlaca > 0 && numPortas > 0 && preco > 0 && quilometragem!= null && quilometragem.length() >0
				&& categoria != null && categoria.length() > 0 && marca!= null && marca.length() > 0 ) {
		
		Veiculo veiculo = new Veiculo(nomeVeiculo, ano, cor, finalPlaca,numPortas,preco,quilometragem,
				categoria, marca);
		
		veiculo.cadastrarVeiculo(veiculo);
		return true;
		}
		return false;
	}
	
	
*/
	
	public String[] getListaVeiculosProntos() {
		String[] listaVeiculo = new String[veiculosProntos.size()];
		int i;
		for(i = 0; i < veiculosProntos.size(); i++) {
			listaVeiculo[i] = (veiculosProntos.get(i).getNomeVeiculo());
		}
		return listaVeiculo;
	}
}
	