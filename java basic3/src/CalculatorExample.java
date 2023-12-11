
public class CalculatorExample {

	public static void main(String[] args) {
		
		
			
		Calculator calculator = new Calculator();
		
		calculator.powerOn();
		calculator.powerOff();
		
		calculator.powerOn();
		int result = calculator.plus(300,500);
		System.out.println(result);
		
	    result = calculator.plus(-50,-100);
	      System.out.println(result);
	      
	    result = calculator.plus(100,200);
	    
	    

	
	
	
	
	}

}
