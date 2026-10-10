package javainheritance;

class D
{
	int d=500;
	void displayA()
	{
		System.out.println(d);
	}
}

class E extends D
{
	int e=1000;
	void displayB()
	{
		System.out.println(e);
	}
}

class F extends E
{
	int f=200;
	void displayC()
	{
		System.out.println(f);
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		
		F obj=new F();
		System.out.println(obj.d);
	System.out.println(obj.e);
	System.out.println(obj.f);
	}
}
