package goal.booking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author anamika.gupta created_on : 04-Feb-2017
 **/
public class TwoSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
		int size = scan.nextInt();

		List<Integer> inp = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			inp.add(scan.nextInt());
		}
		scan.close();

		/*new TwoSum().isSumPresent(args);
		new TwoSum().isSumPresentLinear(args);
*/		new TwoSum().isSumPresentLinearArray(inp, size, sum);
	}

	private void isSumPresentLinearArray(List<Integer> inp, int size, int sum) {
		int present = 0;

		Collections.sort(inp);

		int i = 0, j = size - 1;

		while (i < j) {
			if (inp.get(i) + inp.get(j) == sum) {
				present = 1;
				break;
			}

			if (inp.get(i) + inp.get(j) < sum)
				i++;

			else if (inp.get(i) + inp.get(j) > sum)
				j--;

		}
		System.out.println(present);
	}

	public void isSumPresent(String[] input) {
		int present = 0;

		int sum = Integer.valueOf(input[0]);
		int length = Integer.valueOf(input[1]);

		Map<String, List<Integer>> inp = new HashMap<String, List<Integer>>();
		for (int i = 2; i < length + 2; i++) {
			if (inp.containsKey(input[i])) {
				inp.get(input[i]).add(i);
			} else
				inp.put(input[i], new ArrayList<Integer>(Arrays.asList(i)));
		}

		for (int i = 2; i < length + 2; i++) {
			int diff = sum - Integer.valueOf(input[i]);
			if (inp.containsKey(String.valueOf(diff))) {
				if (inp.get(String.valueOf(diff)).size() == 1 && inp.get(String.valueOf(diff)).get(0) != i
						|| inp.get(String.valueOf(diff)).size() > 2) {
					present = 1;
					break;
				}
			}
		}

		System.out.println(present);

	}

	public void isSumPresentLinear(String[] input) {

		int sum = Integer.valueOf(input[0]);
		int size = Integer.valueOf(input[1]);
		int present = 0;

		List<Integer> inp = new ArrayList<Integer>();
		for (int i = 2; i < size + 2; i++) {
			inp.add(Integer.valueOf(input[i]));
		}

		Collections.sort(inp);

		int i = 0, j = size - 1;

		while (i < j) {
			if (inp.get(i) + inp.get(j) == sum) {
				present = 1;
				break;
			}

			if (inp.get(i) + inp.get(j) < sum)
				i++;

			else if (inp.get(i) + inp.get(j) > sum)
				j--;

		}
		System.out.println(present);
	}
}
