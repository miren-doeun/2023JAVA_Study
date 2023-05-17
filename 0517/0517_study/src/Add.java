
class Add {
	String sum(String s1, String s2) {
		return s1+s2;
	}
	int sum(int i1,int i2) {
		return i1+i2;
	}
	public static void main(String[] args) {
		Add a=new Add();
		System.out.println(a.sum("서울","로봇"));
		System.out.println(a.sum(10,20));
	}
}
