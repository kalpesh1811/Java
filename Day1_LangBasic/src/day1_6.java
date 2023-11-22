//6. Write a program, which accepts annual basic salary of an employee and calculates and displays the 
//Income tax as per the following rules. 
//Basic: < 1, 50,000 Tax = 0
// 1, 50,000 to 3,00,000 Tax = 20% 
// > 3,00,000 Tax = 30%

import java.util.*;
public class day1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the salary: ");
		int sal = sc.nextInt();
		System.out.println("Salary is: " +sal);

		if (sal < 150000)
			System.out.println("No tax, salary is less than 150000");

		else if (sal >= 150000 && sal <= 300000)
			System.out.println("Applicable tax is: " +(0.2*sal));
		
		else
			System.out.println("Applicable tax is: " +(0.3*sal));
		


	}

}
