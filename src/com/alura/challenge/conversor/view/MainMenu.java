package com.alura.challenge.conversor.view;

import javax.swing.JOptionPane;

public class MainMenu {

	public static void main(String[] args) {
		
		//Variables 
		String choice = "";
		
		// Display a welcome Message
		
		JOptionPane.showMessageDialog(null, " = Units Converter for Alura = \n\n\nVersion: 1.0\nCreated by: Caviar9045",
				"Units Converter", JOptionPane.INFORMATION_MESSAGE);
		
		// Display option dropdown
		String[] choices = { "Currency", "Temperature", "Speed", "Pressure"};
		choice = (String) JOptionPane.showInputDialog(
                null,
                "Select which type of units you want to convert: ",
                "Units Converter",
                JOptionPane.QUESTION_MESSAGE,
                null,
                choices,
                choices[0]);
		
		if(choice == "Currency") {
			CurrencyConverter currencyConverter = new CurrencyConverter();
			currencyConverter.CurrencyConvert();
		} else if(choice == "Temperature") {
			TemperatureConverter temperatureConverter = new TemperatureConverter();
			temperatureConverter.TemperatureConvert();
		} else if(choice == "Speed") {
			SpeedConverter speedConverter = new SpeedConverter();
			speedConverter.SpeedConvert();
		} else if(choice == "Pressure") {
			PressureConverter pressureConverter = new PressureConverter();
			pressureConverter.PressureConvert();
		}
		
		// Ask if user wants to re-run the app
		
		int option = JOptionPane.showConfirmDialog(null, "Would you like to keep using the app?");
        if (option == JOptionPane.YES_OPTION) {
            MainMenu.main(args);
        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Thank you for using the app!");
            System.exit(0);
        } else if (option == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Thank you for using the app!");
            System.exit(0);
        }
	}

}
