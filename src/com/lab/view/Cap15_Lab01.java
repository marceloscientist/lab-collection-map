package com.lab.view;

import java.util.HashMap;

public class Cap15_Lab01 {

	public static void main(String[] args) {
		HashMap<String, Integer> pessoaMap = new HashMap<>();
		pessoaMap.put("Roberto", 35);
		pessoaMap.put("Carla", 26);
		pessoaMap.put("Gabriel", 18);
		pessoaMap.put("Bruna", 17);

		
		System.out.println("-- Pessoas com get --");
		pessoaMap.forEach((k,v) -> System.out.println(k +": "+ pessoaMap.get(k)));

		System.out.println("-- Pessoas sem get --");
		pessoaMap.forEach((k,v) -> System.out.println(k +": "+ v));
	}

}
