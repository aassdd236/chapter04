package com.javaex.ex03;

public class Circle {
	
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public Circle() {
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
	

}
