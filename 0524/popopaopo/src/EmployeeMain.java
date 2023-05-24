
public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setName("이도령");
		e1.setNo(100);
		e1.setAge(25);
		System.out.println("[직원 정보]"+e1.toString());
		Employee e2=new Employee ("성춘향",200,18);
		System.out.println("[직원 정보]"+e2.toString());
		
		e1.setNo(300);
		System.out.println(e1.getName()+"'s No changed to"+e1.getNo());
		System.out.println("[직원 정보]"+e1.toString());
		
		e2.setAge(20);
		System.out.println(e2.getName()+"'s No changed to"+e2.getNo());
		System.out.println("[직원 정보]"+e2.toString());
	}
}
