package polynomial;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Polynomial p1=new Polynomial();
		System.out.println("enter no. of terms for polynomial 1: ");
		int n=sc.nextInt();
		p1.create(n);
		System.out.println("Entered Polynomail is :");
		p1.display();
		Polynomial p2=new Polynomial();
		System.out.println("enter no. of terms for polynomial 2: ");
		int m=sc.nextInt();
		p2.create(m);
		System.out.println("Entered Polynomail is :");
		p2.display();
		Polynomial p3=new Polynomial();
		p3.add(p1, p2);
		System.out.println("Addition of two polynomials is : ");
		p3.display();
		Polynomial p4=new Polynomial();
		p4.subtract(p1, p2);
		System.out.println("Subtraction of two polynomials is : ");
		p4.display();
		Polynomial p5=new Polynomial();
		p5.multiply(p1, p2);
		System.out.println("Product of two polynomials is : ");
		p5.display();
	}

}
