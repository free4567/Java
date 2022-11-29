package sub05;

/* 
 * 날짜 : 2022/09/23 
 * 이름 : 이상헌
 * 자바 총정리 연습문제
 */
public class Test09 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 0; i < 7 ; i++) {
			if (i <= 3)
				count++;
			else
				count--;
			
			for (int j = 1; j < 5 - count ; j++)
				System.out.println("☆");
			
			for (int k = 1; k <=2; k++)
				System.out.println("★");
			
			for (int j = 1; j < 5 - count ; j++)
				System.out.println("☆");
			
			System.out.println("\n");
		}
		
		System.out.println("\n");
	}

}
