/* 
 * Tester class for Rebaser class. 
 */
public class Tester {
		public static void main (String[] args) {
			Rebaser rebaser = new Rebaser("128");
			
			String  foo = rebaser.convertToBaseN(2);
			
			System.out.println(foo);
			
			rebaser.setValue(foo);
			
			foo = rebaser.convertToBaseTen(2);
			
			System.out.println(foo);
	}
}
