package gani.assignments;

import java.util.Scanner;

public class Numberinwords {

	public static void main(String[] args) {
		// print number in the form of words
		int n,a;
		System.out.print("enter a 4 digit number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (int i=0;i<4;i++) {
			a=n/1000;
			if(a==0) {
				System.out.print("Zero ");
			}else if(a==1) {
				System.out.print("One ");
			}else if(a==2) {
				System.out.print("Two ");
			}else if(a==3) {
				System.out.print("Three ");
			}else if(a==4) {
				System.out.print("Four ");
			}else if(a==5) {
				System.out.print("Five ");
			}else if(a==6) {
				System.out.print("Six ");
			}else if(a==7) {
				System.out.print("Seven ");
			}else if(a==8) {
				System.out.print("Eight ");
			}else if(a==9){
				System.out.print("Nine ");
			}
			n=(n%1000)*10;
				
		}

	}

}
