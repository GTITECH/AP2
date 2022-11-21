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

public class CoordChute extends JPanel implements ActionListener {

    public Placar placar;
	public CoordChute() {
		
		setBackground(Color.GREEN);
		setLayout(new GridLayout(9, 17));
		int i=0;
		int j=0;
			for (i = 0; i < 9; i++) {
				criarBotoes("" + i + ";" + j, Color.GRAY);
					for (j = 0; j < 17; j++) {
						criarBotoes("" + i + ";" + j, Color.GRAY);
			}
		}
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
            b.setText("!");
		}
	}

}
//criarBotoes("0", new Color(211, 211, 211));
//criarBotoes("1", new Color(211, 211, 211));
//criarBotoes("2", new Color(211, 211, 211));
//criarBotoes("3", new Color(211, 211, 211));
//criarBotoes("4", new Color(211, 211, 211));
//criarBotoes("5", new Color(211, 211, 211));
//criarBotoes("6", new Color(211, 211, 211));
//criarBotoes("7", new Color(211, 211, 211));
//
//criarBotoes("8", new Color(211, 211, 211));
//criarBotoes("9", new Color(211, 211, 211));
//criarBotoes("10", new Color(211, 211, 211));
//criarBotoes("11", new Color(211, 211, 211));
//criarBotoes("12", new Color(211, 211, 211));
//criarBotoes("13", new Color(211, 211, 211));
//criarBotoes("14", new Color(211, 211, 211));
//criarBotoes("15", new Color(211, 211, 211));
//
//criarBotoes("16", new Color(211, 211, 211));
//criarBotoes("17", new Color(211, 211, 211));
//criarBotoes("18", new Color(211, 211, 211));
//criarBotoes("18", new Color(211, 211, 211));
//criarBotoes("19", new Color(211, 211, 211));
//criarBotoes("20", new Color(211, 211, 211));
//criarBotoes("21", new Color(211, 211, 211));
//criarBotoes("22", new Color(211, 211, 211));
//
//criarBotoes("23", new Color(211, 211, 211));
//criarBotoes("24", new Color(211, 211, 211));
//criarBotoes("25", new Color(211, 211, 211));
//criarBotoes("26", new Color(211, 211, 211));
//criarBotoes("27", new Color(211, 211, 211));
//criarBotoes("28", new Color(211, 211, 211));
//criarBotoes("29", new Color(211, 211, 211));
//criarBotoes("30", new Color(211, 211, 211));
//
//criarBotoes("31", new Color(211, 211, 211));
//criarBotoes("32", new Color(211, 211, 211));
//criarBotoes("33", new Color(211, 211, 211));
//criarBotoes("34", new Color(211, 211, 211));
//criarBotoes("34", new Color(211, 211, 211));
//criarBotoes("35", new Color(211, 211, 211));
//criarBotoes("36", new Color(211, 211, 211));
//criarBotoes("37", new Color(211, 211, 211));
//
//criarBotoes("38", new Color(211, 211, 211));
//criarBotoes("39", new Color(211, 211, 211));
//criarBotoes("40", new Color(211, 211, 211));
//criarBotoes("41", new Color(211, 211, 211));
//criarBotoes("42", new Color(211, 211, 211));
//criarBotoes("43", new Color(211, 211, 211));
//criarBotoes("44", new Color(211, 211, 211));
//criarBotoes("45", new Color(211, 211, 211));
//
//criarBotoes("46", new Color(211, 211, 211));
//criarBotoes("47", new Color(211, 211, 211));
//criarBotoes("48", new Color(211, 211, 211));
//criarBotoes("49", new Color(211, 211, 211));
//criarBotoes("50", new Color(211, 211, 211));
//criarBotoes("51", new Color(211, 211, 211));
//criarBotoes("52", new Color(211, 211, 211));
//criarBotoes("53", new Color(211, 211, 211));
//
//criarBotoes("54", new Color(211, 211, 211));
//criarBotoes("55", new Color(211, 211, 211));
//criarBotoes("56", new Color(211, 211, 211));
//criarBotoes("57", new Color(211, 211, 211));
//criarBotoes("58", new Color(211, 211, 211));
//criarBotoes("59", new Color(211, 211, 211));
//criarBotoes("60", new Color(211, 211, 211));
//criarBotoes("61", new Color(211, 211, 211));
//
//criarBotoes("62", new Color(211, 211, 211));
//criarBotoes("63", new Color(211, 211, 211));
//criarBotoes("64", new Color(211, 211, 211));
//criarBotoes("65", new Color(211, 211, 211));
//criarBotoes("66", new Color(211, 211, 211));
//criarBotoes("67", new Color(211, 211, 211));
//criarBotoes("68", new Color(211, 211, 211));
//criarBotoes("69", new Color(211, 211, 211));
//
//criarBotoes("70", new Color(211, 211, 211));
//criarBotoes("71", new Color(211, 211, 211));
//criarBotoes("72", new Color(211, 211, 211));
//criarBotoes("73", new Color(211, 211, 211));
//criarBotoes("74", new Color(211, 211, 211));
//criarBotoes("75", new Color(211, 211, 211));
//criarBotoes("76", new Color(211, 211, 211));
//criarBotoes("77", new Color(211, 211, 211));
//
//criarBotoes("78", new Color(211, 211, 211));
//criarBotoes("79", new Color(211, 211, 211));
//criarBotoes("80", new Color(211, 211, 211));
//criarBotoes("81", new Color(211, 211, 211));
//criarBotoes("82", new Color(211, 211, 211));
//criarBotoes("83", new Color(211, 211, 211));
//criarBotoes("84", new Color(211, 211, 211));
//criarBotoes("85", new Color(211, 211, 211));
//
//criarBotoes("86", new Color(211, 211, 211));
//criarBotoes("87", new Color(211, 211, 211));
//criarBotoes("88", new Color(211, 211, 211));
//criarBotoes("89", new Color(211, 211, 211));
//criarBotoes("90", new Color(211, 211, 211));
//criarBotoes("91", new Color(211, 211, 211));
//criarBotoes("92", new Color(211, 211, 211));
//criarBotoes("93", new Color(211, 211, 211));
//
//criarBotoes("94", new Color(211, 211, 211));
//criarBotoes("95", new Color(211, 211, 211));
//criarBotoes("96", new Color(211, 211, 211));
//criarBotoes("97", new Color(211, 211, 211));
//criarBotoes("98", new Color(211, 211, 211));
//criarBotoes("99", new Color(211, 211, 211));
//criarBotoes("100", new Color(211, 211, 211));
//criarBotoes("101", new Color(211, 211, 211));
//
//criarBotoes("102", new Color(211, 211, 211));
//criarBotoes("103", new Color(211, 211, 211));
//criarBotoes("104", new Color(211, 211, 211));
//criarBotoes("105", new Color(211, 211, 211));
//criarBotoes("106", new Color(211, 211, 211));
//criarBotoes("107", new Color(211, 211, 211));
//criarBotoes("108", new Color(211, 211, 211));
//criarBotoes("109", new Color(211, 211, 211));
//
//criarBotoes("110", new Color(211, 211, 211));
//criarBotoes("111", new Color(211, 211, 211));
//criarBotoes("112", new Color(211, 211, 211));
//criarBotoes("113", new Color(211, 211, 211));
//criarBotoes("114", new Color(211, 211, 211));
//criarBotoes("115", new Color(211, 211, 211));
//criarBotoes("116", new Color(211, 211, 211));
//criarBotoes("117", new Color(211, 211, 211));
//
//criarBotoes("118", new Color(211, 211, 211));
//criarBotoes("119", new Color(211, 211, 211));
//criarBotoes("120", new Color(211, 211, 211));
//criarBotoes("121", new Color(211, 211, 211));
//criarBotoes("122", new Color(211, 211, 211));
//criarBotoes("123", new Color(211, 211, 211));
//criarBotoes("124", new Color(211, 211, 211));
//criarBotoes("125", new Color(211, 211, 211));
//
//criarBotoes("126", new Color(211, 211, 211));
//criarBotoes("127", new Color(211, 211, 211));
//criarBotoes("128", new Color(211, 211, 211));
//criarBotoes("129", new Color(211, 211, 211));
//criarBotoes("130", new Color(211, 211, 211));
//criarBotoes("131", new Color(211, 211, 211));
//criarBotoes("132", new Color(211, 211, 211));
