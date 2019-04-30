package CollectionEx;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		
		System.out.println("Vector");
		
		Vector<Integer> v1 = new Vector<Integer>();
		
		v1.add(new Integer(10)); // �ڽ� : Integer a = new Integer(10);
		v1.add(20); // �ڵ� �ڽ� : Integer a = 10;
		v1.add(new Integer(30));
		v1.add(new Integer(40));
		v1.add(new Integer(50));
		
		System.out.println("--------------");
		
		for (int i : v1)
			System.out.print(i + " ");
		
		System.out.println("\n--------------");
		
		// Iterator ���
		Iterator<Integer> iterator1 = v1.iterator();
		while (iterator1.hasNext()) {
			int i = iterator1.next();
			System.out.print(i + " ");
		}
		
		System.out.println("\n--------------");
		
		/************************* |��   ��| **************************/
		// scanner�� �̿��ؼ� 1~5���� ������ �Է��ؼ�
		// Vector�� ������ �ϰ� �ֿܼ� ����ϴ� ���α׷�
		// Scanner, Vector, Iterator
		
		Scanner scan = new Scanner(System.in);
		Vector<Integer> v2 = new Vector<Integer>();
		int i = 0;
		
		while (i < 5) {
			System.out.print("�����Է�(" + (i+1) + ") : ");
			v2.add(scan.nextInt());
			i++;
		}
		
		System.out.println("--------------------------");
		
		Iterator<Integer> iterator2 = v2.iterator();
		while (iterator2.hasNext()) {
			int j = iterator2.next();
			System.out.print(j + " ");
		}
		
		/***********************************************************/
		
	}
	
}
