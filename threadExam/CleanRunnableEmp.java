package threadExam;

public class CleanRunnableEmp implements Runnable{
	Room room;
	
	public CleanRunnableEmp(Room room) {
		this.room=room;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			room.cleanRoom();
			//System.out.println("������(runnble) "+i+"�� �� û�Ҹ� �մϴ�.");
		}
	}

}
