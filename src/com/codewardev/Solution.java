package com.codewardev;

// https://www.codewars.com/kata/who-likes-it/train/java

public class Solution {

	public static String whoLikesIt(String... names) {
		String display = "like this";
		if(names.length < 2) {
			display = (names.length == 0? "no one likes this":names[0]+" likes this");
		} else
		if(names.length < 4) {
			display = (names.length == 2? names[0]+" and "+names[1]+" "+display : names[0]+", "+names[1]+" and "+names[2]+" "+display);
		} else {
			display = names[0]+", "+names[1]+" and "+(names.length-2)+" others "+display;
		}
		
		return display;
	}

}
