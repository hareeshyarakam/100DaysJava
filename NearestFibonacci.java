package prgs;

import java.util.Scanner;

public class NearestFibonacci {
	boolean isFibo(int n) {
		int a=0,b=1,c=0;
		while(c<n) {
			c=a+b;
			a=b;
			b=c;
		}
		if(c==n) return true;
		else return false;
	}
	int before(int n) {
		int c=0;
		while(true) {
			if(isFibo(n)) return c;
			else {
				n--;
				c++;
			}
		}
	}
	int after(int n) {
		int c=0;
		while(true) {
			if(isFibo(n)) return c;
			else {
				n++;
				c++;
			}
		}
	}
	void nearestFibo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int m1=before(n);
		int m2=after(n);
		if(m1>m2) System.out.println("Nearest Fibonacci is "+(n+m2));
		else if(m2>m1) System.out.println("Nearest Fibonacci is "+(n-m1));
		else {
			if(m1!=0 && m2!=0) System.out.println("Nearest Fibonacci numbers are "+(n-m1)+" "+(n+m2));
			else System.out.println("Nearest Fibonacci is "+n);
		}
		}
	public static void main(String[] args) {
		NearestFibonacci a=new NearestFibonacci();
		a.nearestFibo();

	}

}
