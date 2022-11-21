package ap2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Placar extends JPanel {

	public JLabel label;
	public JLabel label2;
	public JLabel label3;
	public JLabel label4;

	public Placar() {
		this.setBackground(Color.GREEN);
		
		label = new JLabel();
		setLayout(new GridLayout(2, 2));
		label.setForeground(Color.WHITE);
		label.setText("COMPUTADOR");
		label.setFont(new Font("courier", Font.ITALIC, 40 ));
		add(label);

		label2 = new JLabel();
		setLayout(new GridLayout(2, 2));
		label2.setForeground(Color.WHITE);
		label2.setText("JOGADOR");
		label2.setFont(new Font("courier", Font.ITALIC, 40 ));
		add(label2);
		
		label3 = new JLabel();
		setLayout(new GridLayout(2, 2));
		label3.setForeground(Color.WHITE);
		label3.setText("DEFESAS");
		label3.setFont(new Font("courier", Font.ITALIC, 40 ));
		add(label3);
		
		label4 = new JLabel();
		setLayout(new GridLayout(2, 2));
		label4.setForeground(Color.WHITE);
		label4.setText("GOLS");
		label4.setFont(new Font("courier", Font.ITALIC, 40 ));
		add(label4);
	}
}