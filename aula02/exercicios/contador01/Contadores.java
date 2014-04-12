package com.aula02.exercicios.contador01;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Contadores extends JFrame implements Runnable {
	private static final long serialVersionUID = 1L;


	public Contadores () {
		iniciar();
	}
	
	public void run(){
		
	}
	
	public void iniciar(){
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(null);

		JButton increment = new JButton("Increment");
		increment.setBounds(20, 20, 100, 30);
		JButton decrement = new JButton("Decrement");
		decrement.setBounds(20, 60, 100, 30);

		final JLabel labelA = new JLabel("0");
		labelA.setBounds(130, 25, 800, 60);
		labelA.setFont(new Font("Arial",1, 52)); 

		panel.add(increment);
		panel.add(decrement);
		panel.add(labelA);
		

		setTitle("Contador Louco");
		setSize(350, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Thread t1 = new Thread(new Contador(), "contador 1");
        //t1.start();
		final Contador contador = new Contador();
		contador.setTexto(labelA);
		contador.setIncrementing(true);
		contador.start();
		
        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                contador.setIncrementing(true);
           }
        });
        
        decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                contador.setIncrementing(false);
           }
        });
	}
        
	public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Contadores ex = new Contadores();
                ex.setVisible(true);
            }
        });
        
        
    }

}
