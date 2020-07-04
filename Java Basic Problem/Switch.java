import java.util.Scanner;
class SwitchSpalling{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in){
			int degit = input.nextInt();
			switch(degit){
				case 1:
					System.out.println("ONE");
				
				case 2:
					System.out.println("TWO");
				
				case 3:
					System.out.println("THREE");
				
				default:
					System.out.println("Not a Degit");
				
			}
		}
	}
}