package sub7;

public class PolyTest {
		public static void main(String[] args) {
			
				// 다형성을 적용한 객체 생성(업캐스팅)
				Animal a1 = new Tiger();
				Animal a2 = new Eagle();
				Animal a3 = new Shark();
				
				a1.move();
				a2.move();
				a3.move();
			
				a1.hunt();
				a2.hunt();
				a3.hunt();
			
				// 객체 타입 다운캐스팅
				Tiger tiger = (Tiger) a1;
				Eagle eagle = (Eagle) a2;
				Shark shark = (Shark) a3;
				
				tiger.move();
				eagle.move();
				shark.move();
				
				// 객체 타입 연산
				if(a1 instanceof Tiger) {
						System.out.println("a1은 Tiger입니다.");
				}
				
				if(a2 instanceof Eagle) {
					System.out.println("a2는 Eagle입니다.");
				}
				
				if(a3 instanceof Shark) {
					System.out.println("a3는 Shark입니다.");
				}
				
		}
	
	}

