package CollectionEx;

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
	
	}
	
}
