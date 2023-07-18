package com.alura.challenge.conversor.function;

public class PressureConvertFunction {
	public double Convert(double value, String from, String to) {
        
		if(from == to) {
			return value;
		}
        else if(from == "Pa" && to == "psi") {
        	return (value*0.0001450377);
        }
        else if(from == "Pa" && to == "bar") {
        	return (value*0.00001);
        }
        else if(from == "Pa" && to == "atm") {
        	return (value*0.0000098692);
        }
        else if(from == "Pa" && to == "lbf/ft^2") {
        	return (value*0.0208854342);
        }
        else if(from == "Pa" && to == "mmHg") {
        	return (value*0.0075006376);
        }
        else if(from == "psi" && to == "Pa") {
        	return (value*6894.7572932);
        }
        else if(from == "psi" && to == "bar") {
        	return (value*0.0689475729);
        }
        else if(from == "psi" && to == "atm") {
        	return (value*0.0680459639);
        }
        else if(from == "psi" && to == "lbf/ft^2") {
        	return (value*144);
        }
        else if(from == "psi" && to == "mmHg") {
        	return (value*51.71507548);
        }
        else if(from == "bar" && to == "psi") {
        	return (value*14.503773773);
        }
        else if(from == "bar" && to == "Pa") {
        	return (value*100000);
        }
        else if(from == "bar" && to == "atm") {
        	return (value*0.9869232667);
        }
        else if(from == "bar" && to == "lbf/ft^2") {
        	return (value*2088.5434233);
        }
        else if(from == "bar" && to == "mmHg") {
        	return (value*750.06375542);
        }
        else if(from == "atm" && to == "psi") {
        	return (value*14.695948775);
        }
        else if(from == "atm" && to == "Pa") {
        	return (value*101325);
        }
        else if(from == "atm" && to == "bar") {
        	return (value*1.01325);
        }
        else if(from == "atm" && to == "lbf/ft^2") {
        	return (value*2116.2166237);
        }
        else if(from == "atm" && to == "mmHg") {
        	return (value*760.00210018);
        }
        else if(from == "lbf/ft^2" && to == "psi") {
        	return (value*0.0069444444);
        }
        else if(from == "lbf/ft^2" && to == "Pa") {
        	return (value*47.88025898);
        }
        else if(from == "lbf/ft^2" && to == "bar") {
        	return (value*0.0004788026);
        }
        else if(from == "lbf/ft^2" && to == "atm") {
        	return (value*0.0004725414);
        }
        else if(from == "lbf/ft^2" && to == "mmHg") {
        	return (value*0.3591324686);
        }
        else if(from == "mmHg" && to == "psi") {
        	return (value*0.0193367213);
        }
        else if(from == "mmHg" && to == "Pa") {
        	return (value*133.322);
        }
        else if(from == "mmHg" && to == "bar") {
        	return (value*0.00133322);
        }
        else if(from == "mmHg" && to == "lbf/ft^2") {
        	return (value*2.7844878628);
        }
        else {
        	return 0;
        }
	}
}
