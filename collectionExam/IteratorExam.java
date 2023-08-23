package collectionExam;

import java.util.*;

public class IteratorExam {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("���缮");
		list.add("�ƹ���");
		list.add("������");
		list.add("�ƹ���");
		list.add("������");
		list.add("�ƹ���");
		list.add("����ȿ");
		list.add("�ƹ���");
		list.add("����");
		
		Iterator<String> it= list.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		
		
		it=list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		it=list.iterator();
		while(it.hasNext()) {
			if(it.next().contains("�ƹ���"))
				it.remove();
		}
		
		System.out.println();
		
		it=list.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}
