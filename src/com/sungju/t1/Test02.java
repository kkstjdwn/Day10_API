package com.sungju.t1;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		/**
		 * 주민등록번호입력 000000-0000000
		 * 		0
		 * 	
		 * 1.	x2	x3	x4	x5	x6	x7	x8	x9	x2	x3	x4	x5	검증
		 * 2.	 -- > 다 더함
		 * 3.	총합 / 11 몫 x 나머지 y
		 * 4.	11 - 나머지 == 결과값z // 4_1 결과값이 두자리라면 /10 -- 나머지 r
		 * 5.	z,r 와 마지막번호가 같아야함
		 */
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("'를' 포함한 주민등록번호를 입력하세요");
		String jn = sc.next();
		jn= jn.replaceAll("-", "");
		int korean = Integer.parseInt(jn.substring(12));
		int[] check = new int[jn.length()-1];
		
		for (int i = 0; i < jn.length()-1; i++) {
			int copy = 0;
			copy = Integer.parseInt(jn.substring(i, i+1));
			check[i] = copy;
			
			
		}
		
		System.out.println("배열넣기끝");
		
		for (int i = 0; i < check.length; i++) {
			
			sum+=check[i]*(i%8+2);
			
			
		}
		
		System.out.println("합끝 "+ sum);
		
		sum = 11-sum%11;
		
		if (sum == korean || sum%10 == korean) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}


	}

}
