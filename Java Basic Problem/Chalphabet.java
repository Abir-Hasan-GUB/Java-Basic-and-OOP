import java.util.Scanner;
class Cheak{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Any Alphabet: ");
		
		char ch = input.next().charAt(0);
		
		if(ch >= 'a' && ch <='z'){
			System.out.println("Small Letter");
		} else if(ch >= 'A' && ch <='Z'){
			System.out.println("Capital Letter");
		}
		else{
			System.out.println("Spaical Charecter");
		}
			
		}
	}
