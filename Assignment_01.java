package com.logilite.task;

import java.util.HashMap;

public class Assignment_01 {
	public static void main(String[] args) {
		String s="This is a string by me by";
		String sa[]=s.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(String word:sa) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else
			{
				map.put(word, 1);
			}
		
		}
		System.out.println(map);
	}

}
