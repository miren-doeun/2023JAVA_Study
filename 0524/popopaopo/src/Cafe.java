
public class Cafe {
	private int coffee;
	private int sugar;
	private int cream;
	
	public void makeTea(int coffee,int sugar, int cream) {
		this.coffee=coffee;
		this.sugar=sugar;
		this.cream=cream;
		System.out.println("밀크커피 나가요!");
		System.out.println("커피농도:"+(coffee+sugar+cream));
	}
	public void makeTea(int coffee,int sugar) {
		this.coffee=coffee;
		this.sugar=sugar;
		
		System.out.println("설탕커피 나가요!");
		System.out.println("커피농도:"+(coffee+sugar));
	}
	public void makeTea(int coffee) {
		this.coffee=coffee;
		System.out.println("블랙커피 나가요!");
		System.out.println("커피농도:"+(coffee));
	}
}
