package calculatorMaven.calculatorMaven;

import javax.swing.JFrame;

import calculatorMaven.calculatorMaven.CalcPanelApp;;

/**
 * Application window class
 *
 */

public class CalcApp extends JFrame {
	/**
	 * Window initiating method
	 */
	public CalcApp() {
		setBounds (100, 100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle ("Calculator");
		add(new CalcPanelApp());
		setVisible (true);
	}
}

