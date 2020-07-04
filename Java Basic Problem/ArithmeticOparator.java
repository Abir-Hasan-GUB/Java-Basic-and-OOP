
import java.util.Scanner;

class ArithmeticOparator{
	public static void main(String[] args){
		int num1,num2,result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your 1st Number: ");
		num1 = input.nextInt();
		System.out.print("Enter Your 2nd Number: ");
		num2 = input.nextInt();
		
		result = num1 + num2;
		System.out.println("Summetion is: "+result);
		
		result = num1 - num2;
		System.out.println("Diffrence is : "+result);
		
		result = num1 / num2;
		System.out.println("Divided is :"+result);
		
		result = num1 * num2;
		System.out.println("Multiplie is :"+result);
		
		result =  num1 % num2;
		System.out.println("Modulas is :"+result);
		
		double result2  =  num1 / (double)num2;
		System.out.println("Divided is :"+result2);
		
		
		
	}
}