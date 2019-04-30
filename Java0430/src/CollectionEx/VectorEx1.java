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
		
		// 2. 특정 인덱스에 추가
		v1.add(2, new String("MVC"));
		
		System.out.println(v1.size());
		
		// 3. 벡터를 다른 벡터에 추가
		Vector<String> v2 = new Vector<String>();
		v2.add(new String("v2Vector1"));
		v2.add(new String("v2Vector2"));
		v2.add(new String("v2Vector3"));
		
		System.out.println(v2.size());
		
		v1.addAll(v2);
		System.out.println(v1.size());
		
		// 4. 벡터 삭제
		//v1.clear();
		System.out.println(v1.size());
	
		// 5. 객체의 요소에 포함되어 있느냐?
		System.out.println(v1.contains("v2Vector1"));
		
		// 6. 객체 요소를 get
		String s1 = v1.get(1);
		System.out.println(v1.get(0));
		System.out.println(s1);
		
		// size(), get, for문을 이용
		// 벡터 v1의 모든 요소를 콘솔에 표시
		System.out.println("------------------------");
		
		// 기본 for문
		for (int i = 0; i < v1.size(); i++)
			System.out.println(v1.get(i));
		
		System.out.println("------------------------");
		
		// foreach문
		for (String str : v1)
			System.out.println(str);
		
		System.out.println("------------------------");
		

		// Iterator (객체)
		Iterator<String> iterator = v1.iterator();
				
		while (iterator.hasNext()) {
			// 요소를 0번지부터 순서대로 처리
			String str = iterator.next();
			System.out.println(str);
		}
		
		System.out.println("------------------------");
		
		// 7.isEmpty => "비었느냐?"
		System.out.println(v1.isEmpty());
		
		System.out.println("------------------------");
		
		Iterator<String> iterator2 = v1.iterator();
		while (iterator2.hasNext()) {
			String s2 = iterator2.next();
			System.out.println(s2);
		}
		
		System.out.println("------------------------");
		
		// 8.remove => "요소 삭제"
		v1.remove(0);
		
		Iterator<String> iterator3 = v1.iterator();
		while (iterator3.hasNext()) {
			String s3 = iterator3.next();
			System.out.println(s3);
		}
		
	}
	
}
