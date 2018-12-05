/*
 * Rebaser class. 
 */
public class Rebaser {
	String numStr; 
	char[] numCharArr;
	
	static final int STORED_BASE = 10; 
	
	/**
	 * Default Constructor. 
	 * 
	 */
	public Rebaser() {
		numStr = "";
		numCharArr = numStr.toCharArray();
	}
	/**
	 * Constructor. 
	 * @param num Input value for number desired. String. 
	 */
	public Rebaser(String num) {
		numStr = num; 
		numCharArr = numStr.toCharArray();
	}
	
	/**
	 * Sets the value of the stored value. 
	 * @param val Input value. 
	 */
	public void setValue(String val) {
		numStr = val;
	}
	
	/**
	 * Returns the stored value. 
	 * @return stored value of the object. 
	 */
	public String getValue() {
		return numStr; 
	}
	
	/**
	 * Converts the stored value(treated as base 10) into any given base. 
	 * Does not change the stored value. 
	 * @param base the desired base to be converted into. 
	 * @return stored value converted into desired base. 
	 */
	public String convertToBaseN(int base) {
		//Check if the stored value is legal. 
		if (!ifLegal(STORED_BASE)) {
			return "Error";
		}
		
		//Makes the stored number an int so that it is easier to do operations. 
		int numInt = Integer.parseInt(numStr);
		int remainder = 0; 
		String rst = "";
		
		while (numInt != 0) {
			remainder = numInt % base; 
			//Add remainder to converted number
			if (remainder < 10) {
				rst = remainder + rst; 
			}else {
				rst = (remainder + 55) + rst;
			}
			numInt = numInt / base; 
		}
		
		return rst;
	}
	
	/**
	 * Converts the stored number with given base into base 10. 
	 * Does not change the stored value. 
	 * @param base Desired base to convert from. 
	 * @return stored number in the given base. 
	 */
	public String convertToBaseTen(int base) {
		
		//Iterate the char array from left to right. 
		int index  = 0; 
		int degree = numStr.length() - 1; 
		int rstInt = 0; 
		String rstStr = "";
		//TODO: currentDigit somehow some way increases in the cycle. Don't exactly know why. 
		while (index < numCharArr.length) {
			char currentChar = 0; 
			currentChar = numCharArr[index];
			int currentDigit = 0; 
			currentDigit = 0; 
			//If the current digit is a number
			if (Character.isDigit(currentChar)) {
				//The ascii of a digit is 48 larger than its own value. 
				currentDigit = currentChar - 48; 
			
			//Else if the current digit is a letter
			}else if (Character.isLetter(currentChar)) {
				//The ascii of a letter is 55 larger than the number it represents. 
				currentDigit = currentChar - 55; 
			}
			
			//Put the value of the current digit into rstInt according to its degree. 
			rstInt += currentDigit * Math.pow(base, degree); 
			//Move down the char arr, change degree accordingly. 
			index ++; 
			degree --; 
		}
		
		//Put the result int into a string. 
		rstStr = Integer.toString(rstInt);
		
		return rstStr;
	}
	
	/**
	 * Private Implementation that checks whether the stored
	 * number is legal as an input. 
	 * @param base base which the number is of. 
	 * @return true or false depending on whether it is a 
	 * 		   legal number or not. 
	 */
	private boolean ifLegal(int base) {
		
		boolean rst = true; 
		
		for (int i = 0; i < numCharArr.length; i ++) {
			//If there is a letter and the base is less than
			// 11, automatically fail. 
			if(Character.isAlphabetic(numCharArr[i]) && base <= 10) {
				rst = false; 
				break; 
			}
			
			//Check to see if the current char is a number. 
			if (Character.isDigit(numCharArr[i])) {
				
				//TODO: Error here. When i is char 1, program enters here. 
				//If the char is a number, check to see if
				// it is larger than base - 1. 
				// If so set rst to false,
				// end everything. 
				if ((numCharArr[i] - 48) > (base - 1)) {
					rst = false;
					break; 
				}
				
			}else if(Character.isAlphabetic(numCharArr[i])) {
				
				//If the char is a letter, check to see if 
				// it exceeds the maximum allowance of the 
				// base (base - 1 + 55 to ascii). 
				// If so set rst to false, end everything. 
				if (numCharArr[i] > (base - 1 + 55)) {
					rst = false;
					break; 
				}
			}
		}
		
		//If the program ended no problem, rst is true by default. 
		return rst; 
		
	}
}
