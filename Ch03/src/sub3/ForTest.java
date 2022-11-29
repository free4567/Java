package sub3;

/*
* 날짜 : 2022/08/17
* 이름 : 이상헌
* 내용 : Java 반복문 for 실습하기
*/

public class ForTest {

	public static void main(String[] args) {
		
		// for
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("i : "+i);
		}
 
		// 1부터 10까지 합
		int sum =0;
		for(int k =1; k<10; k++) {
			
			if(k%2 == 0) {
				sum += k;
			}
		}
		
		System.out.println("1부터 10까지 합 : "+sum);
		
		// 별삼각형
		for(int start = 10; start >= 1; start--) {
			
			for(int end = 1; end <= start; end++) {
				
				System.out.print("☆");
			}
			System.out.print("\n");
			
		}
		
	}
}		
		
			
			
			
			
			
			
			
			
			
			