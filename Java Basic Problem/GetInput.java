
import java.util.Scanner;

class GetInput{
	public static void main(String[] args){
		
		int num;
		String s;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter Your Number: ");
		num = input.nextInt();
		System.out.print("Enter Your String: ");
		s = input.next();
		
		System.out.println("Integar Number is: "+num);
		System.out.println("String is : "+s);
	}
}