
class Student5 {
	private String name;
	private int grade;
	
	public Student5() {}
	public Student5(String name) {
		this.name=name;}
	public Student5(String name,int grade) {
		this(name);
		this.grade=grade;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public int getGrade() {
		return this.grade;
	}
}
