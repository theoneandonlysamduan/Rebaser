
public class Tester {

	public static void main(String[] args) {
		Rebaser a = new Rebaser();// initialize 0
		Rebaser b = new Rebaser("122212");// initialize a base 3 number
		Rebaser c = new Rebaser("567475"); // initialize a base 8 number
		Rebaser d = new Rebaser("1A9247"); // initialize a base 11 number
		Rebaser e = new Rebaser("ABCDCD");// initialize a base 14 number
		Rebaser f = new Rebaser("cca");//innitialize a base 14 number

		System.out.println(e.convertToBaseTen(14));
		System.out.println("Expected: 5836473");

		System.out.println(d.convertToBaseTen(11));
		System.out.println("Expected: 319733");

		System.out.println(c.convertToBaseTen(8));
		System.out.println("Expected: 192317");

		System.out.println(b.convertToBaseTen(3));
		System.out.println("Expected: 482");
		
		System.out.println(b.convertToBaseN(12));
		System.out.println("Expected: 5A884");
		
		System.out.println(d.convertToBaseN(12));
		System.out.println("Expected: -1");
		
		System.out.println(f.convertToBaseTen(14));
		System.out.println("Expected: 2530");
		System.out.println(f.getValue());
		System.out.println("Expected: CCA");
		
		
		
	}

}