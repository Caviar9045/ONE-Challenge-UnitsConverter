package com.alura.challenge.conversor.view;

import com.alura.challenge.conversor.function.*;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrencyConverter {
	public void CurrencyConvert() {
		
		// Variables
		double inputDouble = 0.0;
		String currencyFrom = "";
		String currencyTo = "";	
		
		// Prompt for user input with an input dialog
		String input = JOptionPane.showInputDialog(null, "Amount to convert:", "Currency Converter", JOptionPane.INFORMATION_MESSAGE);

		try {
			inputDouble = Double.parseDouble(input);
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Input isn't a numeric value.", "Currency Converter", JOptionPane.INFORMATION_MESSAGE);
			CurrencyConvert();
		}
		
		// Prompt for user input for destination currency

        String[] choices = { "MXN", "COP", "BRL", "USD", "EUR", "GBP", "JPY", "KRW"};
        currencyFrom = (String) JOptionPane.showInputDialog(
                null,
                "From:",
                "Currency Converter",
                JOptionPane.QUESTION_MESSAGE,
                null,
                choices,
                choices[0]);
        currencyTo = (String) JOptionPane.showInputDialog(
                null,
                "To:",
                "Currency Converter",
                JOptionPane.QUESTION_MESSAGE,
                null,
                choices,
                choices[0]);
        
        // Display confirm message
        
        int option = JOptionPane.showConfirmDialog(null, "Confirm your selection:" + "\nAmount: " + inputDouble + "\nFrom: " + currencyFrom + "\nTo: " + currencyTo);
		if (option == JOptionPane.YES_OPTION) {
		} else if (option == JOptionPane.NO_OPTION) {
			
			// Redisplay everything to re-write the user input
			CurrencyConvert();
		
		} else if (option == JOptionPane.CANCEL_OPTION) {
			System.exit(0);
		}
		
		// Convert
		try {
			CurrencyConvertFunction converter = new CurrencyConvertFunction();
			double result = converter.Convert(inputDouble, currencyFrom, currencyTo);
			
			//Format result
			String formattedResult = String.format("%.2f", result);
			
			
			// Get local date and time
			LocalDateTime currentDateTime = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String formattedDateTime = currentDateTime.format(formatter);
			
			JOptionPane.showMessageDialog(null, "Result:" + "\n" + inputDouble + " " + currencyFrom + " equals to " + formattedResult + " " + currencyTo + "\nDate and Time:\n" + formattedDateTime, "Currency Converter", JOptionPane.DEFAULT_OPTION);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "An error has ocurred while converting your input.");
			System.exit(0);
		}
	}
}
