import java.util.Scanner;

class Area{
	public static void main(String[] args){
		System.out.println("Calculator for Calculate Area: \n\n");
		double base,height,triangle,redius,circle;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your value for Triangle: \n\n");
		System.out.print("Enter Base: ");
		base = input.nextDouble();
		System.out.print("Enter Height: ");
		height = input.nextDouble();
		
		triangle = (height * base ) / 2;
		System.out.println("Total Area of Triangle is: "+triangle);
		
		System.out.println("\n\nEnter Your value for Circle: \n\n");
		System.out.print("Enter Redius: ");
		redius = input.nextDouble();
		
		circle = ((redius * redius) * 3.1416);
		System.out.println("Total Area of Circle is: "+circle);
	}
}