
public class CircleMain {
	public static void main(String[] args) {
		Circle c1= new Circle();
		c1.setRadius(5.0);
		System.out.println("반지름"+c1.getRadius()+" 원의 면적:"+c1.computerArea()+"원의 둘레:"+c1.computerPerimeter());
		Circle c2=new Circle(8.0);
		System.out.println("반지름"+c2.getRadius()+"원의 면적"+c2.computerArea()+"원의 둘레"+c2.computerPerimeter());
	}
}
