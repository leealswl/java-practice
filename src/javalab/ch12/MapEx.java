package javalab.ch12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//map 인터페이스
//키 밸류 쌍으로 관리
// 키는 중복허용 안함, 밸류는 중복허용
public class MapEx {

	public static void main(String[] args) {
		System.out.println("===== HashMap ======");
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("A","APPLE");
		hashMap.put("C","BANANA");
		hashMap.put("B","WATERMELON");
		hashMap.put("F","PEAR");
		hashMap.put("B","CITRUS"); //키가 중복될 경우 해당 키의 값을 수정한다.
		
		for (String key:hashMap.keySet()) {
			String value =hashMap.get(key);
			System.out.println(value);
		}
		
		hashMap.forEach((k,v)-> System.out.println(k + ":"+v));
		
		System.out.println(hashMap.size());
		System.out.println(hashMap.get("A"));
		System.out.println(hashMap.get("G")); //없는 키값을 사용하면 NULL을 반환
		System.out.println(hashMap.containsKey("G"));
		System.out.println(hashMap.containsKey("CITRUS"));
		
		hashMap.remove("B");
		hashMap.clear();
		
		//linkedHashmap
		//입력된순서가 유지됨
		
		System.out.println("===== LinkedHashMap ======");
		Map<String, String> linkedMap = new LinkedHashMap<>();
		hashMap.put("A","APPLE");
		linkedMap.put("C","BANANA");
		linkedMap.put("B","WATERMELON");
		linkedMap.put("F","PEAR");
		linkedMap.put("B","CITRUS"); //키가 중복될 경우 해당 키의 값을 수정한다.
		
		linkedMap.forEach((k,v)-> System.out.println(k + ":"+v));

	}

}
