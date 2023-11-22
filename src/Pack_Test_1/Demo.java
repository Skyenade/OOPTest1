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
					int compAmount = kb.nextInt();
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
					
					int inputCount = 0;
					
					for(int i = 1; i<=compAmount; i++) {
						if (hasEmptySpace) {
							if (compAmount <= len) {
								System.out.println("There are " + (len - filledCount) + " empty spaces in the inventory.");
								while(inputCount != compAmount) {
									System.out.println("Please enter the information from the computer: ");
									System.out.println("what's the brand? ");
									String b = kb.next();
									System.out.println("what's the model? ");
									String m = kb.next();
									System.out.println("what's the price? ");
									double p = kb.nextDouble();
									inventory[arrayPlace + filledCount] = new Computer(b, m, p);
									filledCount ++;
									inputCount++;									
								}								
							} else {
								System.out.println("Not enough space in the inventory.");
								break;
							}
						}
					}

					
				}
				break;

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

				
				String update = "new";
				
				System.out.println("Which computer would you like to update? ");
					int compNum = kb.nextInt();
					int arrayPlace = compNum - 1;
					if (inventory[arrayPlace] == null) {
						System.out.println("There is no Computer at the specified index location. ");
						System.out.println("Would you like to enter a another computer or quit this operation?");
						System.out.println("To enter a new computer, type 'new', to quit the operation, type 'quit': ");
						update = kb.next();
						if (update == "quit") {
							break;
						}
					} else {
						int change = 0;
						
						do {
							System.out.println(inventory[arrayPlace]);
							System.out.println("What information would you like to change? ");
							System.out.println("1.brand ");
							System.out.println("2.model ");
							System.out.println("3.SN ");
							System.out.println("4.price ");
							System.out.println("5.Quit");
							System.out.println("Enter your choice >");	
							change = kb.nextInt();
							switch(change){
								case 1:
									System.out.println("What's the new brand? ");
									String newB = kb.next();
									inventory[arrayPlace].setBrand(newB);
									System.out.println(inventory[arrayPlace]);
									break;
								case 2 :
									System.out.println("What's the new model? ");
									String newM = kb.next();
									inventory[arrayPlace].setModel(newM);
									System.out.println(inventory[arrayPlace]);
									break;
								case 3 :
									System.out.println("What's the new Serial Number? ");
									long newSN = kb.nextLong();
									inventory[arrayPlace].setSN(newSN);
									System.out.println(inventory[arrayPlace]);
									break;
								case 4 :
									System.out.println("What's the new price? ");
									double newP = kb.nextDouble();
									inventory[arrayPlace].setPrice(newP);
									System.out.println(inventory[arrayPlace]);
									break;
								case 5:
									break;
								default:
									System.out.println("Not a valid choice. Enter a valid option. ");									
							}
							
						} while (change != 5);	
					}
					
			case 3:
				System.out.println("Please enter the brand name you want to look for in the inventory: ");
				String case3brand = kb.next();
				findComputersBy(inventory, case3brand);
				break;
			case 4:
				System.out.println("Please enter the price you want to look for in the inventory: ");
				double case4Price = kb.nextDouble();
				findCheaperThan(inventory, case4Price);
				break;
			case 5:
				System.out.println("The program will end as instructed. ");
				break;
			default:
				System.out.println("Not a valid choice. Please enter another option: ");
				continue;
				
			}

		} while (choice != 5);

		kb.close();

	}
	
	public static void findComputersBy(Computer[] inventory, String case3brand) {
	    for (int i = 0; i < inventory.length; i++) {
	        if (inventory[i] != null && inventory[i].getBrand().equalsIgnoreCase(case3brand)) {
	        	System.out.println(inventory[i]);
	        }
	    }
	}
	
	public static void findCheaperThan(Computer[] inventory,double case4Price) {
		for (int i = 0; i < inventory.length; i++) {
	        if (inventory[i] != null && inventory[i].getPrice() < case4Price) {
	        	System.out.println(inventory[i]);
	        }
	    }
	}

}