package com.aula01.exercicios.semaforo03;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.aula01.exercicios.thread01.Contador;
import com.aula01.exercicios.thread01.Contadores;

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
		
		semaforo2.setStatus(0);
		semaforo2.start();
		
		// Semaforo 3
		Semaforo semaforo3 = new Semaforo();
		semaforo3.setRedText  (vermelho3);
		semaforo3.setOrangeText(amarelo3);
		semaforo3.setGreenText   (verde3);
		
		semaforo3.setStatus(2);
		semaforo3.start();
		
		
		// Semaforo 4
		Semaforo semaforo4 = new Semaforo();
		semaforo4.setRedText  (vermelho4);
		semaforo4.setOrangeText(amarelo4);
		semaforo4.setGreenText   (verde4);
		
		semaforo4.setStatus(2);
		semaforo4.start();
		
		
		
		long secondLast = 0;
		int currentSign = 1;
		
		while (true) {
			long secondNow = System.currentTimeMillis() / 1000;
			if (secondNow - secondLast >= 10) {
				
				switch (currentSign) {
				case 1:
					semaforo3.change();
					semaforo4.change();
					semaforo1.change();
					semaforo2.change();
					break;
				case 2:
					semaforo1.change();
					semaforo2.change();
					semaforo3.change();
					semaforo4.change();
					break;
				default:
					break;
				}
				
				secondLast = secondNow;
				currentSign++;
				// loop back
				if (currentSign == 3)
					currentSign = 1;
			}
		}
		
//		final Contador cA = new Contador();
//		final Contador cB = new Contador();
//		
//        startA.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent event) {
//                if (cA.getTexto() != null) {
//                	if (cA.isPaused()) {
//    					cA.setPaused(false);
//    				}
//                } else {
//                	cA.setTexto(labelA);
//                    cA.start();
//                }
//           }
//        });
//        
//        pauseA.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent event) {
//                cA.setPaused(true);
//           }
//        });
//        
//        stopA.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent event) {
//                cA.setPaused(true);
//                cA.setNumber(0);
//                cA.getTexto().setText("0");
//           }
//        });
//        
//        startB.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent event) {
//            	 if (cB.getTexto() != null) {
//                 	if (cB.isPaused()) {
//     					cB.setPaused(false);
//     				}
//                 } else {
//                 	cB.setTexto(labelB);
//                     cB.start();
//                 }
//           }
//        });
//        
//        pauseB.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent event) {
//                cB.setPaused(true);
//           }
//        });
//        
//        stopB.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent event) {
//                cB.setPaused(true);
//                cB.setNumber(0);
//                cB.getTexto().setText("0");
//           }
//        });
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
