package com.alura.challenge.conversor.function;

public class TemperatureConvertFunction {
	public double Convert(double value, String from, String to) {
        
		if(from == to) {
			return value;
		}
        else if(from == "Celsius" && to == "Fahrenheit") {
        	return (value * 1.8) + 32;
        }
        else if(from == "Celsius" && to == "Kelvin") {
        	return (value + 273.15);
        }
        else if(from == "Celsius" && to == "Rankine") {
        	return (value + 273.15) * 1.8;
        }
        else if(from == "Fahrenheit" && to == "Celsius") {
        	return (value - 32) / 1.8;
        }
        else if(from == "Fahrenheit" && to == "Kelvin") {
        	return (value + 459.67) * 5/9;
        }
        else if(from == "Fahrenheit" && to == "Rankine") {
        	return (value + 459.67);
        }
        else if(from == "Kelvin" && to == "Celsius") {
        	return (value - 273.15);
        }
        else if(from == "Kelvin" && to == "Fahrenheit") {
        	return (value * 9/5 - 459.67);
        }
        else if(from == "Kelvin" && to == "Rankine") {
        	return (value * 9/5);
        }
        else if(from == "Rankine" && to == "Celsius") {
        	return (value - 491.67) * 5/9;
        }
        else if(from == "Rankine" && to == "Fahrenheit") {
        	return (value - 459.67);
        }
        else if(from == "Rankine" && to == "Kelvin") {
        	return (value * 5/9);
        }
        else {
        	return 0;
        }
	}
}
