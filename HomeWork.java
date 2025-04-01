/*
 *  Voting machine --done
 *  Even odd --done
 *  check the  no is valid or  invalid, valid no is less than 20 --done
 *  Number is +ve or -ve
 *  Vowels and Consonants 

 */


public class HomeWork {

	public static void main(String args[]) {
		int age = 18;
		
		if(age < 18) {
			System.out.println("Below 18 are not allowed for Voting");	
		}
		else if(age >=18) {
			System.out.println("Currnetly 18 is running and above 18 You are eligible for Voting");
		}
		else if(age < 150){
			System.out.println("You must be below 150 age then allow to Voting");		
		}
		else {
			System.out.println("Your are not fit any condition so not eligible ");
		}
	}
}
