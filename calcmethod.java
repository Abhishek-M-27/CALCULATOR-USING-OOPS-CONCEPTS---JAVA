package sdbms;

import java.util.Scanner;

public class calcmethod implements calcinterface {
	Scanner sc= new Scanner(System.in);

	@Override
	public void add() {
		System.out.println("1st value");
		int a=sc.nextInt();
		System.out.println("2nd value");
		int b=sc.nextInt();
		System.out.println(a+"+"+b+"="+(a+b));

	}

	@Override
	public void substract() {
		System.out.println("1st value");
		int a=sc.nextInt();
		System.out.println("2nd value");
		int b=sc.nextInt();
		System.out.println(a+"-"+b+"="+(a-b));


	}

	@Override
	public void multiply() {
		System.out.println("1st value");
		int a=sc.nextInt();
		System.out.println("2nd value");
		int b=sc.nextInt();
		System.out.println(a+"*"+b+"="+(a*b));


	}

	@Override
	public void divide() {
		System.out.println("divident value");
		int a=sc.nextInt();
		System.out.println("divider value");
		int b=sc.nextInt();
		if(b==0) {
			System.out.println("0 cant be divided");
		}
		else {
			System.out.println(a+"/"+b+"="+(a/b));
		}

	}

	@Override
	public void square() {
		System.out.println(" value");
		int c=1;
		int a=sc.nextInt();
		System.out.println("power value");
		int b=sc.nextInt();
		for(int i=0;i<b;i++) {
			c=c*a;
		}
		System.out.println(a+"^"+b+"="+c);


	}



}
