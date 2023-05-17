
class Student2 {
	private String name;
	private int grade;
	public Student2() {};
	public Student2(String n) {
		name=n;
	}
	public Student2(String n, int g) {
		name=n;
		grade=g;
	}
	public void print() {
		System.out.println("학생의 이름은"+name+"이고,"+grade+"학년입니다.");
	}
}
