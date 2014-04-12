package com.aula01.exercicios.semaforo04;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Semaforos extends JFrame implements Runnable{

	private static final long serialVersionUID = 1L;

	public void iniciar(){
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(null);

		// Descricoes
		JLabel vermelho = new JLabel("Vermelho:");
		vermelho.setBounds(5, 0, 80, 30);
		vermelho.setFont(new Font("Arial",1, 14));

		JLabel amarelo = new JLabel("Laranja:");
		amarelo.setBounds(5, 80, 80, 30);
		amarelo.setFont(new Font("Arial",1, 14)); 

		JLabel verde = new JLabel("Verde: ");
		verde.setBounds(5, 160, 80, 30);
		verde.setFont(new Font("Arial",1, 14)); 

		panel.add(vermelho);
		panel.add(amarelo);
		panel.add(verde);

		//semaforo 1
		final JLabel vermelho1 = new JLabel("0");
		vermelho1.setBounds(80, 0, 80, 30);
		vermelho1.setFont(new Font("Arial",1, 14));

		final JLabel amarelo1 = new JLabel("0");
		amarelo1.setBounds(80, 80, 80, 30);
		amarelo1.setFont(new Font("Arial",1, 14)); 

		final JLabel verde1 = new JLabel("0");
		verde1.setBounds(80, 160, 80, 30);
		verde1.setFont(new Font("Arial",1, 14)); 

		panel.add(vermelho1);
		panel.add(amarelo1);
		panel.add(verde1);

		//semaforo 2
		final JLabel vermelho2 = new JLabel("0");
		vermelho2.setBounds(120, 0, 80, 30);
		vermelho2.setFont(new Font("Arial",1, 14));

		final JLabel amarelo2 = new JLabel("0");
		amarelo2.setBounds(120, 80, 80, 30);
		amarelo2.setFont(new Font("Arial",1, 14)); 

		final JLabel verde2 = new JLabel("0");
		verde2.setBounds(120, 160, 80, 30);
		verde2.setFont(new Font("Arial",1, 14)); 

		panel.add(vermelho2);
		panel.add(amarelo2);
		panel.add(verde2);

		//semaforo 3
		final JLabel vermelho3 = new JLabel("0");
		vermelho3.setBounds(160, 0, 80, 30);
		vermelho3.setFont(new Font("Arial",1, 14));

		final JLabel amarelo3 = new JLabel("0");
		amarelo3.setBounds(160, 80, 80, 30);
		amarelo3.setFont(new Font("Arial",1, 14)); 

		final JLabel verde3 = new JLabel("0");
		verde3.setBounds(160, 160, 80, 30);
		verde3.setFont(new Font("Arial",1, 14)); 

		panel.add(vermelho3);
		panel.add(amarelo3);
		panel.add(verde3);

		//semaforo 4
		final JLabel vermelho4 = new JLabel("0");
		vermelho4.setBounds(200, 0, 80, 30);
		vermelho4.setFont(new Font("Arial",1, 14));

		final JLabel amarelo4 = new JLabel("0");
		amarelo4.setBounds(200, 80, 80, 30);
		amarelo4.setFont(new Font("Arial",1, 14)); 

		final JLabel verde4 = new JLabel("0");
		verde4.setBounds(200, 160, 80, 30);
		verde4.setFont(new Font("Arial",1, 14)); 

		panel.add(vermelho4);
		panel.add(amarelo4);
		panel.add(verde4);

		//direita
		//semaforo 5
		final JLabel vermelho5 = new JLabel("0");
		vermelho5.setBounds(240, 0, 80, 30);
		vermelho5.setFont(new Font("Arial",1, 14));

		final JLabel amarelo5 = new JLabel("0");
		amarelo5.setBounds(240, 80, 80, 30);
		amarelo5.setFont(new Font("Arial",1, 14)); 

		final JLabel verde5 = new JLabel("0");
		verde5.setBounds(240, 160, 80, 30);
		verde5.setFont(new Font("Arial",1, 14)); 

		panel.add(vermelho5);
		panel.add(amarelo5);
		panel.add(verde5);

		//semaforo 6
		final JLabel vermelho6 = new JLabel("0");
		vermelho6.setBounds(280, 0, 80, 30);
		vermelho6.setFont(new Font("Arial",1, 14));

		final JLabel amarelo6 = new JLabel("0");
		amarelo6.setBounds(280, 80, 80, 30);
		amarelo6.setFont(new Font("Arial",1, 14)); 

		final JLabel verde6 = new JLabel("0");
		verde6.setBounds(280, 160, 80, 30);
		verde6.setFont(new Font("Arial",1, 14)); 

		panel.add(vermelho6);
		panel.add(amarelo6);
		panel.add(verde6);

		//semaforo 7
		final JLabel vermelho7 = new JLabel("0");
		vermelho7.setBounds(320, 0, 80, 30);
		vermelho7.setFont(new Font("Arial",1, 14));

		final JLabel amarelo7 = new JLabel("0");
		amarelo7.setBounds(320, 80, 80, 30);
		amarelo7.setFont(new Font("Arial",1, 14)); 

		final JLabel verde7 = new JLabel("0");
		verde7.setBounds(320, 160, 80, 30);
		verde7.setFont(new Font("Arial",1, 14)); 

		panel.add(vermelho7);
		panel.add(amarelo7);
		panel.add(verde7);

		//semaforo 8
		final JLabel vermelho8 = new JLabel("0");
		vermelho8.setBounds(360, 0, 80, 30);
		vermelho8.setFont(new Font("Arial",1, 14));

		final JLabel amarelo8 = new JLabel("0");
		amarelo8.setBounds(360, 80, 80, 30);
		amarelo8.setFont(new Font("Arial",1, 14)); 

		final JLabel verde8 = new JLabel("0");
		verde8.setBounds(360, 160, 80, 30);
		verde8.setFont(new Font("Arial",1, 14)); 

		panel.add(vermelho8);
		panel.add(amarelo8);
		panel.add(verde8);

		//fim direita


		setTitle("Semaforos");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


		// Semaforo 1
		Semaforo semaforo1 = new Semaforo();
		semaforo1.setRedText  (vermelho1);
		semaforo1.setOrangeText(amarelo1);
		semaforo1.setGreenText   (verde1);

		semaforo1.setStatus(0);
		semaforo1.start();

		// Semaforo 2
		Semaforo semaforo2 = new Semaforo();
		semaforo2.setRedText  (vermelho2);
		semaforo2.setOrangeText(amarelo2);
		semaforo2.setGreenText   (verde2);

		semaforo2.setStatus(2);
		semaforo2.start();

		// Semaforo 3
		Semaforo semaforo3 = new Semaforo();
		semaforo3.setRedText  (vermelho3);
		semaforo3.setOrangeText(amarelo3);
		semaforo3.setGreenText   (verde3);

		semaforo3.setStatus(0);
		semaforo3.start();


		// Semaforo 4
		Semaforo semaforo4 = new Semaforo();
		semaforo4.setRedText  (vermelho4);
		semaforo4.setOrangeText(amarelo4);
		semaforo4.setGreenText   (verde4);

		semaforo4.setStatus(2);
		semaforo4.start();

		// Semaforo 5
		Semaforo semaforo5 = new Semaforo();
		semaforo5.setRedText  (vermelho5);
		semaforo5.setOrangeText(amarelo5);
		semaforo5.setGreenText   (verde5);

		semaforo5.setStatus(0);
		semaforo5.start();

		// Semaforo 6
		Semaforo semaforo6 = new Semaforo();
		semaforo6.setRedText  (vermelho6);
		semaforo6.setOrangeText(amarelo6);
		semaforo6.setGreenText   (verde6);

		semaforo6.setStatus(2);
		semaforo6.start();

		// Semaforo 7
		Semaforo semaforo7 = new Semaforo();
		semaforo7.setRedText  (vermelho7);
		semaforo7.setOrangeText(amarelo7);
		semaforo7.setGreenText   (verde7);

		semaforo7.setStatus(0);
		semaforo7.start();

		// Semaforo 8
		Semaforo semaforo8 = new Semaforo();
		semaforo8.setRedText  (vermelho8);
		semaforo8.setOrangeText(amarelo8);
		semaforo8.setGreenText   (verde8);

		semaforo8.setStatus(2);
		semaforo8.start();

		long secondLast = 0;
		int currentSign = 2;

		while (true) {
			long secondNow = System.currentTimeMillis() / 1000;
			if (secondNow - secondLast >= 10) {

				switch (currentSign) {
				case 1: case 4:
//					semaforo1.change();
					semaforo2.change();
//					semaforo3.change();
					semaforo4.change();
					semaforo5.change();
//					semaforo6.change();
					semaforo7.change();
//					semaforo8.change();
					break;
				case 2: case 3:
					semaforo1.change();
//					semaforo2.change();
					semaforo3.change();
//					semaforo4.change();
//					semaforo5.change();
					semaforo6.change();
//					semaforo7.change();
					semaforo8.change();
					break;
				
				default:
					break;
				}

				secondLast = secondNow;
				currentSign++;
				// loop back
				if (currentSign == 5)
					currentSign = 1;
			}
		}

	}


	@Override
	public void run() {
		iniciar();		
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Semaforos ex = new Semaforos();
				ex.setVisible(true);
				Thread t = new Thread(ex);
				t.start();

			}
		});


	}

}
