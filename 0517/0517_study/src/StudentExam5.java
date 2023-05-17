
public class StudentExam5 {
	public static void main(String args[]) {
		Student5 kim = new Student5("김현우");
		kim.setGrade(2);
		Student5 jang = new Student5("장민재"+"3");
		System.out.println("학생의 이름은 "+kim.getName()+"이고,"+kim.getGrade()+"학년입니다.");
		System.out.println("학생의 이름은 "+jang.getName()+"이고,"+jang.getGrade()+"학년입니다.");
	}
}
