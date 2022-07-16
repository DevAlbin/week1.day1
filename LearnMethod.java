package week1.day2;

public class LearnMethod {
	public  int num=12;//variable
	 //access specifier return type method name{}
	public void addNumber() {//method
		int a=5;
		int b=5;
		int sum=a+b;
		System.err.println(sum);
		System.out.println(a);
	}
	private void subNumber() {
		System.out.println("sub");
	}
	public static void main(String[] args) {
		//Create object for the class
		//classname objectname =new classname();
		LearnMethod math = new LearnMethod();
		System.out.println(math.num);//print the variable
		math.addNumber();//print the method
		math.subNumber();
		
		
	}
}