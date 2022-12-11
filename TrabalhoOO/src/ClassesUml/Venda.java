package ClassesUml;

public class Venda {

	private int idVenda;
	private Vendedor vendedor;
	private Veiculo veiculo;
	private double precoVenda;
	private Concessionaria localVenda;
	

	public Venda(int idVenda, Vendedor vendedor, Veiculo veiculo,double precoVenda, Concessionaria localVenda) {
		this.idVenda = idVenda;
		this.vendedor = vendedor;
		this.veiculo = veiculo;
		this.precoVenda = precoVenda;
		this.localVenda = localVenda;
	}


	public int getIdVenda() {
		return idVenda;
	}


	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}


	public Vendedor getVendedor() {
		return vendedor;
	}


	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	
public  double getPrecoVenda() {
		return precoVenda;
	}


	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}


@Override
public String toString() {
	return "VENDA" +  "||" +
	"|" +"IDvenda : " + idVenda +
	"|" +  vendedor +		
	"|" + veiculo + 
	"|" + "Preco da Venda :" + precoVenda +
	"|" + localVenda;
			
			
}



}
