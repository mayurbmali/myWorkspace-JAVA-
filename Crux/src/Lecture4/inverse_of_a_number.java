package Lecture4;

import java.util.Scanner;

public class inverse_of_a_number {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int num = scn.nextInt();
		int n=5,i,rem;
		double k=0.0,result=0.0;
		for(i=5;i>=1;i--){
			rem=num%10;
			if(rem==1){
				k=i*(Math.pow(10,4));
			}
			else if(rem==2){
				k=i*(Math.pow(10,3));
			}
			else if(rem==3){
				k=i*(Math.pow(10,2));
			}
			else if(rem==4){
				k=i*(Math.pow(10,1));
			}
			else
				k=i*(Math.pow(10,0));
			num=num/10;
			result=result+k;
		}
		
		System.out.print("inverse of the given number is\n"+(int)result);
		
		

	}

}
