import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class NameSorter implements Comparator<Student>
	{
	
		
			private String complete;
			public NameSorter(String comp) {
				complete = comp;
			}
				
		
		public int compare(Student s1,Student s2) {
			if(complete.equals("LastName")){
				return s1.getLastName().compareTo(s2.getLastName());
			}else if(complete.equals("GPA")) {
				//return (int) ((s1.getGradePointAverage()-s2.getGradePointAverage())*100);
				return (int) ((s2.getGradePointAverage()-s1.getGradePointAverage())*100);
			}else if(complete.equals("FirstName")) {
				return s1.getFirstName().compareTo(s2.getFirstName());
			}
			
			else if(complete.equals("ClassOne")){
			return s1.getFirstClass().compareTo(s2.getFirstClass());
			}
			
			else if(complete.equals("ClassTwo")){
			return s1.getSecondClass().compareTo(s2.getSecondClass());
			}
			
			else if(complete.equals("ClassThree")){
			return s1.getThirdClass().compareTo(s2.getThirdClass());
			}
			
			else {
				return s1.getPeriodNum()-s2.getPeriodNum();
			}
			
		}
	
		}
	
		
