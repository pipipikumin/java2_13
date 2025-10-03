
public class Calculater {
	void squareNumber(double decimal) {
		double answer = decimal * decimal;
		System.out.println(answer);
	}
	
	
	void factorial(int num) {
		int answer = 1;
		
		for(int i=num; i>=1;i--) {
			answer = answer * i;
		}
		
		System.out.println(answer);
		
	}
	
	void showStart() {
		System.out.println("**************");
		System.out.println("電卓アプリ");
		System.out.println("**************");
		
		System.out.println("実行する計算を選んでください");
	}
}
