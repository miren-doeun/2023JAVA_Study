import java.util.*;
public class Kim {
	public static void main(String[] args) {
		/*int[] num= new int[5];
		int i = 0,a=0;
		Scanner sc = new Scanner(System.in);
		while( i < 5) {
			System.out.print(i+1+"정수를 입력하세요 : ");
			num[i] = sc.nextInt();
			if(num[i]>a) {
				a=num[i];
			i++;
			}

		
		}
		System.out.printf("입력한 값들 중 최대값은"+a+"입니다.");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		for(int i=1;i<=4;i++) {
			for(int j=1; j<=3;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		for(int i=1;i<=3;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<=3;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(i);
			}
			System.out.println("");
		}
		for(int i=1;i<=3;i++) {
			for(int j=2;j>=i-1;j--) {
				System.out.print(i);
			}
			System.out.println("");
		}*/
		Scanner sc = new Scanner(System.in);
		int month=0,day=0;
		System.out.print("달 입력:");
		month=sc.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: 
			System.out.println(month+"월은 31일입니다.");break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"월은 30일입니다.");break;
		case 2:
			System.out.println(month+"월은 28일입니다.");break;
		
		}
		
	}
}

