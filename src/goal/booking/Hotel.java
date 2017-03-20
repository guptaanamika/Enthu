package goal.booking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author anamika.gupta created_on : 04-Feb-2017
 **/
public class Hotel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] words = s.split(" ");

		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		for (String x : words) {
			wordMap.put(x.toLowerCase().trim().replace(".", "").replace(",", ""), 1);
		}

		int n = Integer.valueOf(scan.nextLine());

		Map<Integer, Integer> hotelMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int hotelId = Integer.valueOf(scan.nextLine());
			String review = scan.nextLine();
			int count = hotelMap.containsKey(hotelId) ? hotelMap.get(hotelId) : 0;

			String[] splitedWord = review.split(" ");
			for (String word : splitedWord) {
				String wordFormatted = word.toLowerCase().trim().replace(".", " ").replace(",", " ");
				if (wordMap.containsKey(wordFormatted))
					count++;
			}

			hotelMap.put(hotelId, count);

		}
		scan.close();

		List<HotelMap> r = new Hotel().print(hotelMap);

		for (HotelMap h : r) {
			System.out.print(h.hotelId + " ");
		}
		System.out.println();
	}

	private List<HotelMap> print(Map<Integer, Integer> hotelMap) {
		List<HotelMap> hMap = new ArrayList<HotelMap>();
		for (Integer hotelId : hotelMap.keySet()) {
			hMap.add(new HotelMap(hotelId, hotelMap.get(hotelId)));
		}
		Collections.sort(hMap, new Comparator<HotelMap>() {
			@Override
			public int compare(HotelMap paramT1, HotelMap paramT2) {
				if (paramT1.hotelReview.compareTo(paramT2.hotelReview) != 0)
					return paramT1.hotelReview.compareTo(paramT2.hotelReview) * -1;
				else
					return paramT1.hotelId.compareTo(paramT2.hotelId);
			}
		});

		return hMap;

	}

	public class HotelMap implements Comparator<HotelMap> {
		private Integer hotelId;
		private Integer hotelReview;

		public HotelMap(Integer hotelId, Integer hotelReview) {
			this.hotelId = hotelId;
			this.hotelReview = hotelReview;
		}

		@Override
		public int compare(HotelMap paramT1, HotelMap paramT2) {
			if (paramT1.hotelReview.compareTo(paramT2.hotelReview) != 0)
				return paramT1.hotelReview.compareTo(paramT2.hotelReview) * -1;
			else
				return paramT1.hotelId.compareTo(paramT2.hotelId);
		}
	}

}
