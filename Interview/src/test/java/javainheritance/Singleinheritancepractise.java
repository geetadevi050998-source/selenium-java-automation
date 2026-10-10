package javainheritance;

class A //Parent class

{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A //Child Class by using this extend key word we are calling class A
{
	int b=300;
	void show()
	{
		System.out.println(b);
	}
}

public class Singleinheritancepractise {
	
	public static void main(String[] args) {
		B obj=new B();  // Create obj and by using obj b we are calling class A
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}

		
		
		

	
	


