package com.alura.challenge.conversor.function;

public class SpeedConvertFunction {
	public double Convert(double value, String from, String to) {
        
		if(from == to) {
			return value;
		}
        else if(from == "km/h" && to == "m/s") {
        	return (value*0.2777777778);
        }
        else if(from == "km/h" && to == "mi/h") {
        	return (value*0.6213711922);
        }
        else if(from == "km/h" && to == "cm/s") {
        	return (value*27.777777778);
        }
        else if(from == "km/h" && to == "ft/min") {
        	return (value*54.680664917);
        }
        else if(from == "m/s" && to == "km/h") {
        	return (value*3.6);
        }
        else if(from == "m/s" && to == "mi/h") {
        	return (value*2.2369362921);
        }
        else if(from == "m/s" && to == "cm/s") {
        	return (value*100);
        }
        else if(from == "m/s" && to == "ft/min") {
        	return (value*196.8503937);
        }
        else if(from == "mi/h" && to == "m/s") {
        	return (value*0.44704);
        }
        else if(from == "mi/h" && to == "km/h") {
        	return (value*1.609344);
        }
        else if(from == "mi/h" && to == "cm/s") {
        	return (value*44.704);
        }
        else if(from == "mi/h" && to == "ft/min") {
        	return (value*88);
        }
        else if(from == "cm/s" && to == "m/s") {
        	return (value*0.01);
        }
        else if(from == "cm/s" && to == "mi/h") {
        	return (value*0.0223693629);
        }
        else if(from == "cm/s" && to == "km/h") {
        	return (value*0.036);
        }
        else if(from == "cm/s" && to == "ft/min") {
        	return (value*1.968503937);
        }
        else if(from == "ft/min" && to == "m/s") {
        	return (value*0.00508);
        }
        else if(from == "ft/min" && to == "mi/h") {
        	return (value*0.0113636364);
        }
        else if(from == "ft/min" && to == "cm/s") {
        	return (value*0.508);
        }
        else if(from == "ft/min" && to == "km/h") {
        	return (value*0.018288);
        }
        else {
        	return 0;
        }
	}
}
