package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class MyListApp {

	public static void main(String[] args) {
		
		ArrayList pList=new ArrayList<Point>();
		Point p01=new Point(2, 2);
		Point p02=new Point(3, 3);
		Point p03=new Point(3, 3);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		pList.add(p01);
		System.out.println(pList.size());
		
		System.out.println(p01.getY());
		/*
		System.out.println(p01.getY());
		Point v01=pList.get(0);
		var01.getY();
		*/
		
		//System.out.println(pList.get(0).getY());
		System.out.println(pList.get(0).toString());
		
		System.out.println("=========================");
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		System.out.println("=========================");
		pList.remove(0);
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		
		
		List<Integer> iList=new ArrayList<Integer>();
		Integer i01=3;
		Integer i02=6;
		
		iList.add(i01);
		iList.add(i02);
		
		System.out.println(iList.toString());
		
		
	}

}
