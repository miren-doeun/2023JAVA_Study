package threadExam;

public class CleanThreadEmp extends Thread{
	Room room;
	
	public CleanThreadEmp(Room room) {
		this.room=room;
	}
	
	public void run() {
		
		for(int i=1;i<=5;i++) {
			room.cleanRoom();
			
			//System.out.println("������(thread) "+i+"�� �� û�Ҹ� �մϴ�.");
		}
	}
}
