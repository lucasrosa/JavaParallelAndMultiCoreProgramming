package com.aula01.exercicios.thread01;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.aula.programa2.MinhaThread;

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

		JButton startA = new JButton("Start A");
		startA.setBounds(20, 20, 80, 30);

		JButton startB = new JButton("Start B");
		startB.setBounds(20, 60, 80, 30);

		JButton pauseA = new JButton("Pause A");
		pauseA.setBounds(100, 20, 80, 30);

		JButton pauseB = new JButton("Pause B");
		pauseB.setBounds(100, 60, 80, 30);

		JButton stopA = new JButton("Stop A");
		stopA.setBounds(180, 20, 80, 30);

		JButton stopB = new JButton("Stop B");
		stopB.setBounds(180, 60, 80, 30);

		final JLabel labelA = new JLabel("0");
		labelA.setBounds(280, 20, 80, 30);
		labelA.setFont(new Font("Arial",1, 32)); 
		
		final JLabel labelB = new JLabel("0");
		labelB.setBounds(280, 60, 80, 30);
		labelB.setFont(new Font("Arial",1, 32)); 

		panel.add(startA);
		panel.add(startB);
		panel.add(pauseA);
		panel.add(pauseB);
		panel.add(stopA);
		panel.add(stopB);
		panel.add(labelA);
		panel.add(labelB);

		setTitle("Quit button");
		setSize(350, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Thread t1 = new Thread(new Contador(), "contador 1");
        //t1.start();
		final Contador cA = new Contador();
		final Contador cB = new Contador();
		
        startA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (cA.getTexto() != null) {
                	if (cA.isPaused()) {
    					cA.setPaused(false);
    				}
                } else {
                	cA.setTexto(labelA);
                    cA.start();
                }
           }
        });
        
        pauseA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                cA.setPaused(true);
           }
        });
        
        stopA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                cA.setPaused(true);
                cA.setNumber(0);
                cA.getTexto().setText("0");
           }
        });
        
        startB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            	 if (cB.getTexto() != null) {
                 	if (cB.isPaused()) {
     					cB.setPaused(false);
     				}
                 } else {
                 	cB.setTexto(labelB);
                     cB.start();
                 }
           }
        });
        
        pauseB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                cB.setPaused(true);
           }
        });
        
        stopB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                cB.setPaused(true);
                cB.setNumber(0);
                cB.getTexto().setText("0");
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
