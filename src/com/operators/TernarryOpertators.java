package com.operators;

public class TernarryOpertators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int res = (a<b)? a: b;
		System.out.println(res);
		String result = (a>b)?"a is less": "b is less";
		System.out.println(result);
		
		int num = (a<b)? (a<c? a: b):(b<c? b:c);
		System.out.println(num);
	}
}
