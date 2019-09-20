package com.sungju.t1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/**
		 * 스캐너 주민등록번호 
		 * 123456-1234567 
		 * 012345-78910111213 
		 * 현재나이 1900,2000 - 끝 계절 성별
		 */
		System.out.println("'-'를 포함한 주민번호입력");
		Scanner sc = new Scanner(System.in);

		String jn = "090919-4000000";
		//int mon = Integer.valueOf(jn.substring(2, 4));
		
		int mon = Integer.parseInt(jn.substring(2, 4));
		int gen = Integer.parseInt(jn.substring(7, 8));
		int age = Integer.parseInt(jn.substring(0, 2));
		
		

		if (mon >= 3 && mon <= 5) {
			System.out.print("봄에 태어난 ");

		}
		if (mon >= 6 && mon <= 8) {
			System.out.print("여름에 태어난 ");

		}
		if (mon >= 9 && mon <= 11) {
			System.out.print("가을에 태어난 ");

		}
		if (mon == 12 || mon <= 2) {
			System.out.print("겨울에 태어난 ");

		}
		

		if (gen == 1 || gen == 2) {
			System.out.print((120 - age) + "살 ");
		}
		if (gen == 3 || gen == 4) {

			System.out.print((20 - age) + "살 ");
		}
		if (gen == 1 || gen == 3) {
			System.out.println("남자");
		}
		if (gen == 2 || gen == 4) {
			System.out.println("여자");
		}

	}

}
