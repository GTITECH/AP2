package ap2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BotaoComputar2 extends JPanel implements ActionListener {
	
	public BotaoComputar2() {
		
		setBackground(Color.GRAY);
		setLayout(new GridLayout(1, 2));
		
		criarBotoes("COMPUTAR", new Color(211, 211, 211));
	}

	public void criarBotoes(String texto, Color cor) {
		Chute b = new Chute(texto, cor);
		b.addActionListener(this);
		add(b);
	}
	
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() instanceof JButton) {
 			JButton b = (JButton) e.getSource();
            b.setIcon(new ImageIcon("img/bola3.png"));
            b.setBackground(Color.WHITE);
            b.setText("teste2");
		}
	}
}