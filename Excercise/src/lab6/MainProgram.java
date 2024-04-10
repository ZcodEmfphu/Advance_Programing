package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainProgram extends JFrame implements ActionListener {

	private Container c;

	private JLabel title;
	private JLabel input1, input2, output;
	private JTextArea tinput1, tinput2, toutput;

	public MainProgram() {
		initComponent();
		setVisible(true);
	}

	private void initComponent() {
		setTitle("Lab6");
		setBounds(300, 90, 700, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("String Optional");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(250, 30);
		c.add(title);
		inputCombonent();
		outputCombonent();
		optionButton();
	}

	private void inputCombonent() {

		input1 = new JLabel("Input:");
		input1.setFont(new Font("Arial", Font.PLAIN, 20));
		input1.setSize(100, 20);
		input1.setLocation(30, 110);
		c.add(input1);

		tinput1 = new JTextArea();
		tinput1.setFont(new Font("Arial", Font.PLAIN, 15));

		tinput1.setLineWrap(true);
		tinput1.setSize(200, 40);
		tinput1.setLocation(100, 100);

		tinput1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		c.add(tinput1);

		input2 = new JLabel("Ex-Input:");
		input2.setFont(new Font("Arial", Font.PLAIN, 20));
		input2.setSize(100, 20);
		input2.setLocation(310, 110);
		c.add(input2);

		tinput2 = new JTextArea();
		tinput2.setFont(new Font("Arial", Font.PLAIN, 15));

		tinput2.setLineWrap(true);
		tinput2.setSize(200, 40);
		tinput2.setLocation(410, 100);

		tinput2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		c.add(tinput2);
	}

	private void outputCombonent() {
		output = new JLabel("Ouput:");
		output.setFont(new Font("Arial", Font.PLAIN, 20));
		output.setSize(100, 20);
		output.setLocation(30, 210);
		c.add(output);

		toutput = new JTextArea();
		toutput.setFont(new Font("Arial", Font.PLAIN, 15));
		toutput.setSize(500, 40);
		toutput.setLocation(100, 200);

		toutput.setEnabled(false);
		toutput.setLineWrap(true);

		toutput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		c.add(toutput);
	}

	private void optionButton() {

		JButton reverseBtn = new JButton();
		reverseBtn = new JButton("Reverse");
		reverseBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		reverseBtn.setSize(150, 30);
		reverseBtn.setLocation(20, 280);
		reverseBtn.addActionListener(this);
		c.add(reverseBtn);

		JButton palindBtn = new JButton();
		palindBtn = new JButton("Palindrome");
		palindBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		palindBtn.setSize(150, 30);
		palindBtn.setLocation(175, 280);
		palindBtn.addActionListener(this);
		c.add(palindBtn);

		JButton vowelConsonantCounterBtn = new JButton();
		vowelConsonantCounterBtn = new JButton("Vowel & Consonant");
		vowelConsonantCounterBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		vowelConsonantCounterBtn.setSize(170, 30);
		vowelConsonantCounterBtn.setLocation(330, 280);
		vowelConsonantCounterBtn.addActionListener(this);
		c.add(vowelConsonantCounterBtn);

		JButton largestWord = new JButton();
		largestWord = new JButton("Largest Word");
		largestWord.setFont(new Font("Arial", Font.PLAIN, 15));
		largestWord.setSize(150, 30);
		largestWord.setLocation(505, 280);
		largestWord.addActionListener(this);
		c.add(largestWord);

		JButton anagrams = new JButton();
		anagrams = new JButton("Anagrams");
		anagrams.setFont(new Font("Arial", Font.PLAIN, 15));
		anagrams.setSize(150, 30);
		anagrams.setLocation(20, 320);
		anagrams.addActionListener(this);
		c.add(anagrams);

		JButton removeWhiteSpaces = new JButton();
		removeWhiteSpaces = new JButton("Remove White Spaces");
		removeWhiteSpaces.setFont(new Font("Arial", Font.PLAIN, 15));
		removeWhiteSpaces.setSize(200, 30);
		removeWhiteSpaces.setLocation(175, 320);
		removeWhiteSpaces.addActionListener(this);
		c.add(removeWhiteSpaces);

		JButton secondMostFrequentChar = new JButton();
		secondMostFrequentChar = new JButton("Second Most Frequent");
		secondMostFrequentChar.setFont(new Font("Arial", Font.PLAIN, 15));
		secondMostFrequentChar.setSize(200, 30);
		secondMostFrequentChar.setLocation(380, 320);
		secondMostFrequentChar.addActionListener(this);
		c.add(secondMostFrequentChar);

		JButton removeFirstLastCharacter = new JButton();
		removeFirstLastCharacter = new JButton("Remove First Last");
		removeFirstLastCharacter.setFont(new Font("Arial", Font.PLAIN, 15));
		removeFirstLastCharacter.setSize(170, 30);
		removeFirstLastCharacter.setLocation(20, 360);
		removeFirstLastCharacter.addActionListener(this);
		c.add(removeFirstLastCharacter);

		JButton countWords = new JButton();
		countWords = new JButton("Count Words");
		countWords.setFont(new Font("Arial", Font.PLAIN, 15));
		countWords.setSize(150, 30);
		countWords.setLocation(195, 360);
		countWords.addActionListener(this);
		c.add(countWords);

		JButton containsOnlyDigits = new JButton();
		containsOnlyDigits = new JButton("Contains Only Digits");
		containsOnlyDigits.setFont(new Font("Arial", Font.PLAIN, 15));
		containsOnlyDigits.setSize(190, 30);
		containsOnlyDigits.setLocation(350, 360);
		containsOnlyDigits.addActionListener(this);
		c.add(containsOnlyDigits);

		JButton countVowels = new JButton();
		countVowels = new JButton("Count Vowels");
		countVowels.setFont(new Font("Arial", Font.PLAIN, 15));
		countVowels.setSize(140, 30);
		countVowels.setLocation(545, 360);
		countVowels.addActionListener(this);
		c.add(countVowels);

		JButton reverseString = new JButton();
		reverseString = new JButton("Reverse String");
		reverseString.setFont(new Font("Arial", Font.PLAIN, 15));
		reverseString.setSize(150, 30);
		reverseString.setLocation(20, 400);
		reverseString.addActionListener(this);
		c.add(reverseString);

		JButton areAnagrams = new JButton();
		areAnagrams = new JButton("Anagrams");
		areAnagrams.setFont(new Font("Arial", Font.PLAIN, 15));
		areAnagrams.setSize(150, 30);
		areAnagrams.setLocation(180, 400);
		areAnagrams.addActionListener(this);
		c.add(areAnagrams);

		JButton removeSpecialCharacters = new JButton();
		removeSpecialCharacters = new JButton("Remove Special Characters");
		removeSpecialCharacters.setFont(new Font("Arial", Font.PLAIN, 15));
		removeSpecialCharacters.setSize(230, 30);
		removeSpecialCharacters.setLocation(340, 400);
		removeSpecialCharacters.addActionListener(this);
		c.add(removeSpecialCharacters);

		JButton removeWhiteSpaces1 = new JButton();
		removeWhiteSpaces1 = new JButton("Remove White Spaces");
		removeWhiteSpaces1.setFont(new Font("Arial", Font.PLAIN, 15));
		removeWhiteSpaces1.setSize(200, 30);
		removeWhiteSpaces1.setLocation(20, 440);
		removeWhiteSpaces1.addActionListener(this);
		c.add(removeWhiteSpaces1);

		JButton capitalizeFirstLetterOfEachWord = new JButton();
		capitalizeFirstLetterOfEachWord = new JButton("Capitalize First Letter Of Each Word");
		capitalizeFirstLetterOfEachWord.setFont(new Font("Arial", Font.PLAIN, 15));
		capitalizeFirstLetterOfEachWord.setSize(300, 30);
		capitalizeFirstLetterOfEachWord.setLocation(225, 440);
		capitalizeFirstLetterOfEachWord.addActionListener(this);
		c.add(capitalizeFirstLetterOfEachWord);

		JButton isPalindrome = new JButton();
		isPalindrome = new JButton("Palindrome");
		isPalindrome.setFont(new Font("Arial", Font.PLAIN, 15));
		isPalindrome.setSize(150, 30);
		isPalindrome.setLocation(530, 440);
		isPalindrome.addActionListener(this);
		c.add(isPalindrome);

		JButton getAllSubstrings = new JButton();
		getAllSubstrings = new JButton("All Substrings");
		getAllSubstrings.setFont(new Font("Arial", Font.PLAIN, 15));
		getAllSubstrings.setSize(150, 30);
		getAllSubstrings.setLocation(20, 480);
		getAllSubstrings.addActionListener(this);
		c.add(getAllSubstrings);

		JButton reverseString1 = new JButton();
		reverseString1 = new JButton("Reverse");
		reverseString1.setFont(new Font("Arial", Font.PLAIN, 15));
		reverseString1.setSize(100, 30);
		reverseString1.setLocation(180, 480);
		reverseString1.addActionListener(this);
		c.add(reverseString1);

		JButton concatenateStrings = new JButton();
		concatenateStrings = new JButton("Concatenate");
		concatenateStrings.setFont(new Font("Arial", Font.PLAIN, 15));
		concatenateStrings.setSize(150, 30);
		concatenateStrings.setLocation(285, 480);
		concatenateStrings.addActionListener(this);
		c.add(concatenateStrings);

		JButton removeSpecialCharacters1 = new JButton();
		removeSpecialCharacters1 = new JButton("Remove Special");
		removeSpecialCharacters1.setFont(new Font("Arial", Font.PLAIN, 15));
		removeSpecialCharacters1.setSize(200, 30);
		removeSpecialCharacters1.setLocation(440, 480);
		removeSpecialCharacters1.addActionListener(this);
		c.add(removeSpecialCharacters1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Reverse")) {
			String inputText = tinput1.getText();
			String reversedText = Ex1.reverseString(inputText);
			toutput.setText(" Reverse: " + reversedText);
		}
		if (e.getActionCommand().equals("Palindrome")) {
			String inputText = tinput1.getText();
			boolean isPalindrome = Ex2.isPalindrome(inputText);
			if (isPalindrome) {
				toutput.setText("The string is a palindrome.");
			} else {
				toutput.setText("The string is not a palindrome.");
			}
		}
		if (e.getActionCommand().equals("Vowel & Consonant")) {
			String inputText = tinput1.getText();
			String output = Ex3.countVowelsAndConsonants(inputText);
			toutput.setText(output);
		}
		if (e.getActionCommand().equals("Largest Word")) {
			String inputText = tinput1.getText();
			String output = Ex4.findLargestWord(inputText);
			toutput.setText(output);
		}
		if (e.getActionCommand().equals("Anagrams")) {
			String inputText1 = tinput1.getText();
			String inputText2 = tinput2.getText();
			boolean output = Ex5.areAnagrams(inputText1, inputText2);
			if (output) {
				toutput.setText("Two string are Anagrams.");
			} else {
				toutput.setText("Two string are not Anagrams.");
			}
		}
		if (e.getActionCommand().equals("Remove White Spaces")) {
			String inputText = tinput1.getText();
			String output = Ex6.removeWhiteSpaces(inputText);
			toutput.setText(output);
		}
		if (e.getActionCommand().equals("Second Most Frequent")) {
			String inputText = tinput1.getText();
			char charOut = Ex7.findSecondMostFrequentChar(inputText);
			String output = String.valueOf(charOut);
			toutput.setText("Second Most Frequent: " + output);
		}
		if (e.getActionCommand().equals("Remove First Last")) {
			String inputText = tinput1.getText();
			String output = Ex8.removeFirstLastCharacter(inputText);
			toutput.setText("Remove First Last: " + output);
		}
		if (e.getActionCommand().equals("Count Words")) {
			String inputText = tinput1.getText();
			String output = Ex9.countWords(inputText);
			toutput.setText("Count Words: " + output);
		}
		if (e.getActionCommand().equals("Contains Only Digits")) {
			String inputText = tinput1.getText();

			boolean output = Ex10.containsOnlyDigits(inputText);
			if (output) {
				toutput.setText("Contains Only Digits");
			} else {
				toutput.setText("Not Contains Only Digits");
			}
		}
		if (e.getActionCommand().equals("Count Vowels")) {
			String inputText = tinput1.getText();
			String output = Ex11.countVowels(inputText);
			toutput.setText(output);
		}
		if (e.getActionCommand().equals("Reverse String")) {
			String inputText = tinput1.getText();
			String output = Ex12.reverseString(inputText);
			toutput.setText("Reverse String: " + output);
		}
		if (e.getActionCommand().equals("Anagrams")) {
			String inputText1 = tinput1.getText();
			String inputText2 = tinput2.getText();
			boolean output = Ex13.areAnagrams(inputText1, inputText2);
			if (output) {
				toutput.setText("Two string are Anagrams.");
			} else {
				toutput.setText("Two string are not Anagrams.");
			}
		}
		if (e.getActionCommand().equals("Remove Special Characters")) {
			String inputText = tinput1.getText();
			String output = Ex14.removeWhiteSpaces(inputText);
			toutput.setText(output);
		}
		if (e.getActionCommand().equals("Remove White Spaces")) {
			String inputText = tinput1.getText();
			String output = Ex15.capitalizeFirstLetterOfEachWord(inputText);
			toutput.setText(output);
		}
		if (e.getActionCommand().equals("Palindrome")) {
			String inputText = tinput1.getText();
			boolean output = Ex16.isPalindrome(inputText);
			if (output) {
				toutput.setText("The string is a palindrome.");
			} else {
				toutput.setText("The string is a not palindrome.");
			}
		}
		if (e.getActionCommand().equals("All Substrings")) {
			String inputText = tinput1.getText();
			String output = Ex17.getAllSubstrings(inputText);
			toutput.setText(output);
		}
		if (e.getActionCommand().equals("Reverse")) {
			String inputText = tinput1.getText();
			String output = Ex18.reverseString(inputText);
			toutput.setText(output);
		}
		if (e.getActionCommand().equals("Concatenate")) {
			String inputText1 = tinput1.getText();
			String inputText2 = tinput2.getText();
			String output = Ex19.concatenateStrings(inputText1, inputText2);
			toutput.setText(output);
		}
		if (e.getActionCommand().equals("Remove Special Characters")) {
			String inputText1 = tinput1.getText();
			String output = Ex20.removeSpecialCharacters(inputText1);
			toutput.setText(output);
		}

	}

	public static void main(String[] args) throws Exception {
		MainProgram f = new MainProgram();
	}

}