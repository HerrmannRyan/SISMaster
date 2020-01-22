
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class SISRunner
	{
		
		// Please place all of the main static variables here VVVVVVV
		static ArrayList<Student> roster = new ArrayList<Student>();
		static DecimalFormat decFor = new DecimalFormat("0.00");
		static Scanner userIntInput = new Scanner(System.in);
		static boolean stillInSystem = true;
		
		public static void main(String[] args) throws FileNotFoundException
			{
				FileReader.readFile();

				while(stillInSystem)
					{
						System.out.println();
						GPACalculator.calculateGPAForEachStudent();
						MainMenu.printMainMenu();

					}
			}
		
		public static void testArrayList()
			{
				int counter = 1;
				for(Student t: roster)
					{

						System.out.printf("%-25s", counter + ": " + t.getFirstName() + " " + t.getLastName());
						System.out.printf("%-15s", t.getFirstClass() + " " + t.getFirstGrade());
						System.out.printf("%-15s", t.getSecondClass() + " " + t.getSecondGrade());
						System.out.printf("%-15s", t.getThirdClass() + " " + t.getThirdGrade());
						System.out.printf("%-3s", t.getGradePointAverage() + "\n");
						/*String studentGPA = decFor.format(t.getGradePointAverage());
						System.out.println(counter + ": " + t.getFirstName() + " " + t.getLastName() + " " 
								+ t.getFirstClass() + " " + t.getFirstGrade() + " " 
								+ t.getSecondClass() + " " + t.getSecondGrade() + " " 
								+  t.getThirdClass() + " " + t.getThirdGrade() + " " 
								+  studentGPA);*/

						counter++;
						
						//display commit, puts things in columns
					}	
			}

		public static void switchMenuAndgrades()
			{
				System.out.println("What would you like to do?\n"
						+ "1) Change Grades\n"
						+ "2) Change Classes");
				
				int choice = userIntInput.nextInt();
				
				if (choice == 1)
					{
						System.out.println("Please choose a student below to change the grades.");
						testArrayList();
						ChangeGrades.changeGrades();
						GPACalculator.calculateGPAForEachStudent();
						System.out.println("The grades have been changed.");
						testArrayList();
					}
				else if(choice == 2)
					{
						System.out.println("Please choose a student below to change the schedule.");
						testArrayList();
						ChangeSchedule.changeSchedule();
						System.out.println("The schedules have been changed.");
						testArrayList();
					}
				
			}

	}





