/* 
 * Tester class for Rebaser class. 
 */
public class Tester {

	public static void main(String[] args) {
		Rebaser a = new Rebaser();// initialize 0
		Rebaser b = new Rebaser("1222121");// initialize a base 3 number
		Rebaser c = new Rebaser("567475432745"); // initialize a base 8 number
		Rebaser d = new Rebaser("1A9247A92497391"); // initialize a base 11 number
		Rebaser e = new Rebaser("ABCDCDBAD");// initialize a base 14 number
		Rebaser f = new Rebaser("ABCDEABCDEFF");// initialize a base 16 number
		
		System.out.println(a.getValue());
		System.out.println("Expected: 0");
		
		System.out.println(f.getValue());
		System.out.println("Expected: ABCDEABCDEFF");
		System.out.println(f.convertToBaseTen(16));
		System.out.println("Expected: 188900894891775");

		System.out.println(e.convertToBaseTen(14));
		System.out.println("Expected: 16015284221");

		System.out.println(d.convertToBaseTen(11));
		System.out.println("Expected: 753916012388727");

		System.out.println(c.convertToBaseTen(8));
		System.out.println("Expected: 50414892517");

		System.out.println(b.convertToBaseTen(3));
		System.out.println("Expected: 1447");

		System.out.println(b.convertToBaseN(12));
		System.out.println(d.convertToBaseN(12));
	}
}
