import java.util.Scanner;

public class NextPrimeNumber {
	public static void main(String args[]) {
		int choice;
		int count = 2;
		Scanner in = new Scanner(System.in);
		System.out.println("First prime number is: 2");
		System.out.println("Enter \"1\" for next prime number or any other character to close");
		while(true) {
			choice = in.nextInt();
			if(choice == 1) {
				count = nextPrimeNumberGenerator(++count);
				System.out.println("next prime number is : " + count);
			}
			// java.lang.System.exit() terminates the program
			else 	System.exit(1);
		}
	}
	public static int nextPrimeNumberGenerator(int count) {
		int flag=0;
		for(int i=2;i<count/2;i++) {
			if((count%i) == 0) {
				flag = 1;
				break;
			}
			else continue;
		}
		if(flag==0)	return count;
		else	return nextPrimeNumberGenerator(++count);
	}
}
