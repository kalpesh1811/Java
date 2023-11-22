//4. Write a program to accept an integer and check if it is even or odd.
import java.util.*;
public class day1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();

		if(num%2==0)
		{
			System.out.println(num+ " is even number");
		}
		else
		{
			System.out.println(num+ " is odd number");
		}

	}

}
