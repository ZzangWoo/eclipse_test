package CollectionEx;

import java.util.Iterator;
import java.util.Vector;

class GenericEx<T> {
	T a, b;
	
	public T method (T a) {
		return a;
	}
}

public class VectorEx1 {

	public static void main(String[] args) {
		
		System.out.println("Vector");
		
		// ��ü�� ������ �������� Ÿ���� �ܺο� ����
		GenericEx<String> g1 = new GenericEx();
		
		// ��� Ÿ���� �ܺο��� ���� (���׸�)
		Vector<String> v1 = new Vector<String>();
		// ��ü�� ���� >> ����
		
		// 1. ���Ϳ�ҿ� �߰�
		v1.add(new String("JAVA"));
		v1.add(new String("SPRING"));
		v1.add(new String("javascript"));
		v1.add(new String("JSP"));
		v1.add(new String("Servlet"));
		
		// ������ ���� (��Ұ���)
		System.out.println(v1.size());
		
		// 2. Ư�� �ε����� �߰�
		v1.add(2, new String("MVC"));
		
		System.out.println(v1.size());
		
		// 3. ���͸� �ٸ� ���Ϳ� �߰�
		Vector<String> v2 = new Vector<String>();
		v2.add(new String("v2Vector1"));
		v2.add(new String("v2Vector2"));
		v2.add(new String("v2Vector3"));
		
		System.out.println(v2.size());
		
		v1.addAll(v2);
		System.out.println(v1.size());
		
		// 4. ���� ����
		//v1.clear();
		System.out.println(v1.size());
	
		// 5. ��ü�� ��ҿ� ���ԵǾ� �ִ���?
		System.out.println(v1.contains("v2Vector1"));
		
		// 6. ��ü ��Ҹ� get
		String s1 = v1.get(1);
		System.out.println(v1.get(0));
		System.out.println(s1);
		
		// size(), get, for���� �̿�
		// ���� v1�� ��� ��Ҹ� �ֿܼ� ǥ��
		System.out.println("------------------------");
		
		// �⺻ for��
		for (int i = 0; i < v1.size(); i++)
			System.out.println(v1.get(i));
		
		System.out.println("------------------------");
		
		// foreach��
		for (String str : v1)
			System.out.println(str);
		
		System.out.println("------------------------");
		

		// Iterator (��ü)
		Iterator<String> iterator = v1.iterator();
				
		while (iterator.hasNext()) {
			// ��Ҹ� 0�������� ������� ó��
			String str = iterator.next();
			System.out.println(str);
		}
		
		System.out.println("------------------------");
		
		// 7.isEmpty => "�������?"
		System.out.println(v1.isEmpty());
		
		System.out.println("------------------------");
		
		Iterator<String> iterator2 = v1.iterator();
		while (iterator2.hasNext()) {
			String s2 = iterator2.next();
			System.out.println(s2);
		}
		
		System.out.println("------------------------");
		
		// 8.remove => "��� ����"
		v1.remove(0);
		
		Iterator<String> iterator3 = v1.iterator();
		while (iterator3.hasNext()) {
			String s3 = iterator3.next();
			System.out.println(s3);
		}
		
	}
	
}
