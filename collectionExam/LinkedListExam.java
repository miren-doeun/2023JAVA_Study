package collectionExam;

import java.util.*;

public class LinkedListExam {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		
		list.add("���缮");
		list.add("������");
		list.add("������");
		list.add("����ȿ");
		list.add("����");
		
		System.out.print(list.get(0)+" ");
		System.out.println(list.get(2));
		
		System.out.print(list.getFirst()+ " ");
		System.out.println(list.getLast());
		
		list.add(3, "�迵ö");
		list.addFirst("������");
		list.addLast("����ö");
		
		for (String s : list) {
			System.out.print(s+" ");
		}
		System.out.println("");
		
		
		list.remove(list.size()-1);
		list.removeFirst();
		list.removeLast();
		
		for (String s : list) {
			System.out.print(s+" ");
		}
		System.out.println("");
		
		list.add(0,"�̼���");
		System.out.println(list.indexOf("����ȿ"));
		
		if(list.contains("����ȿ"))
			System.out.println("ok");
		list.clear();
		
		if(list.isEmpty())
			System.out.println(list.size());
		
		list.add("���缮");
		list.add("������");
		list.add("������");
		list.add("����ȿ");
		list.add("����");
		
		Collections.sort(list);
		for (String s : list) {
			System.out.print(s+" ");
		}
	}
}
