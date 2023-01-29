package Visualizacao;
//imports

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class TelaPrincipal implements ActionListener{
	private static JFrame telaPrincipal;
	private static JPanel painel1 = new JPanel();;
	private static JPanel painel2 = new JPanel(); ;
	private static JButton botaoVeiculos = new JButton("Veiculos");; 
	private static JButton botaoVendas = new JButton("Vendas");;


	//Criando o corpo da Tela
	public TelaPrincipal() {
		//JFrame da TelaPrincipal
		telaPrincipal = new JFrame("TelaPrincipal");
		telaPrincipal.setSize(600,450);
		telaPrincipal.setBounds(383 ,159, 500 , 450); 
		telaPrincipal.setResizable(false);
			
		//painel de fundo

		painel1.setBounds(383, 159, 600, 450);

		//painel cinza
	
		painel2.setBounds(0, 0, 300, 225);
		painel2.setBackground(Color.LIGHT_GRAY);
		painel2.setLayout(new BoxLayout(painel2, BoxLayout.Y_AXIS));

		//Colocando os botoes no mesmo tamanho
		Dimension tamanhoBotao = new Dimension(100,30);
		
		//Botão Veiculos
		botaoVeiculos.setPreferredSize(tamanhoBotao);
		botaoVeiculos.setMaximumSize(tamanhoBotao);
		botaoVeiculos.setMaximumSize(tamanhoBotao);
		//Botão Vendas
		
		botaoVendas.setPreferredSize(tamanhoBotao);
		botaoVendas.setMaximumSize(tamanhoBotao);
		botaoVendas.setMaximumSize(tamanhoBotao);
		
		//Fazendo as devidas adicoes 
		painel2.add(botaoVeiculos);
		painel2.add(Box.createVerticalStrut(5));
		painel2.add(botaoVendas);

		telaPrincipal.add(painel1);
		telaPrincipal.add(painel2,BorderLayout.WEST);
		telaPrincipal.setVisible(true);

	}	                                                             
	
	
	//metodo main
	public 	static void main(String[]args) {
		TelaPrincipal tela = new TelaPrincipal();
		
		
		botaoVeiculos.addActionListener(tela);
		botaoVendas.addActionListener(tela);

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Object src = e.getSource();
		
		if(src == botaoVeiculos)
			new TelaVeiculo();
			
		if(src == botaoVendas)
			new TelaVenda();	

		
			
			
	}


}