import java.util.Scanner;

class Vaiol{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Any Character: ");
		int ch = input.next().charAt(0);
		
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
			System.out.println("Vaiel");
		}
		else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			System.out.println("Vaiel");
		}
		else {
			System.out.println("Consonant");
		}
	}
}