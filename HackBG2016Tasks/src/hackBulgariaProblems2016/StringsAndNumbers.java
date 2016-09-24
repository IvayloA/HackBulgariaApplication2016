package hackBulgariaProblems2016;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class StringsAndNumbers {

	public static Map<Character, Integer> sortMap(Map<Character, Integer> map) {

		List<Map.Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
			public int compare(Map.Entry<Character, Integer> ob1, Map.Entry<Character, Integer> ob2) {
				return (ob1.getValue().compareTo(ob2.getValue()));
			}
		});

		Map<Character, Integer> result = new LinkedHashMap<Character, Integer>();

		for (Map.Entry<Character, Integer> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}

		return result;
	}

	public static Map<Character, Integer> charMapping(String input) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		input = input.toLowerCase();

		for (int i = 0; i < input.length(); i++) {

			if (!map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), 1);
			} else {
				map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
			}

		}
		return map;
	}

	public static void main(String[] args) {

		String test = "pr$pprtppp{%r%%#(;%rn$;~*s%r%r%;(#(x$p([~(~(r}%=([$[#[~[;~+rr~[r#(n([r%(n%b~;"
				+ "p#rp($;$[,l?(n~p#%$prn~%$r#(~$";
		int digit = 9;
		Stack<Character> helper = new Stack<>();
		
		Map<Character, Integer> map = charMapping(test);
		Map<Character, Integer> sortedMap = sortMap(map);

		for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
			helper.push(entry.getKey());
		}

		while(digit >= 0){
			test = test.replace(helper.pop(), (char) ('0' + digit) );
			digit --;
		}		

		
		test = test.replaceAll("\\D+", " ");
		
		String[] decodedString = test.split(" ");
		long sum = 0;
		
		for(int i = 0; i < decodedString.length; i ++){	
			try{
				sum += Long.parseLong(decodedString[i]);
			}
			catch(Exception e){
				System.out.println("can't parse " + e.getMessage());
			}
		}
	
		System.out.println(sum);
	}
}
