package sub04;

import java.security.interfaces.EdECPublicKey;
import java.util.Scanner;

import javax.naming.directory.SearchControls;
import javax.sql.rowset.serial.SerialArray;

/*
 * 날짜 : 2022/09/16
 * 이름 : 이상헌
 * 내용 : 예외처리 연습문제
 */
class NotFoundException extends Exception {
	public NotFoundException() {
		super("해당하는 숫자를 찾을 수 없습니다.");	
	}
}

public class Test02 {
	
	public static void main(String[] args) {
	
		int[] arr = {2, 4, 6, 8, 10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("찾을 숫자 입력 : ");
		int find =  sc.nextInt();
		
		try { 
			searchArray(find, arr);
			System.out.println("해당하는 숫자 찾음!!!");		
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			sc.close();
		}
		
		System.out.println("프로그램 정상 종료...");
	}
	
	public static void searchArray(int find, int[] arr) throws NotFoundException {
		
		for(int i : arr) {
			if(i == find) {
				return;
			}
			new NotFoundException
		}
