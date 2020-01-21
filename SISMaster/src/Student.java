import java.util.ArrayList;

public class Student
	{
		
		private String firstName;
		private String lastName;
	


		private String firstClass;
		private String firstGrade;
		private String secondClass;
		private String secondGrade;
		private String thirdClass;
		private String thirdGrade;
		private double gradePointAverage;
		private int periodNum;
		
	
		public Student(String fN, String lN, String fC ,String fG, String sC, String sG, String tC, String tG, int pN, double gpa)
		{
			firstName = fN;
			lastName = lN;
			periodNum = pN;
			firstClass = fC;
			secondClass = sC;
			thirdClass = tC;
			
			firstGrade = fG;
			secondGrade = sG;
			thirdGrade = tG;
			
			gradePointAverage = gpa;
			
		}
		public int getPeriodNum()
			{
				return periodNum;
			}


		public void setPeriodNum(int periodNum)
			{
				this.periodNum = periodNum;
			}



		public String getFirstGrade()
			{
				return firstGrade;
			}


		public void setFirstGrade(String firstGrade)
			{
				this.firstGrade = firstGrade;
			}


		public String getSecondGrade()
			{
				return secondGrade;
			}


		public void setSecondGrade(String secondGrade)
			{
				this.secondGrade = secondGrade;
			}


		public String getThirdGrade()
			{
				return thirdGrade;
			}


		public void setThirdGrade(String thirdGrade)
			{
				this.thirdGrade = thirdGrade;
			}


		public String getFirstName()
			{
				return firstName;
			}


		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}


		public String getLastName()
			{
				return lastName;
			}


		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}


		public String getFirstClass()
			{
				return firstClass;
			}


		public void setFirstClass(String firstClass)
			{
				this.firstClass = firstClass;
			}


		public String getSecondClass()
			{
				return secondClass;
			}


		public void setSecondClass(String secondClass)
			{
				this.secondClass = secondClass;
			}


		public String getThirdClass()
			{
				return thirdClass;
			}


		public void setThirdClass(String thirdClass)
			{
				this.thirdClass = thirdClass;
			}


		public double getGradePointAverage()
			{
				return gradePointAverage;
			}


		public void setGradePointAverage(double gradePointAverage)
			{
				this.gradePointAverage = gradePointAverage;
			}
		
	}
