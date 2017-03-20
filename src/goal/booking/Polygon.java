package goal.booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author anamika.gupta created_on : 04-Feb-2017
 **/
public class Polygon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 0);
		map.put(1, 0);
		map.put(2, 0);

		while (scan.hasNext()) {
			String[] s = scan.nextLine().split(" ");
			List<Integer> input = new ArrayList<Integer>();
			for (int i = 0; i < s.length; i++) {
				input.add(Integer.valueOf(s[i]));
			}
			findPolygon(map, input);
		}

		scan.close();
		System.out.println(map.get(0) + " " + map.get(1) + " " + map.get(2));

	}

	private static void findPolygon(Map<Integer, Integer> map, List<Integer> input) {

		if (Math.abs(input.get(0)) > 2000 || Math.abs(input.get(1)) > 2000 || Math.abs(input.get(2)) > 2000
				|| Math.abs(input.get(3)) > 2000)
			map.put(2, map.get(2) + 1);
		else if (Math.min(input.get(0), Math.min(input.get(1), Math.min(input.get(2), input.get(3)))) <= 0)
			map.put(2, map.get(2) + 1);
		else if (input.get(0).equals(input.get(1)) && input.get(1).equals(input.get(2))
				&& input.get(2).equals(input.get(3)))
			map.put(0, map.get(0) + 1);
		else if (input.get(0).equals(input.get(2)) && input.get(1).equals(input.get(3)))
			map.put(1, map.get(1) + 1);
		else
			map.put(2, map.get(2) + 1);
	}
}
