package threadExam;

public class Room {
	private int number=1;
	synchronized public void cleanRoom() {
		System.out.println(number+ "���� û���ϰ� �ֽ��ϴ�.");
		number++;
	}
}
