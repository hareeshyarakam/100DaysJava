package prgs;

import java.util.Scanner;

public class SumOfFibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int a=0,b=1;
		int sum=a+b;
		for(int i=1;i<=n-1;i++ ) {
			int c=a+b;
			sum+=c;
			a=b;
			b=c;
		}
		System.out.println(sum);
	}
}
