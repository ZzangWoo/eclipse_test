package org.java.CollectionEx;

import java.util.Iterator;
import java.util.Vector;

import org.java.MemberDTO.Point;

public class PointMain {

	public static void main(String[] args) {
		
		Vector<Point> p1 = new Vector();
		
		p1.add(new Point(100, 200));
		p1.add(new Point(200, 300));
		p1.add(new Point(300, 400));
		p1.add(new Point(400, 500));
		p1.add(new Point(500, 600));
		
		// foreach로 출력
		for (Point i : p1) {
			System.out.println(i.toString());
			System.out.println("-----------------------");
		}
		
		System.out.println("///////////////////////////////");
		
		// Iterator로 출력
		Iterator<Point> iterator1 = p1.iterator();
		while (iterator1.hasNext()) {
			Point j = iterator1.next();
			System.out.println(j.toString());
			System.out.println("-----------------------");
		}
		
	}
	
}
