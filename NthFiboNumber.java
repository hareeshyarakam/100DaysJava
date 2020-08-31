package prgs;

import java.util.Scanner;

public class NthFiboNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int a=0,b=1;
		
		int c=0;
		for(int i=1;i<=n-1;i++ ) {
			c=a+b;
			
			a=b;
			b=c;
		}
		System.out.println(c);

	}

}
