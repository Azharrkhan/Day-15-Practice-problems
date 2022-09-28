package com.bl.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashTable {
	public static void main(String[] args) {
		System.out.println("Hash Table");
		String sentence = "We are in a situation that created by ourselves because we ignore the things that need to considered";
			
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
		String[] words = sentence.toLowerCase().split("");
		
		for (String ws : words) {
			Integer value = hashMap.get(ws);
			if (value == null)
				value = 1;
			else {
				value = value + 1;
				hashMap.add(ws, value);
			}
			System.out.println(hashMap);
			System.out.println();
			for(String word : words) {
				int frequency = hashMap.get(word);
				System.out.println("Frequency of " + word + " : \t " + frequency);
			}
			System.out.println("HashMap after elimintaing word 'avoidable' : \n");
			hashMap.remove("avoidable");
			System.out.println(hashMap);
		}
	}
}
