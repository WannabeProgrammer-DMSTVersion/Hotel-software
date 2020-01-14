import java.util.ArrayList;
import java.util.Scanner;
public class Hire extends Employee {
	public Hire(String name, String surname, int yearOfBirth, ArrayList<String[][]> jobs,
			ArrayList<String[][]> languages) {
		super(name, surname, yearOfBirth, jobs, languages);
	}
	Scanner sc = new Scanner(System.in);
	public CustomBorders[] Evaluation(String health, ArrayList<String[][]> jobs,
			ArrayList<String[][]> talk, ArrayList<String> chars,
			String what, int grade) {
	    CustomBorders[] eval = new CustomBorders[6];
	    CustomBorders[] obj = new CustomBorders[6];
	    double grades[] = new double[6];
	    double sumGrade = 0.0;
	    for(int i = 0; i < 6; i++) {
	       obj[i] = new CustomBorders(what, grade);
	       eval[i] = obj[i];
	       grades[i] = grade;
	       sumGrade += grade;
		}
	    
		System.out.println("Dear" + getName() + getSurname() + ", your results are:");
		System.out.printf("%s%f\n", "Qualifications", "Grade");
		return eval;
        
        }
	public String res(double sumGrade,double rad[]) {
		for (int i = 0; i < 6; i++) {
			if (sumGrade <= 30.0 || rad[i] == 5.0)  {
				return "Sorry, but you're not eligible for the job";
			} 
		}
		return "Your grade is" + sumGrade/6.0 + "Welcome to our hotel";
	}
}
	


