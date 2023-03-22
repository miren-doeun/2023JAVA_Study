import java.util.*;


public class Asd {

	public static void main(String[] args) {
//		int[] a = new int [3];
//		a[0]=10; a[1]= 20; a[2]= 30;
//		System.out.println(a.length);
//		int[] a= new int [] {1,2,3,4,5,6,7,8,9,10};
//		for(int i =0; i<a.length; i++)
//			System.out.println("a[" + i +"] = " + a[i]);
		int score[]= {1,2,3};
		int sum = 0;
		double avg;
		
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("성적 입력:");
			int score1 = sc.nextInt();
			sum+=score1;
		}
		System.out.println("합계:"+sum);
		avg=sum/5;
		System.out.println("평균:"+avg);

	}

}
