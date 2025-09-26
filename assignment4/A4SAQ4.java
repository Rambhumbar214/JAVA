package assignment4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class A4SAQ4 {
	

	
	    public static void main(String[] args) {
	        // Create the main frame
	        JFrame frame = new JFrame("Language Selector");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(350, 200);
	        frame.setLocationRelativeTo(null); // Center the frame

	        // Create a panel with FlowLayout
	        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 20));

	        // Create JComboBox with language options
	        String[] languages = {"C", "C++", "Java", "Python", "SQL"};
	        JComboBox<String> languageBox = new JComboBox<>(languages);

	        // Create a button
	        JButton showButton = new JButton("Show");

	        // Create a label to display selected language
	        JLabel resultLabel = new JLabel("Selected Language: ");

	        // Add action listener to button
	        showButton.addActionListener(e -> {
	            String selectedLanguage = (String) languageBox.getSelectedItem();
	            resultLabel.setText("Selected Language: " + selectedLanguage);
	        });

	        // Add components to panel
	        panel.add(new JLabel("Choose Language:"));
	        panel.add(languageBox);
	        panel.add(showButton);
	        panel.add(resultLabel);

	        // Add panel to frame
	        frame.add(panel);
	        frame.setVisible(true);
	    }
	}

