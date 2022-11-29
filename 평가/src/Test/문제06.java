package Test;

import java.util.Scanner;

public class 문제06 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
				
			for (int i = 1; i <=a; i++) {
					
				for(int j = a-1; j>=i; j--) {
					System.out.print(" ");
				}
						
			    for(int j=1; j <=i; j++) {
			        System.out.print("*");
			    }
			    
			        System.out.println(" ");	
			}
		}       
	}
}	