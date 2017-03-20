package goal.booking;

import java.util.Scanner;

/**
 * @author anamika.gupta created_on : 04-Feb-2017
 **/

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		String s = scan.nextLine();
		s = scan.nextLine();
		scan.close();

		// Write your code here.

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}
