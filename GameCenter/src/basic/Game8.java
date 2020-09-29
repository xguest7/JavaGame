package basic;

import java.util.Scanner;

public class Game8 implements InterGame {

	@Override
	public void title(Scanner scan) {
		System.out.println("Game8 15이상의 홀수입력시 마름모 생성");

	}

	@Override
	public void play(Scanner scan) {
		System.out.println("(15이상) 홀수입력:");
	
		int num = scan.nextInt();
		if (num>=15 && num%2==1) {
			for (int i=0;i<num;i++){
				  for (int j=0; j<num;j++)
				  {
				     if (i<=num/2)
				     {
				        if (i+j<=num/2-1)
				           System.out.print(" ");
				        else if (j-i>=num/2+1) 
				        	System.out.print(" ");
				        else
				           System.out.print("*");
				     }
				     else if (i>num/2) 
				     {
				        if (i-j>=num/2+1)
				        	System.out.print(" ");
				        else if (i+j>=num/2*3+1)
				        	System.out.print(" ");
				        else
				        	System.out.print("*"); 
				     }
				  }
				  System.out.println();
			}
		}else {
			System.out.println("15이상 홀수 입력");

	}
}
}
