package calc;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * Calculation panel class
 *
 */

public class CalcPanelApp extends JPanel {

	/**
	 * Panel initiating method
	 */
	public CalcPanelApp() {
		setLayout(new GridLayout(4, 0));
		JTextField dividendField = new JTextField(100);
		dividendField.setToolTipText("Делимое");
		JTextField dividerField = new JTextField(100);
		dividerField.setToolTipText("Делитель");
		JTextField resultField = new JTextField(100);
		resultField.setToolTipText("Частное");

		JButton resultButton = new JButton("=");
		Font bigFont = new Font("serif", Font.BOLD, 22);
		resultButton.setFont(bigFont);

		add(dividendField);
		add(dividerField);
		add(resultButton);
		add(resultField);

		/**
		 * Data scanning and transferring for calculating method
		 */
		resultButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s_dividend = dividendField.getText();
				String s_divider = dividerField.getText();
				MetodCalc mc = new MetodCalc();
				try {
					String result = String.valueOf(mc.calc(s_dividend, s_divider));
					resultField.setText(result);
				} catch (NumberFormatException z) {
					JOptionPane.showMessageDialog(null, z.getMessage() + " - Incorrect value", "Mistake", 0, null);
				} catch (ArithmeticException e1) {
					JOptionPane.showMessageDialog(null, "The divider couldn't be null", "Mistake", 0, null);
				}
			}
		});
	}
}
