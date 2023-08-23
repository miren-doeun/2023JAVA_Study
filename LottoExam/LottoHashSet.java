package LottoExam;

import java.util.HashSet;

public class LottoHashSet {
	public void getRandomBall() {
		HashSet<Integer> set= new HashSet<>();
		int randomNum=0;
		while(set.size()<6) {
			randomNum = (int)(Math.random()*45)+1;
			
			set.add(randomNum);
		}
		
		for (Integer i : set) {
			System.out.print("ArrayList: "+i+" ");
		}
		System.out.println("");
		
		
	}
}
