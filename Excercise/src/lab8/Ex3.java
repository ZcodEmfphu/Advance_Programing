package lab8;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class Ex3 {

	private JFrame frame;
	private JPanel panel1, panel2;
	private JTextField textField3;
	private JButton button1, button2, button3, button4;
	private ImageIcon icon1 = new ImageIcon("src/lab8/img/ex3-add.png");
	private ImageIcon icon2 = new ImageIcon("src/lab8/img/ex3-subtract.png");
	private ImageIcon icon3 = new ImageIcon("src/lab8/img/ex3-multi.png");
	private ImageIcon icon4 = new ImageIcon("src/lab8/img/ex3-divide.png");

	private Image image1 = icon1.getImage();
	private Image image2 = icon2.getImage();
	private Image image3 = icon3.getImage();
	private Image image4 = icon4.getImage();

	private Image scaledImage1 = image1.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image scaledImage2 = image2.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image scaledImage3 = image3.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image scaledImage4 = image4.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

	private ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);
	private ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
	private ImageIcon scaledIcon3 = new ImageIcon(scaledImage3);
	private ImageIcon scaledIcon4 = new ImageIcon(scaledImage4);

	public Ex3() {
		frame = new JFrame("Calculate using menu");
		frame.setLayout(new GridLayout(2, 1));
		menu();

		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

		textField3 = new JTextField(5);
		textField3.setEditable(false);

		panel1.add(new JLabel("Number 1"));
		panel1.add(new JTextField(5));
		panel1.add(new JLabel("Number 2"));
		panel1.add(new JTextField(5));
		panel1.add(new JLabel("Result"));
		panel1.add(textField3);

		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 4, 3, 3));

		button1 = new JButton("Add");
		button2 = new JButton("Subtract");
		button3 = new JButton("Multiply");
		button4 = new JButton("Divide");

		button1.setIcon(scaledIcon1);
		button2.setIcon(scaledIcon2);
		button3.setIcon(scaledIcon3);
		button4.setIcon(scaledIcon4);

		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);

		frame.add(panel1);
		frame.add(panel2);

		frame.setSize(500, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void menu() {
	    JMenuBar menuBar = new JMenuBar();
	    JMenu menu1 = new JMenu("<html><u>O</u>peration</html>");

	    JMenuItem menuItem1 = new JMenuItem("Add", scaledIcon1);
	    JMenuItem menuItem2 = new JMenuItem("Subtract", scaledIcon2);
	    JMenuItem menuItem3 = new JMenuItem("Multiply", scaledIcon3);
	    JMenuItem menuItem4 = new JMenuItem("Divide", scaledIcon4);

	    menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
	    menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
	    menuItem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_DOWN_MASK));
	    menuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK));

	    menu1.add(menuItem1);
	    menu1.add(menuItem2);
	    menu1.add(menuItem3);
	    menu1.add(menuItem4);

	    JMenu menu2 = new JMenu("<html><u>E</u>xit</html>");

	    menuBar.add(menu1);
	    menuBar.add(menu2);

	    frame.setJMenuBar(menuBar);
	}


	public static void main(String[] args) {
		new Ex3();
	}

}
