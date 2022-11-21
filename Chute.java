package ap2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Chute extends JButton{

	public Chute(String texto, Color cor) {
	 setText(texto);
	 setFont(new Font("arial", Font.BOLD, 20));
	 setOpaque(true);
	 setBackground(cor);
	 setForeground(Color.black);
	 setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
	}
}