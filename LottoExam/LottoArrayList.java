package LottoExam;

import java.util.*;

public class LottoArrayList {
	public void getRandomBall() {
		ArrayList<Integer> list = new ArrayList<>();
		int randomNum=0;
		while(list.size()<6) {
			randomNum = (int)(Math.random()*45)+1;
			if(list.contains(randomNum)) {
				continue;
			}
			list.add(randomNum);
		}
		
		for (Integer i : list) {
			System.out.print("ArrayList: "+i+" ");
		}
		System.out.println("");
	}
}
