//5. Write a program to accept a number and check if it is divisible by 5 and 7.
import java.util.*;
public class day1_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		if(num%5==0 && num%7==0) {
			System.out.println(num+ " is divisible by 5 or 7");
		}

		else
		{
			System.out.println(num+ " is not divisible by 5 or 7");
		}



	}

}
