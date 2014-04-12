package com.aula02.exercicios.corrida02;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Run extends JFrame implements Runnable {
	private static final long serialVersionUID = 1L;


	public Run () {
		iniciar();
	}
	
	public void run(){
		
	}
	
	public void iniciar(){
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(null);
		
		final JLabel finalLine = new JLabel("|");
		finalLine.setBounds(316, 5, 800, 60);
		finalLine.setFont(new Font("Arial",1, 20)); 
		panel.add(finalLine);
		final JLabel finalLine2 = new JLabel("|");
		finalLine2.setBounds(316, 20, 800, 60);
		finalLine2.setFont(new Font("Arial",1, 20)); 
		panel.add(finalLine2);
		
		final JLabel andersonLabel = new JLabel("A");
		andersonLabel.setBounds(0, 10, 800, 60);
		andersonLabel.setFont(new Font("Arial",1, 12)); 

		panel.add(andersonLabel);
		final JLabel lucasLabel = new JLabel("L");
		lucasLabel.setBounds(0, 20, 800, 60);
		lucasLabel.setFont(new Font("Arial",1, 12)); 

		panel.add(lucasLabel);
		
		panel.setLayout(null);

		setTitle("Run");
		setSize(350, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		final Runner anderson = new Runner();
		anderson.setText(andersonLabel);		
		
		final Runner lucas = new Runner();
		lucas.setText(lucasLabel);
		
		
		final Judge curvello = new Judge();
		curvello.addRunner(anderson);
		curvello.addRunner(lucas);
		curvello.start();
		anderson.start();
		lucas.start();
		// Run a while getting the position, the first one bigger than 320 wins
	}
        
	public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Run ex = new Run();
                ex.setVisible(true);
            }
        });
        
        
    }

}
