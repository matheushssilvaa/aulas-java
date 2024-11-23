package testeUI;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UI {

	public static void main(String[] args) {
		JFrame miFrame = new JFrame("Bem vindo - titulo");
		miFrame.setSize(500,300);
		
		JPanel miJPanel = new JPanel();
		miJPanel.setSize(300, 300);
		
		miJPanel.setLayout(new GridBagLayout());
		
		JLabel mijLabel = new JLabel();
		mijLabel.setText("Digite aqui");
		
		JTextArea miJTextArea = new JTextArea(5,20);
		
		miJPanel.add(mijLabel);
		miJPanel.add(miJTextArea);
		
		miFrame.add(miJPanel);
		
		miFrame.setVisible(true);
	}

}
