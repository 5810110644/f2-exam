import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import jdk.internal.org.objectweb.asm.tree.analysis.Frame;

public class GUI {

    public static void main(String[] args) {
		JLabel label;
		JFrame frame = new JFrame("Geometry");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		
		JPanel facesPanel = new JPanel();
		JPanel labelPanel = new JPanel();
		JPanel textPanel = new JPanel();
		GridLayout layout = new GridLayout(0, 3);
        
		facesPanel.setLayout(layout);
        
		label = new JLabel("test");
		label.setFont(label.getFont().deriveFont(18.0f));

		JTextField textField = new JTextField();
		textField.setFont(textField.getFont().deriveFont(24.0f));
		textField.setPreferredSize(new Dimension(100, 50));
		textPanel.add(textField, BorderLayout.CENTER);

        JButton button = new JButton("2D");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText(textField.getText());
            }
        });

		JButton buttont = new JButton("3D");
        buttont.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("This is 3D");
            }
		});
		JButton buttonboth = new JButton("BOTH");
        buttonboth.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("This is 2D and 3D");
            }
		});



		facesPanel.add(button, BorderLayout.PAGE_END);
        facesPanel.add(buttont, BorderLayout.PAGE_END);
		facesPanel.add(buttonboth, BorderLayout.PAGE_END);
		labelPanel.add(label);

		frame.getContentPane().setLayout(new BorderLayout());
				
		frame.add(facesPanel, BorderLayout.PAGE_START);
		frame.add(labelPanel, BorderLayout.PAGE_END);
		frame.add(textPanel, BorderLayout.CENTER);
		frame.setVisible(true);
	}

	
}