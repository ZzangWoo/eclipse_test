package org.java.CollectionEx;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		
		// ���������� 5�� ����
		ArrayList<Integer> a1 = new ArrayList();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println(a1.size());
		
		// a1.clear(); => ��� ��� ����
		
		a1.add(2, 100); // Ư�� ��ҿ� �߰�
	}
	
}
