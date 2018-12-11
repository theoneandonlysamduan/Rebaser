/*
 * Rebaser class. 
 */
public class Rebaser {
	String numStr; 
	String baseStr = "0123456789ABCDEF"; // create a reference sequence of bases
	
	static final int STORED_BASE = 10; 
	
	/**
	 * Default Constructor. 
	 * 
	 */
	public Rebaser() {
		numStr = "";
	}
	/**
	 * Constructor. 
	 * @param num Input value for number desired. String. 
	 */
	public Rebaser(String num) {
		numStr = num; 
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
		if (!ifLegal(STORED_BASE))
		return "-1";

		int numInt = Integer.parseInt(numStr);
		int remainder = 0;
		String rst = "";

		while (numInt != 0)
		{
			remainder = numInt % base ;
			if (remainder < STORED_BASE)
			{
				rst = remainder + rst; 
			}
			else
			{
				rst = (char)(remainder + 55) + rst;
			}
			numInt = numInt / base;
		}
		return rst;

	}
	/**
	 * Converts the stored value with given base into base 10.
	 * Does not change the stored value.
	 * @param base the given base of stored value.
	 * @return stored value converted into base 10.
	 */
	public String convertToBaseTen(int base) {
		if (!ifLegal(base))
		return "-1";

		int length = numStr.length();
		int numInt = 0;
		for (int i = 0; i < length; i++)
		{
			numInt += baseStr.indexOf(numStr.charAt(length - i - 1)) * Math.pow(base,i);
			// the number of each digit times its weight in base 10
		}
		return "" + numInt;
	}
	
	//an universal checking method without using array;
	private boolean ifLegal(int base) {
		for (int i = 0; i < numStr.length(); i++) {
			if( base > 16 || baseStr.indexOf(numStr.charAt(i)) >=
			base) // find the odds
			{
				return false;
			}			
		}
		return true;
		}
}
