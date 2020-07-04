import java.util.Scanner;
class ElseIfLadder{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Any Number: ");
		int num = input.nextInt();
		
		if(num > 0){
			System.out.println("Possative Number");
		}
		else if(num < 0){
			System.out.println("Negative Number");
		}
		else{
			System.out.println("Number is Zero");
		}
	}
}