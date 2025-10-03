import java.util.Scanner;

public class CalculaterApp {

	public static void main(String[] args) {
		Calculater calc = new Calculater();
		Scanner scanner = new Scanner(System.in);
		
		calc.showStart();
		
		System.out.println("\n平方根（a）：階乗（b）:終了（c）");
		String moji = scanner.nextLine();
	
		
		
		if(moji.equals("a")) {
			
		System.out.println("数字をひとつ入力してください");
		double argument = scanner.nextDouble();
		calc.squareNumber(argument);
		
		}else if(moji.equals("b")){
		System.out.println("正の整数をひとつ入力してください");
		
		
		int number = scanner.nextInt();
		calc.factorial(number);
		
		}else {
			System.out.println("プログラムを終了します");
			return;
		}
		
		scanner.close();
		
		
		
	}
	
	

}
