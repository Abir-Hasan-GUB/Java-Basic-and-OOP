import java.util.Scanner;

class IfElse{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Any Number: ");
		int num = input.nextInt();
		
		if(num > 0){
			System.out.println("Possative Number");
		}
		else {
			System.out.println("Negative Number");
		}
	}
}