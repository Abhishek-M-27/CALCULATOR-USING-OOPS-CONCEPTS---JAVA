package sdbms;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		calcinterface c=new calcmethod();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("choose one operator");
			System.out.println("add  +\nsub  -\nmul  *\ndiv  /\nsqr  ^\nexit #");
			System.out.println("-----------------------------");
			System.out.println("-enter-the-operator-");
			char x =sc.next().charAt(0);
			System.out.println("******************************");
			switch(x) {
			case '+':
				try {
					c.add();
					System.out.println("--------------------------");
					System.out.println("want to continue  press y ....exit press any key");
					char ab=sc.next().charAt(0);
					if(ab=='y'||ab=='Y') {
						System.out.println("--------------------------");
						break;

					}
					else {
						System.out.println("-------thank-you---------");
						System.exit(0);
					}
				}
				catch(Exception e) {
					System.out.println("invalid value");
				}

			case '-':
				c.substract();
				System.out.println("----------------------------");
				System.out.println("want to continue  press y ....exit press any key");
				char bc=sc.next().charAt(0);
				if(bc=='y'||bc=='Y') {
					System.out.println("---------------------------");
					break;

				}
				else {
					System.out.println("-------thank-you---------");
					System.exit(0);
				}

				break;

			case '*':

				c.multiply();
				System.out.println("-----------------------------");
				System.out.println("want to continue  press y ....exit press any key");
				char cd=sc.next().charAt(0);
				if(cd=='y'|| cd=='Y') {
					System.out.println("-----------------------------");
					break;

				}
				else {
					System.out.println("-------thank-you---------");
					System.exit(0);
				}
				break;
			case '/':

				c.divide();
				System.out.println("--------------------------");
				System.out.println("want to continue  press y ....exit press any key");
				char ef=sc.next().charAt(0);
				if(ef=='y'||ef=='Y') {
					System.out.println("------------------------");
					break;

				}
				else {
					System.out.println("-------thank-you---------");
					System.exit(0);
				}
				break;
			case '^':
				c.square();
				System.out.println("------------------------------");
				System.out.println("want to continue  press y ....exit press any key");
				char bb=sc.next().charAt(0);
				if(bb=='y'||bb=='Y') {
					System.out.println("---------------------------");
					break;

				}
				else {
					System.out.println("-------thank-you---------");
					System.exit(0);
				}
				break;
			case '#':
				System.out.println("-------thank-you---------");
				System.exit(0);
			default:
				System.out.println("------enter--valid--operation-------");

			}
		}
	}

}
