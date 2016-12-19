package components;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Desktop Cleaner");
		JPanel pan = new JPanel();
		JLabel lab1 = new JLabel("Icônes peu utilisées:");	
		JButton b1 = new JButton("Purger");
		JButton b2 = new JButton("Ouvrir");
		JTextPane tpane = new JTextPane();
		ImageIcon img = new ImageIcon("file:///C:/Users/Burned!/Pictures/Screenshots/computer-cleaner-icon.jpg");
		frame.setContentPane(pan);
		frame.setBounds(300, 300, 500, 500);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		JFrame.setDefaultLookAndFeelDecorated(false);
		frame.setIconImage(img.getImage());
		tpane.setEditable(false);
		StyledDocument doc = tpane.getStyledDocument();

		SimpleAttributeSet keyWord = new SimpleAttributeSet();
		StyleConstants.setForeground(keyWord, Color.RED);
		StyleConstants.setBackground(keyWord, Color.YELLOW);
		StyleConstants.setBold(keyWord, true);

		
		GroupLayout layout = new GroupLayout(pan);
		pan.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(
				   layout.createSequentialGroup()
				      .addComponent(lab1)
				      .addComponent(tpane)
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				           .addComponent(b1)
				           .addComponent(b2))
				);
				layout.setVerticalGroup(
				   layout.createSequentialGroup()
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				           .addComponent(lab1)
				           .addComponent(tpane)
				           .addComponent(b1))
				      .addComponent(b2)
				);
		ReadFilesFromFolder liste = new ReadFilesFromFolder();
		try
		{
		    doc.insertString(0, "Start of text\n", null );
		    doc.insertString(doc.getLength(), "\nEnd of text", keyWord );
		}
		catch(Exception e) { System.out.println(e); }
		
	}

}
