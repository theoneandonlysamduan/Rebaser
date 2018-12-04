/* 
 * Tester class for Rebaser class. 
 */
public class Tester {

	public static void main(String[] args) {
		Rebaser rebaser = new Rebaser("12A");
		String  foo = rebaser.convertToBaseN(2);
		
		System.out.println(foo);

	}

}
