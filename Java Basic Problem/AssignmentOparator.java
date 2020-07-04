import java.util.Scanner;

class AssignmentOparator{
	public static void main(String[] args){
		int a, b,result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		a = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		b = input.nextInt();
		
		result = a + b;
		System.out.println("Summation is: "+result);
		
		result += b;
		System.out.println("Result for (+=):"+result);
	}
}