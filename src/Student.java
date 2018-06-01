
public class Student {
	
	private String studentId;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private int age;
	private int[] grades;
	
	//Mutators
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	
	//Accessors
	
	public String getStudentId() {
		return studentId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public int getAge() {
		return age;
	}
	
	public int[] getGrades() {
		return grades;
	}
	
	//Constructor
	
	public Student(String studentId, String firstName, String lastName, String emailAddress, int age, int[] grades) {
		setStudentId(studentId);
		setFirstName(firstName);
		setLastName(lastName);
		setEmailAddress(emailAddress);
		setAge(age);
		setGrades(grades);
	}
	
	//Print Method
	
	public void print() {
		System.out.println("First Name:\t" + getFirstName() + "\tLast Name:\t" + getLastName() + "\tEmail:\t" + getEmailAddress() + "\tAge:\t" +
		getAge());
	}
	
}
