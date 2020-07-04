import java.util.Scanner;

class If{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Any Number: ");
		int num =  input.nextInt();
		
		if(num>0){
			System.out.print("Posative Number");
		}
	}
}