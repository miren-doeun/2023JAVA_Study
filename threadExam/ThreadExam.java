package threadExam;

public class ThreadExam {

	public static void main(String[] args) {
		Room room=new Room();
		CleanThreadEmp thread1= new CleanThreadEmp(room);
		CleanRunnableEmp cr=new CleanRunnableEmp(room);
		Thread thread2= new Thread(cr);
		thread1.start();
		thread2.start();
		
		
	}

	private static void cleanByBoss() {
		for(int i=1;i<=10;i+=2) {
			System.out.println("������ "+i+"�� �� û�Ҹ� �մϴ�.");
		}
	}

}
