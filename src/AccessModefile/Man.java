package AccessModefile;

//자식클래스
public class Man  extends People{
		//오버라이딩
		void printInfo() {
			//부모클래스에 있는 printInfo메소드 호출(super의 기능)
			super.printInfo();
			System.out.println("그리고 남자입니다.");
		}
		void enlist() {
			System.out.println("군대감.");
		}
}
