package assignment4;
import javax.swing.*;
import java.awt.*;

public class A4SAQ2 {
	
	
	    public static void main(String[] args) {
	        // Create the main frame
	        JFrame frame = new JFrame("Vaccination Form");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);
	        frame.setLocationRelativeTo(null); // Center the frame

	        // Create a panel with GridLayout
	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(6, 2, 10, 10)); // rows, cols, hgap, vgap
	        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

	        // Name Label and TextField
	        panel.add(new JLabel("Name:"));
	        JTextField nameField = new JTextField();
	        panel.add(nameField);

	        // Dose Checkboxes
	        panel.add(new JLabel("Dose:"));
	        JPanel dosePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        JCheckBox dose1 = new JCheckBox("1st Dose");
	        JCheckBox dose2 = new JCheckBox("2nd Dose");
	        dosePanel.add(dose1);
	        dosePanel.add(dose2);
	        panel.add(dosePanel);

	        // Vaccine Radio Buttons
	        panel.add(new JLabel("Vaccine:"));
	        JPanel vaccinePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        JRadioButton covishield = new JRadioButton("Covishield");
	        JRadioButton covaxin = new JRadioButton("Covaxin");
	        JRadioButton sputnik = new JRadioButton("Sputnik V");

	        // Group the radio buttons
	        ButtonGroup vaccineGroup = new ButtonGroup();
	        vaccineGroup.add(covishield);
	        vaccineGroup.add(covaxin);
	        vaccineGroup.add(sputnik);

	        vaccinePanel.add(covishield);
	        vaccinePanel.add(covaxin);
	        vaccinePanel.add(sputnik);
	        panel.add(vaccinePanel);

	        // Empty label for spacing
	        panel.add(new JLabel(""));

	        // Submit Button
	        JButton submitButton = new JButton("Submit");
	        panel.add(submitButton);

	        // Add panel to frame
	        frame.add(panel);
	        frame.setVisible(true);
	    }
	}

