import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader
	{
		
		public static void readFile() throws FileNotFoundException
		{
			Scanner file = new Scanner (new File("SISStudentData.txt"));
			
			while (file.hasNext())
				{
					String readingStudent = file.nextLine();
					String[] studentInformation = readingStudent.split(" ");
					
					String firstName = studentInformation[0];
					String lastName = studentInformation[1];
					
					String firstClass = studentInformation[2];
					String firstGrade = studentInformation[3];
					
					String secondClass = studentInformation[4];
					String secondGrade = studentInformation[5];
					
					String thirdClass = studentInformation[6];
					String thirdGrade = studentInformation[7];
					
					SISRunner.roster.add( new Student(firstName, lastName, firstClass, firstGrade, secondClass, secondGrade, thirdClass, thirdGrade, 0, 0.0));
					
				}
		}
		
	}
