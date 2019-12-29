
public class Controller {
	
	double ris = 0;
	String result = "";
	String ciao = "Ciao";
	String Vincenzo = "Vincenzo";
	String Alessio = "Alessio";
	String LOL = "LOL";
	public String operation(double x, double y, String operator) {
		
		switch (operator) {
		
			case "+":
				
				ris = x+y;
				break;
				
			case "-":
				
				ris=x-y;
				break;
				
			case "x":
				
				ris = x*y;
				break;
				
			case "÷":
				
				ris = x/y;
				break;
					
			case "x²":
				
				ris = x*x;
				break;
				
			case "sq":
				
				ris = Math.sqrt(x);
				break;
				
			case "1/x":
				
				ris = 1/x;
				break;
				
			case "x!":
				
				double i;
				ris = x;
				for (i=x-1; i>0; i--) {
					ris = ris*i;
				
				}
				if(x == 0) {
					ris = 1;
				}
		}
		
		if (y == 0 && operator.equals("÷")) {
			
			result = "Error";
			return result;
		}
		
		else if (x < 0 && operator.equals("sq")) {
			
			result = "Error";
			return result;
		}
		
		else if(x == 0 && operator.equals("1/x")) {
			
			result = "Error";
			return result;
		}
		
		else if((operator.equals("x!") && ris != (int) ris) || (operator.contentEquals("x!") && ris < 0)) {
			
			result = "Error";
			return result;
		}
		
		else {
			
			if( ris == (int)ris ) {
				
				result = Integer.toString((int) ris);
				return result;
			}
			
			else {
				
				result = Double.toString(ris);
				return result;
			}
		}
	}
}
