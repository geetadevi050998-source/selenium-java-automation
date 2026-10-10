package datadriventesting;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Runtimedatafromexcel {
	
	@Test
	
	public void inout()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		
			int age = sc.nextInt();	
			System.out.println("your age"+age);
	}
	
	

}
