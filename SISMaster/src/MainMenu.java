import java.io.FileNotFoundException;

public class MainMenu
	{
		
		public static void printMainMenu() throws FileNotFoundException
			{
				System.out.println("What would you like to do? \n"
						+ "1) Add or delete a student? \n"
						+ "2) Change student grades / schedule \n"
						+ "3) Sort Students \n"
						+ "4) Exit System");
				
				int mainMenuChoice = SISRunner.userIntInput.nextInt();
				
				
				//default for the later to do a while loop
				switch (mainMenuChoice)
				{
					case 1:
						Submenus.addOrDelete();
						break;
					case 2:
						SISRunner.switchMenuAndgrades();
						break;
					case 3:
						MenuChoices.askToSort();
						break;
					case 4:
						System.out.println("Thank you");
						SISRunner.stillInSystem = false;
						break;
					default:
						System.out.println("Please enter a number between 1 and 3.");
				}
			}
		
		
	}
