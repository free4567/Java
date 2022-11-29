package sub4;

import java.io.FileOutputStream;
import java.util.Properties;

/*
 * 날짜 : 2022/09/14
 * 이름 : 이상헌 
 * 내용 : 프로퍼티 실습하기 
 */
public class PropertiesTest {

	public static void main(String[] args) {
		
		// 프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		String path = "C:\\Users\\java1\\Desktop\\Fruit.properties";
				
		// 프로퍼티 파일 생성
		try {
			FileOutputStream fos= new FileOutputStream(path);
			prop.store(fos, null);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로퍼티 파일 생성완료...");
	}
}
