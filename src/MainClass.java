
public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(2));
		
		MethodClass methodClass = new MethodClass();
		
		System.out.println("1~100의 합 : " + methodClass.total());
		
		System.out.println("1~100의 합 : " + MethodClass.total());
		
		System.out.println("hello world ");
	}
	
}
