import java.util.ArrayList;

public class Employee {
	private String name;
	private String surname;
    private int yearOfBirth;
    private int jobCount;
    private int howLang;
    ArrayList<String[]> jobs = new ArrayList<String[]>();
    String[][] Languages = new String[jobCount][2];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getHowLang() {
		return howLang;
	}
	public void setHowLang(int howLang) {
		this.howLang = howLang;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public int getJobCount() {
		return jobCount;
	}
	public void setJobCount(int jobCount) {
		this.jobCount = jobCount;
	}
	public ArrayList<String[]> getJobs() {
		return jobs;
	}
	public void setJobs(ArrayList<String[]> jobs) {
		this.jobs = jobs;
	}
    public Employee(String name, String surname, int yearOfBirth, int howLang) {
    	this.name = name;
    	this.surname = surname;
    	this.yearOfBirth = yearOfBirth;
    	this.jobCount = jobCount;
    	this.howLang = howLang;
    }
    
}    
