import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int no;
				Scanner sc = new Scanner(System.in);
		//		for (int i = 1; i <= 5; i++) {
		//			System.out.println("Enter Number:");
		//			no = sc.nextInt();
		//			System.out.println("Enter Value:" + no);
		//			if (no == 77)
		//				break;
		//
		//		}

		System.out.println("Enter Number");
		no = sc.nextInt();// 17
		// 2 to 16
		boolean flag=false;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				//System.out.println("Not Prime");
				flag=false;
				break;
			} else {
				flag=true;
				//System.out.println("Prime");
			}
		}
		if(flag==false)
			System.out.println("not prime");
		else
			System.out.println("prime");


	}

}