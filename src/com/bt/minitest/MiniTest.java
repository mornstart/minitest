package com.bt.minitest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("please Input Integer(0~99):");
		String arrayString = sc.nextLine();
		System.out.println(letterCombinations(arrayString));
		sc.close();

	}

	public static List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
		if (digits.equals(""))
			return result;
		String[] s = new String[10];
		s[0] = "";
		s[1] = "";
		s[2] = "abc";
		s[3] = "def";
		s[4] = "ghi";
		s[5] = "jkl";
		s[6] = "mno";
		s[7] = "pqrs";
		s[8] = "tuv";
		s[9] = "wxyz";

		result.add("");
		for (int i = 0; i < digits.length(); i++) {
			int num = digits.charAt(i) - '0'; // see every char
			int rs = result.size();
			for (int j = 0; j < rs; j++) {
				// concat every char
				String current = result.get(0);
				for (int k = 0; k < s[num].length(); k++) {
					result.add(current + s[num].charAt(k));
				}
				if (result.size() > 1)
					result.remove(0); // remove the first char 
			}
		}

		return result;
	}
}
