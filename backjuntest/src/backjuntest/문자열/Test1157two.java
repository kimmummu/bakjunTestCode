package backjuntest.문자열;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Test1157two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String T = sc.next();
		char [] cha = T.toUpperCase().toCharArray();
		
		String [] arryString = new String[cha.length];
		
		for(int i = 0; i < arryString.length; i++) {
			arryString[i] = Character.toString(cha[i]);
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String key : arryString) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		Integer maxkey = Collections.max(map.values());
		int value2 = 0;
		String ques ="";
		
		for (String key : map.keySet()) {
			Integer value = map.get(key);
			if(value == maxkey) {
				if(value2 != value) {
					ques = key;
					value2 = value;
				}else if(value2 == value) {
					ques ="?";
				}
			}
		}
		
		if(ques.equals("?")) {
			System.out.println("?");
		}else {
			System.out.println(ques);
		}
	}
}
