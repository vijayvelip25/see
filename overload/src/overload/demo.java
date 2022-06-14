package overload;

public class demo {
	void sum (int a, int b)
	{
		int c= a+b;
		System.out.println("addition oftwo number :" +c);
	}
	void sum (int a, int b, int e)
	{
		int c = a+b+e;
		System.out.println("addition of three number :" +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     demo obj = new demo();
     obj.sum (30,90);
     obj.sum (45,80,22);
	}

}
