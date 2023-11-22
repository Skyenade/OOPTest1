package Pack_Test_1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Hello. Welcome to the store");
		System.out.println("Please give me the inventory amount: ");
		int maxComputer = kb.nextInt();

		Computer[] inventory = new Computer[maxComputer];

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

			switch (choice) {
			case 1:
				System.out.println("Please input your password: ");
				String constantPassword = "password";
				int tryCount = 0;
				boolean passwordChecker = false;

				do {
					String enteredPassword = kb.next();
					if (enteredPassword.equals(constantPassword)) {
						passwordChecker = true;
						break;
					} else {
						tryCount++;
						System.out.println("Incorrect password. Try again. There are " + (3 - tryCount) + "remaining ");
					}
					if (tryCount == 4) {
						break;
					}
				} while (tryCount < 4);

				if (passwordChecker) {
					System.out.println("How many computers do you want to enter: ");
					int compCount = kb.nextInt();
					boolean hasEmptySpace = false;
					int filledCount = 0;
					int arrayPlace = -1;
					int len = inventory.length;
					for (int i = 0; i < len; i++) {
						if (inventory[i] == null) {
							hasEmptySpace = true;
							arrayPlace = i;
							break;
						} else {
							filledCount++;
						}
					}

					if (hasEmptySpace) {
						if (compCount <= len) {
							System.out.println("There are " + (len - filledCount) + " empty spaces in the inventory.");
							for (int i = arrayPlace; i < compCount; i++) {
								System.out.println("Please enter the information from the computer: ");
								System.out.println("what's the brand? ");
								String b = kb.next();
								System.out.println("what's the model? ");
								String m = kb.next();
								System.out.println("what's the price? ");
								double p = kb.nextDouble();
								inventory[arrayPlace + filledCount + i] = new Computer(b, m, p);
							}
							filledCount += compCount;
						} else {
							System.out.println("Not enough space in the inventory.");
						}
					}
				}

			case 2:
				System.out.println("Please input your password: ");
				constantPassword = "password";
				tryCount = 0;
				passwordChecker = false;

				do {
					String enteredPassword = kb.next();
					if (enteredPassword.equals(constantPassword)) {
						passwordChecker = true;
						break;
					} else {
						tryCount++;
						System.out.println("Incorrect password. Try again. There are " + (3 - tryCount) + "remaining ");
					}
					if (tryCount == 4) {
						break;
					}
				} while (tryCount < 4);

				
				System.out.println("Which computer would you like to update? ");
				boolean indexEmpty = false;
				
				while (!indexEmpty) {
					int compNum = kb.nextInt();
					int arrayPlace = compNum - 1;
					if (inventory[arrayPlace] != null) {
						
					}
					
				}
				
				
				
				
				
				
				System.out.println("Which computer would you like to update? ");
				
				
				
				System.out.println("What's the new brand? ");
				String newB = kb.next();
				inventory[arrayPlace].setBrand(newB);
				System.out.println("What's the new model? ");
				String newM = kb.next();
				inventory[arrayPlace].setModel(newM);
				
				
			}

		} while (choice != 5);

		kb.close();

//	public static String passwordChecker(String inputPassword) {
//		int tryCount = 0;
//		String checkedPass = inputPassword;
//		while (tryCount <= 3) {
//			if (inputPassword != "password") {
//				tryCount++;	
//			}
//			
//		}		
//		return checkedPass;
//	}
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
