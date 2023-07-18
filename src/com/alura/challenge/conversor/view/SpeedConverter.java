package com.alura.challenge.conversor.view;

import com.alura.challenge.conversor.function.*;

import javax.swing.JOptionPane;

public class SpeedConverter {
	public void SpeedConvert() {
		
		// Variables
		double inputDouble = 0.0;
		String from = "";
		String to = "";
		
		// Prompt for user input with an input dialog
		String input = JOptionPane.showInputDialog(null, "Amount to convert:", "Speed Converter", JOptionPane.INFORMATION_MESSAGE);

		try {
			inputDouble = Double.parseDouble(input);
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Input isn't a numeric value.", "Speed Converter", JOptionPane.INFORMATION_MESSAGE);
			SpeedConvert();
		}
		
		// Prompt for user input for destination currency

        String[] choices = {"km/h", "m/s", "cm/s", "mi/h", "ft/min"};
        from = (String) JOptionPane.showInputDialog(
                null,
                "From:",
                "Speed Converter",
                JOptionPane.QUESTION_MESSAGE,
                null,
                choices,
                choices[0]);
        to = (String) JOptionPane.showInputDialog(
                null,
                "To:",
                "Speed Converter",
                JOptionPane.QUESTION_MESSAGE,
                null,
                choices,
                choices[0]);
        
        // Display confirm message
        
        int option = JOptionPane.showConfirmDialog(null, "Confirm your selection:" + "\nAmount: " + inputDouble + "\nFrom: " + from + "\nTo: " + to);
		if (option == JOptionPane.YES_OPTION) {
		} else if (option == JOptionPane.NO_OPTION) {
			
			// Redisplay everything to re-write the user input
			SpeedConvert();
		
		} else if (option == JOptionPane.CANCEL_OPTION) {
			System.exit(0);
		}
		
		// Convert
		try {
			SpeedConvertFunction converter = new SpeedConvertFunction();
			double result = converter.Convert(inputDouble, from, to);
			
			//Format result
			String formattedResult = String.format("%.4f", result);
			
		
			JOptionPane.showMessageDialog(null, "Result:" + "\n" + inputDouble + " " + from + " equals to " + formattedResult + " " + to, "Speed Converter", JOptionPane.DEFAULT_OPTION);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "An error has ocurred while converting your input.");
			System.exit(0);
		}
	}
}
