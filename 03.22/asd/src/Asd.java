import java.util.*;


public class Asd {

	public static void main(String[] args) {
//		int[] a = new int [3];
//		a[0]=10; a[1]= 20; a[2]= 30;
//		System.out.println(a.length);
//		int[] a= new int [] {1,2,3,4,5,6,7,8,9,10};
//		for(int i =0; i<a.length; i++)
//			System.out.println("a[" + i +"] = " + a[i]);
		/*int score[]= {1,2,3,4,5};
		int sum = 0;
		double avg;
		
		Scanner sc  = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("���� �Է�:");
			score[i] = sc.nextInt();
			sum+=score[i];
		}
		System.out.println("�հ�:"+sum);
		avg=sum/5.0;
		System.out.println("���: 1"+avg);*/
		
		int a[][] = new int[2][3];
		a[0][0]=1; a[0][1]=2; a[0][2]=3;
		a[1][0]=10;a[1][1]=20; a[1][2]=30;
		for(int i =0; i<a.length;i++)
			for(int j =0; j<a[i].length;j++)
				System.out.println(a[i][j]+ "\t");
	}

}
