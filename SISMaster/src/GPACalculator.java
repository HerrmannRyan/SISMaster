import java.text.DecimalFormat;

public class GPACalculator
	{
		
		public static void calculateGPAForEachStudent()
		{
			for (int i = 0; i < SISRunner.roster.size(); i ++)
				{
					double firstGrade = getGrade(SISRunner.roster.get(i).getFirstGrade());
					double secondGrade = getGrade(SISRunner.roster.get(i).getSecondGrade());
					double thirdGrade = getGrade(SISRunner.roster.get(i).getThirdGrade());
					
					
					double GPAMath = (firstGrade + secondGrade + thirdGrade)/3.0;
					String totalGPA = SISRunner.decFor.format(GPAMath);
					
					//System.out.println(totalGPA);
					SISRunner.roster.get(i).setGradePointAverage(Double.parseDouble(totalGPA));
				}
		}
		
		private static double getGrade (String s)
		{
			double tempGPAForClass = 0.0;
			
			if (s.substring(0, 1).equals("A"))
				tempGPAForClass = 4.0;
			
			else if(s.substring(0, 1).equals("B"))
				tempGPAForClass = 3.0;
			
			else if(s.substring(0, 1).equals("C"))
				tempGPAForClass = 2.0;
			
			else if(s.substring(0, 1).equals("D"))
				tempGPAForClass = 1.0;
			
			else if(s.substring(0, 1).equals("F"))
				tempGPAForClass = 0.0;
			
			//Adding or subtracting .3 for pluses and minuses for GPA
			
			if (s.length() < 2)
				tempGPAForClass = tempGPAForClass + 0.0;
			
			else if (s.substring(1).equals("-"))
				tempGPAForClass = tempGPAForClass - 0.3;
			
			else if (s.substring(1).equals("+"))
				tempGPAForClass = tempGPAForClass + 0.3;
			
			return tempGPAForClass;
		}

	}
