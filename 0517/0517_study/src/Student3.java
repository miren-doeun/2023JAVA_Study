
class Student3 {
	private String name;
	private int grade;
	public Student3() {};
	public Student3(String name) {
		this.name=name;
	}
	public Student3(String name, int grade) {
		this.name=name;
		this.grade=grade;
	}
	public void print() {
		System.out.println("학생의 이름은"+name+"이고,"+grade+"학년입니다.");
	}
}
