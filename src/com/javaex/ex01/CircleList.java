package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {

	private Circle[] cArray;
	private int crtPos;
	
	public CircleList(Circle[] cArray, int crtPos) {
		super();
		this.cArray = cArray;
		this.crtPos = crtPos;
	}
	public CircleList() {
		cArray=new Circle[3];
		crtPos=0;
	}
	
	public void add(Circle c) {
		//현재배열개수+1 배열을 새로만든다
		//이전 배열의 값을 새배열에 옮긴다
		//마지막 방에 새 주소를 추가한다
		cArray[crtPos]= c;
		crtPos+=1;
	}
	public int size() {
		return crtPos;
	}
	
	public Circle get(int index) {
		return cArray[index]; //index 방 안에 있는 circle 주소
	}
	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
}
