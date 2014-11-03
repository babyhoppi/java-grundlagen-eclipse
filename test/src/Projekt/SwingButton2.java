import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class SwingButton2 extends JFrame implements ActionListener {

	
	private static final long serialVersionUID = 6841045241524275831L;
		private JLabel label;
		private JButton button;
		private Container contentPane;
		int zaehler;
		private String labelText="";

		public SwingButton2(){
			super("SwingButton2");
			contentPane = this.getContentPane();
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(2,1));
			panel.setBorder(BorderFactory.createEmptyBorder(15,30,15,30));
			panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			button = new JButton("Drück mich!");
			button.addActionListener(this); // Listener anmelden
			label = new JLabel(labelText, SwingConstants.CENTER);
			label.setPreferredSize(new Dimension(160,26));
			//System.out.println("minimumSize: "+button.getMinimumSize());
			//System.out.println("minimumSize: "+button.getPreferredSize());
			//System.out.println("minimumSize: "+button.getMaximumSize());
			
			panel.add(button);
			panel.add(label);
			contentPane.add(BorderLayout.CENTER, panel);
			pack();
			setVisible(true);
		}
		
		public static Border createEmptyBorder(int top, int left, int bottom,int right){
			return null;
		}
		
		public void actionPerformed(ActionEvent ae) {
			zaehler++;
			label.setText("Button "+zaehler+" mal gedrückt");
		}
		public static void main(String[] args){
			new SwingButton2();

		}
		
	}