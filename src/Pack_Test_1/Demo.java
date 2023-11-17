package Pack_Test_1;

import java.util.Scanner;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Hello. Welcome to the store");
		System.out.println("Please give me the inventory amount: ");
		int maxComputer = kb.nextInt();
		
		Computer [] inventory = new Computer [maxComputer];
		
		// print the menu inside the do-while
		
		int choice;
				
		do {
			System.out.println("What do you want to do? ");
			System.out.println("1.Enter new computers (password required)");
			System.out.println("2.Change information of a computer (password required");
			System.out.println("3.Display all computers by a specific brand");
			System.out.println("4.Display all computers under a certain a price.");
			System.out.println("5.Quit");
			System.out.println("Please enter your choice >");
			choice = kb.nextInt();
		} while (choice != 5);
		
		
		
		System.out.println("Please enter the password: ");
		String inputPassword = kb.next();
		String password = passwordChecker(inputPassword);

		
		


			
		
	}
	
	public static String passwordChecker(String inputPassword) {
		int tries = 3;
		int tryCount = 0;
		String pass = inputPassword;
		while (tryCount <= tries) {
			if (inputPassword != "password") {
				tryCount++;	
			}
			
		}		
		return pass;
	}
	

}



// show in go to the project, not the package, before src
// copy the path and cd to the path
// git status
// git init
// git add . (or git add --all)  add everything to the staging area
// git commit -m "message here"
// now we push to the repository
// connect the git to the github
// create a repository and connect with git remote ssh link
// git connect
