/*
 * Rebaser class. 
 */
public class Rebaser {
	String numStr; 
	
	/**
	 * Default Constructor. 
	 * 
	 */
	public Rebaser() {
		
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
		
	}
	/**
	 * Converts the stored value with given base into base 10.
	 * Does not change the stored value.
	 * @param base the given base of stored value.
	 * @return stored value converted into base 10.
	 */
	public String convertToBaseTen(int base) {
		
	}
}
