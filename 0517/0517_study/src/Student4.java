
class Student4 {
	private String name;
	private int grade;
	public Student4() {};
	public Student4(String name) {
		this.name=name;
	}
	public Student4(String name, int grade) {
		this(name);
		this.grade=grade;
	}
	public void print() {
		System.out.println("학생의 이름은"+name+"이고,"+grade+"학년입니다.");
	}
}
