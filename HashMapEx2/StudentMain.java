package HashMapEx2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<Student, Integer>map = new HashMap<>();
		// Student타입의 키와 integer타입의 벨류값
		
		//										sno  name	
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		System.out.println("총 Entry 수 : " + map.size());
		
	}

}
