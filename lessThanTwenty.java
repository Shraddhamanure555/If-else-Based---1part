import java.util.*;
public class lessThanTwenty {
public static void main(String args[]) {
	System.out.println("Check the no is valid or  invalid, valid no is less than 20");
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the number: ");
	int a = sc.nextInt();
	
	if (a < 20) {
		System.out.println("The number is valid ");
	}
	else {
		System.out.println("The number is Invalid ");
	}
 }
}
