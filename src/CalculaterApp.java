import java.util.Scanner;

public class CalculaterApp {

	public static void main(String[] args) {
		Calculater calc = new Calculater();
		Scanner scanner = new Scanner(System.in);
		
		calc.showStart();
		
		System.out.println("\n1:足し算");
		System.out.println("\n2:引き算");
		System.out.println("\n3:かけ算");
		System.out.println("\n4:わり算");
		System.out.println("\n5:平方根を求める");
		System.out.println("\n6:階乗");
		int input = scanner.nextInt();
	
		
		
		if(input==1) {
			System.out.println("ひとつめの数字を入力してください");
			double argument1 = scanner.nextDouble();
			System.out.println("ふたつめの数字を入力してください");
			double argument2 = scanner.nextDouble();
			calc.add(argument1,argument2);
			
		}else if(input==2) {
			System.out.println("ひとつめの数字を入力してください");
			double argument1 = scanner.nextDouble();
			System.out.println("ふたつめの数字を入力してください");
			double argument2 = scanner.nextDouble();
			calc.sub(argument1,argument2);
			
		}else if(input==3) {
			System.out.println("ひとつめの数字を入力してください");
			double argument1 = scanner.nextDouble();
			System.out.println("ふたつめの数字を入力してください");
			double argument2 = scanner.nextDouble();
			calc.mul(argument1,argument2);
			
		}else if(input==4) {
			System.out.println("ひとつめの数字を入力してください");
			double argument1 = scanner.nextDouble();
			System.out.println("ふたつめの数字を入力してください");
			double argument2 = scanner.nextDouble();
			calc.div(argument1,argument2);
		}
		
		else if(input == 5) {
			
			System.out.println("数字をひとつ入力してください");
			double argument = scanner.nextDouble();
			calc.squareNumber(argument);
		
		}else if(input == 6){
			System.out.println("正の整数をひとつ入力してください");
			int number = scanner.nextInt();
			calc.factorial(number);
		
		}else {
			System.out.println("プログラムを終了します");
		}
		
		
		scanner.close();
		
	}	
		
}
	
	

