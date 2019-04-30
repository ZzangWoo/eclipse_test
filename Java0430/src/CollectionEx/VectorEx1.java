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
		
		// 객체를 생성할 시점에서 타입을 외부에 결정
		GenericEx<String> g1 = new GenericEx();
		
		// 요소 타입을 외부에서 결정 (제네릭)
		Vector<String> v1 = new Vector<String>();
		// 객체를 생성 >> 저장
		
		// 1. 벡터요소에 추가
		v1.add(new String("JAVA"));
		v1.add(new String("SPRING"));
		v1.add(new String("javascript"));
		v1.add(new String("JSP"));
		v1.add(new String("Servlet"));
		
		// 벡터의 길이 (요소개수)
		System.out.println(v1.size());
	
	}
	
}
