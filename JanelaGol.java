package ap2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaGol extends JFrame{

		private JPanel painel;

		public JanelaGol(JPanel painel) {
			setSize(600, 1200);
			this.painel= painel;
			add(painel);
			setVisible(true);
		
		    ;
		}

	}