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

				else
					{
						displayAddDeleteMenu();

					}
				
				SISRunner.testArrayList();

			}

		private static void displayAddDeleteMenu()
			{
				// TODO Auto-generated method stub

			}

		private static void displayPeriodSorterMenu()
			{
				// TODO Auto-generated method stub

			}

		private static Comparator newGPASorter()
			{
				// TODO Auto-generated method stub
				return null;
			}

	}
