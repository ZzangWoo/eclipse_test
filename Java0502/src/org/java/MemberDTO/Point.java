package org.java.MemberDTO;

public class Point {

	private int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x��ǥ : " + x + " | y��ǥ : " + y;
	}
	
}
