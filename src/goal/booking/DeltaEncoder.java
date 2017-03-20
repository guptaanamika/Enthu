package goal.booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author anamika.gupta created_on : 04-Feb-2017
 **/
public class DeltaEncoder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();

		String[] splited = s.split(" ");

		List<Integer> input = new ArrayList<Integer>();
		for (int i = 0; i < splited.length; i++) {
			input.add(Integer.valueOf(splited[i]));
		}

		new DeltaEncoder().decode(input);
	}

	public void decode(List<Integer> input) {
		List<Integer> result = new ArrayList<Integer>();

		result.add(input.get(0));
		int prev = input.get(0);
		for (int i = 1; i < input.size(); i++) {
			int diff = input.get(i) - prev;
			if (Math.abs(diff) > 127)
				result.add(-128);

			result.add(diff);
			prev = input.get(i);
		}

		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));
			if (i != result.size())
				System.out.print(" ");
		}
		System.out.println();
	}
}
