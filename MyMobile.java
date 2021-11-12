package week1.day2;

public class MyMobile {

	long IMEnum=5254;
	String clolor="Red";
	char model='R';
	short cost=3423;
	
	public void call()
	{
		System.out.println("Making Call");
	}
	
	public void message() {
		// TODO Auto-generated method stub
System.out.println("I can usemy mobile to message others");
	}
	
	private void playgame() {
		// TODO Auto-generated method stub
System.out.println("I can use my mobile to play games ");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile samsung1=new MyMobile();
		samsung1.IMEnum=112344;
		samsung1.clolor= "Red";
		samsung1.cost=20000;
		samsung1.model='S';
		System.out.println("My Phone IMEnum is "  +samsung1.IMEnum);
		System.out.println("My Phone Color is "  +samsung1.clolor);
		System.out.println("My Phone Cost is "  +samsung1.cost);
		System.out.println("My Phone Model is "  +samsung1.model);
		
		samsung1.call();
		samsung1.message();
		samsung1.playgame();

		
	}

}
