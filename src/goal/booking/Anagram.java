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
public class Anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		while (scan.hasNext()) {
			String original = scan.nextLine();
			char[] c = original.toCharArray();
			
			String sorted = new String(c).trim().toLowerCase();
			if (!map.containsKey(sorted))
				map.put(sorted, new ArrayList<String>());
			map.get(sorted).add(original);

		}
		scan.close();

		Map<String, List<String>> sortedResult = new HashMap<String, List<String>>();
		List<String> keys = new ArrayList<String>();
		for (String key : map.keySet()) {
			Collections.sort(map.get(key));
			sortedResult.put(map.get(key).get(0), map.get(key));
			keys.add(map.get(key).get(0));
		}

		Collections.sort(keys);
		for (String key : keys) {
			String result = "";
			for (String value : sortedResult.get(key)) {
				result = result.concat(value).concat(",");
			}
			System.out.println(result.substring(0, result.length() - 1));
		}

	}
}
