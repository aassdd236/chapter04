package com.javaex.ex07;

import java.util.HashSet;

public class PointApp {

	public static void main(String[] args) {
		
		HashSet<Point> pSet=new HashSet<Point>();
		
		Point p01=new Point(1, 2);
		Point p02=new Point(3, 6);
		Point p03=new Point(5, 10);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		System.out.println(pSet.toString());
		
		Point p04=new Point(3, 6); //중복으로 처리가 안 됨
		pSet.add(p04);
		System.out.println(pSet.toString()); 
	}

}
