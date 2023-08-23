package collectionExam;

import java.util.*;

public class ArrayListExam {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		
		list.add("���缮");
		list.add("������");
		list.add("������");
		list.add("����ȿ");
		list.add("����");
		
		System.out.print(list.get(0)+" ");
		System.out.print(list.get(2)+" ");
		
		list.add(3, "�迵ö");
		System.out.println(list.get(3));
		
		for (String s : list) {
			System.out.print(s+" ");
		}
		System.out.println("");
		
		list.remove("������");
		list.remove(list.size()-1);
		System.out.println(list.size());
		
		list.set(0, "�̼���");
		System.out.println(list.indexOf("����ȿ")+1);
		if(list.contains("����ȿ"))
			System.out.println("ok");
		
		
		for (String s : list) {
			System.out.print(s+" ");
		}
		System.out.println("");
		
		list.clear();
		
		if(list.isEmpty())
			System.out.println("�����");
		
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
