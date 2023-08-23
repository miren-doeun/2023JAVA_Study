package collectionExam;

import java.util.*;

public class HashSetExam {
	public static void main(String[] args) {
		HashSet<String> set= new HashSet<>();
		set.add("���缮");
		set.add("������");
		set.add("����ȿ");
		set.add("���缮");
		set.add("������");
		set.add("����");
		set.add("���缮");
		System.out.println(set.size());
		
		for (String s : set) {
			System.out.print(s+" ");
		}
		System.out.println("");
		
		if(set.contains("���缮"))
			System.out.println("ok");
		
		set.remove("���缮");
		
		for (String s : set) {
			System.out.print(s+" ");
		}
		System.out.println("");
		
		set.clear();
		
		if(set.isEmpty())
			System.out.println(set.size());
		
	}
}
