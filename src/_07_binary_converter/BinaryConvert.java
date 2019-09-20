package _07_binary_converter;

import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConvert implements ActionListener {
	JTextField field = new JTextField();
	JButton button = new JButton();
	public static void main(String[] args) {
		BinaryConvert covert = new BinaryConvert();

		covert.createUI();

	}

	void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
	
frame.setVisible(true);
		panel.add(field);
		panel.add(button);
		frame.add(panel);
		field.setPreferredSize(new Dimension(100, 30));
		frame.pack();
		button.addActionListener(this);
	
		
		
		
	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+";// must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource().equals(button)) {
		String input = field.getText();
		field.setText(convert(input));
	}
		
	}
}
