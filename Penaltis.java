package ap2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.nio.ByteOrder;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Penaltis extends JFrame{

	public Penaltis() {
		setTitle("-- PÊNALTIS 1.0 --");
		setSize(1200, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizarLayout();
		//pack();
		setVisible(true);
	}
		
	public void organizarLayout() {

		setLayout(new BorderLayout(5,5));
		
		//placar
		Placar placar = new Placar();
		placar.setPreferredSize(new Dimension(200,80));
		add(placar, BorderLayout.NORTH);
		
		//posicao dos chutes
		CoordChute coordChute = new CoordChute();
		add(coordChute, BorderLayout.CENTER);
		
		BotaoComputar botaoComputar = new BotaoComputar();
		add(botaoComputar, BorderLayout.WEST);
		
		BotaoComputar2 botaoComputar2 = new BotaoComputar2();
		add(botaoComputar2, BorderLayout.EAST);
	}
}