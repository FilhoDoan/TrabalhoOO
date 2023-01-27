package Visualizacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controle.ControleDados;
import Controle.ControleVeiculo;
import Dao.ExceptionDAO;

public class TelaDetalheVeiculo implements ActionListener {


	private JFrame janelaDetalhe;
	private JPanel painelEsquerdo;
	private JPanel painelCentral;
	private JTextField entrada1,entrada2,entrada3,entrada4,entrada5,entrada6,entrada7,entrada8,entrada9;
	private JLabel titulo, titulo2,titulo3,titulo4,titulo5,titulo6,titulo7,titulo8,titulo9;
	private JButton botaoSalvar, botaoExcluir;
	private ControleDados dados = new ControleDados();
	private String[] dadosVeiculo;
	private int posicao;
	private int codVeiculo = 0;
	public TelaDetalheVeiculo() {

		//JFrame
		janelaDetalhe = new JFrame();
		janelaDetalhe.setBounds(573 ,159, 500 , 450);


		GridBagConstraints alinhamento = new GridBagConstraints();
		alinhamento.gridx = 0;
		alinhamento.gridy = 0;
		alinhamento.insets = new Insets(3,3,3,3);
		alinhamento.anchor = GridBagConstraints.FIRST_LINE_START;

		painelEsquerdo = new JPanel();
		painelEsquerdo.setBackground(Color.LIGHT_GRAY);
		painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));

		painelCentral = new JPanel();
		painelCentral.setBounds(333 ,159, 500 , 450);	
		painelCentral.setLayout(new GridBagLayout());



		Dimension tamanhoEntrada = new Dimension(100,20);
		//Entradas
		entrada1 = new JTextField();
		entrada1.setPreferredSize(tamanhoEntrada);
		entrada1.setMaximumSize(tamanhoEntrada);
		entrada2 = new JTextField();
		entrada2.setPreferredSize(tamanhoEntrada);
		entrada2.setMaximumSize(tamanhoEntrada);
		entrada3 = new JTextField();
		entrada3.setPreferredSize(tamanhoEntrada);
		entrada3.setMaximumSize(tamanhoEntrada);
		entrada4 = new JTextField();
		entrada4.setPreferredSize(tamanhoEntrada);
		entrada4.setMaximumSize(tamanhoEntrada);
		entrada5 = new JTextField();
		entrada5.setPreferredSize(tamanhoEntrada);
		entrada5.setMaximumSize(tamanhoEntrada);
		entrada6 = new JTextField();
		entrada6.setPreferredSize(tamanhoEntrada);
		entrada6.setMaximumSize(tamanhoEntrada);
		entrada7 = new JTextField();
		entrada7.setPreferredSize(tamanhoEntrada);
		entrada7.setMaximumSize(tamanhoEntrada);
		entrada8 = new JTextField();
		entrada8.setPreferredSize(tamanhoEntrada);
		entrada8.setMaximumSize(tamanhoEntrada);
		entrada9 = new JTextField();
		entrada9.setPreferredSize(tamanhoEntrada);
		entrada9.setMaximumSize(tamanhoEntrada);


		//Titulo
		titulo =  new JLabel("Nome :");
		titulo2 = new JLabel("Ano :");
		titulo3 = new JLabel("Cor :");
		titulo4 = new JLabel("Final da Placa :");
		titulo5 = new JLabel("Numero de Portas :");
		titulo6 = new JLabel("Preco :");
		titulo7 = new JLabel("Quilometragem :");
		titulo8 = new JLabel("Categoria :");
		titulo9 = new JLabel("Marca :");

		Dimension tamanhoBotao = new Dimension(100,30);
		//Botoes
		botaoSalvar = new JButton("Salvar");
		botaoSalvar.setPreferredSize(tamanhoBotao);
		botaoSalvar.setMaximumSize(tamanhoBotao);
		botaoExcluir = new JButton("Excluir");
		botaoExcluir.setPreferredSize(tamanhoBotao);
		botaoExcluir.setMaximumSize(tamanhoBotao);
		
		alinhamento.gridx = 0;
		alinhamento.gridy = 0;
		painelCentral.add(titulo,alinhamento);
		alinhamento.gridx =1;
		alinhamento.gridy = 0;
		painelCentral.add(entrada1,alinhamento);
		alinhamento.gridx = 0;
		alinhamento.gridy = 1;
		painelCentral.add(titulo2,alinhamento);
		alinhamento.gridx =1;
		alinhamento.gridy =1;
		painelCentral.add(entrada2,alinhamento);
		alinhamento.gridx = 0;
		alinhamento.gridy = 2;
		painelCentral.add(titulo3,alinhamento);
		alinhamento.gridx =1;
		alinhamento.gridy =2;
		painelCentral.add(entrada3,alinhamento);
		alinhamento.gridx = 0;
		alinhamento.gridy = 3;
		painelCentral.add(titulo4,alinhamento);
		alinhamento.gridx = 1;
		alinhamento.gridy = 3;
		painelCentral.add(entrada4,alinhamento);
		alinhamento.gridx = 0;
		alinhamento.gridy = 4;
		painelCentral.add(titulo5,alinhamento);
		alinhamento.gridx = 1;
		alinhamento.gridy = 4;
		painelCentral.add(entrada5,alinhamento);
		alinhamento.gridx = 0;
		alinhamento.gridy = 5;
		painelCentral.add(titulo6,alinhamento);
		alinhamento.gridx = 1;
		alinhamento.gridy = 5;
		painelCentral.add(entrada6,alinhamento);
		alinhamento.gridx = 0;
		alinhamento.gridy = 6;
		painelCentral.add(titulo7,alinhamento);
		alinhamento.gridx = 1;
		alinhamento.gridy = 6;
		painelCentral.add(entrada7,alinhamento);
		alinhamento.gridx = 0;
		alinhamento.gridy = 7;
		painelCentral.add(titulo8,alinhamento);		
		alinhamento.gridx = 1;
		alinhamento.gridy = 7;
		painelCentral.add(entrada8,alinhamento);
		alinhamento.gridx = 0;
		alinhamento.gridy = 8;
		painelCentral.add(titulo9,alinhamento);
		alinhamento.gridx = 1;
		alinhamento.gridy = 8;

		botaoSalvar.addActionListener(this);

		painelCentral.add(entrada9,alinhamento);

		painelEsquerdo.add(botaoSalvar);
		painelEsquerdo.add(Box.createVerticalStrut(5));
		painelEsquerdo.add(botaoExcluir);
		painelEsquerdo.add(Box.createVerticalStrut(5));

		janelaDetalhe.add(painelCentral);
		janelaDetalhe.add(painelEsquerdo, BorderLayout.WEST);

		janelaDetalhe.setVisible(true);

	}


	public void sucessoCadastro(){

		JOptionPane.showMessageDialog(null, "Dados Cadastrados com Sucesso", null,
				JOptionPane.INFORMATION_MESSAGE);
		janelaDetalhe.dispose();
	}

	public void erroCadastro() {
		JOptionPane.showMessageDialog(null, "Erro ao Cadastrar", null,
				JOptionPane.ERROR_MESSAGE);



	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		int ano = Integer.parseInt(entrada2.getText());
		int finalPlaca = Integer.parseInt(entrada4.getText());
		int numPortas = Integer.parseInt(entrada5.getText());
		int quilometragem = Integer.parseInt(entrada7.getText());
		int preco = Integer.parseInt(entrada6.getText());
		
			
		if(src == botaoSalvar) {

			boolean res;
			try {

				ControleVeiculo controleVeiculo = new ControleVeiculo();
				
				if(this.codVeiculo == 0) {
						res = controleVeiculo.cadastrarVeiculo(entrada1.getText(), ano, entrada3.getText(), finalPlaca, numPortas, preco, 
				quilometragem, entrada8.getText(), entrada9.getText());
				}else {
					
					res = controleVeiculo.mudarVeiculo(this.codVeiculo ,entrada1.getText(), ano, entrada3.getText(), finalPlaca, numPortas, preco, 
							quilometragem, entrada8.getText(), entrada9.getText());
				}
				
				if(res == true) {
					sucessoCadastro();
					
				}else {
					erroCadastro();
				}
			}catch(NumberFormatException exe){
				erroCadastro();
				
			}catch(NullPointerException exe2) {
				erroCadastro();
				
			} catch (ExceptionDAO e1) {
				e1.printStackTrace();
			}


		}
		/* 
		if(src == botaoSalvar) {

			try {

				boolean resultado;

				dadosVeiculo = new String[10];
				dadosVeiculo[0] = Integer.toString(posicao);
				dadosVeiculo[1] = entrada1.getText(); 
				dadosVeiculo[2] = entrada2.getText();
				dadosVeiculo[3] = entrada3.getText();
				dadosVeiculo[4] = entrada4.getText();
				dadosVeiculo[5] = entrada5.getText();
				dadosVeiculo[6] = entrada6.getText();
				dadosVeiculo[7] = entrada7.getText();
				dadosVeiculo[8] = entrada8.getText();
				dadosVeiculo[9] = entrada9.getText();
				resultado = dados.cadastrarVeiculo(dadosVeiculo);
				if(resultado == true) {
					sucessoCadastro();
				}else {
					erroCadastro();
				}

			}catch(Exception exe) {

			}

		}*/

	}
}
