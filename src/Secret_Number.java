import java.util.Scanner;
import java.util.Random;
public class Secret_Number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = (int)(Math.random()* 100 + 1);
		
		System.out.println("What is the number? Is it " +i + "?");
		System.out.println();
		if (i == 62) {
			System.out.println("Congratulations!");
		}
		else if (i < 62) {
			System.out.println("Guess Higher.");
		}
		else if (i > 62) {
			System.out.println("Guess Lower.");
		}
scanner.close();}

}
