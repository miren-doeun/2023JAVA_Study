package threadExam;

public class CleanRunnableEmp implements Runnable{
	Room room;
	
	public CleanRunnableEmp(Room room) {
		this.room=room;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			room.cleanRoom();
			//System.out.println("직원이(runnble) "+i+"번 방 청소를 합니다.");
		}
	}

}
