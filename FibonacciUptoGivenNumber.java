package prgs;

import java.util.Scanner;

public class FibonacciUptoGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int t1=0,t2=1,sum=0;
		System.out.print(t1+" ");
		System.out.print(t2+" ");
		for(int i=1;i<=n-2;i++) {
			sum=t1+t2;
			if(sum<=n) {
			System.out.print(sum+" ");
			t1=t2;
			t2=sum;
			}
		}

	}

}
