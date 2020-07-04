import java.util.Scanner;

class Temparature{
	public static void main(String[] args){
		double temparature,farenheigt,celcius;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\n Enter Value for Deffrent Temp: \n\n");
		temparature = input.nextDouble();
		
		farenheigt = temparature * (9/5) +32;
		System.out.println("\n\nTemparature in F : \n\n"+farenheigt);
		
		celcius = (temparature - 32) * (5/9);
		System.out.println("Temparature in C : "+celcius);
	}
}