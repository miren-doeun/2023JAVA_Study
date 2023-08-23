package collectionExam;

import java.util.*;

public class HashMapExam {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		
		map.put("���缮",10);
		map.put("�ڸ��",5);
		map.put("������",3);
		
		System.out.println(map.size());
		
		System.out.print(map.get("���缮")+" ");
		System.out.print(map.get("�ڸ��")+" ");
		System.out.println(map.get("������"));
		
		if(map.containsKey("������")) {
			int num=map.get("������");
			num++;
		}
		else
			map.put("������", 1);
		map.remove("���缮");
		
		for (String s : map.keySet()) {
			System.out.print(s+" ");
		}
		System.out.println("");
		for (Integer n : map.values()) {
			System.out.print(n+" ");
		}
		System.out.println("");
		for (String sn : map.keySet()) {
			System.out.println("key:" +sn+", value: "+map.get(sn)+" ");
		}
		
		map.clear();
		if(map.isEmpty())
			System.out.println(map.size());
	}
}
