import java.util.Collections;
import java.util.Comparator;
import java.util.Comparator;
import java.util.Scanner;

public class MenuChoices
	{

		public static void askToSort()
			{
				System.out.println("1) Sort by last name");
				System.out.println("2) Sort by GPA");
				System.out.println("3) Sort by period");

				Scanner userInput = new Scanner(System.in);
				int menuChoice = userInput.nextInt();
				if (menuChoice == 1)
					{
						Collections.sort(SISRunner.roster, new NameSorter("LastName"));

					} else if (menuChoice == 2)
					{
						Collections.sort(SISRunner.roster, new NameSorter("GPA"));

					} else if (menuChoice == 3)
					displayPeriodSorterMenu();
				
				SISRunner.testArrayList();

			}

		private static void displayAddDeleteMenu()
			{
				// TODO Auto-generated method stub

			}

		private static void displayPeriodSorterMenu()
			{
				System.out.println("Which period would you like to sort?\n"
						   + "1)\n"
						   + "2)\n"
						   + "3)\n");
				int menuChoice = SISRunner.userIntInput.nextInt();
				
				if (menuChoice == 1)
					Collections.sort(SISRunner.roster, new NameSorter("ClassOne"));
				else if (menuChoice == 2)
					Collections.sort(SISRunner.roster, new NameSorter("ClassTwo"));
				else if (menuChoice == 3)
					Collections.sort(SISRunner.roster, new NameSorter("ClassThree"));

			}

		private static Comparator newGPASorter()
			{
				// TODO Auto-generated method stub
				return null;
			}

	}
