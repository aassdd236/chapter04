package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> lotto=new HashSet<Integer>();
		
		while(lotto.size()<6) {
			Integer lo=(int)(Math.random()*45)+1;
			lotto.add(lo);
		}
		System.out.println(lotto.toString());
		
	}

}
