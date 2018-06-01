import java.util.ArrayList;

public class Roster {

	private static ArrayList<Student> myRoster = new ArrayList<>();
	
	public static void main(String[] args) {
		add("1", "John", "Smith", "John1989@gmail.com", 20, 88, 79, 59);
		add("2", "Suzan", "Erickson", "Erickson_1990@gmail.com", 19, 91, 72, 85);
		add("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, 85, 84, 87);
		add("4", "Erin", "Black", "Erin.black@comcast.net", 22, 91, 98, 82);
		add("5", "John", "Doe", "johndoe@wgu.edu", 22, 90, 92, 93);
		
		printAll();
		printInvalidEmails();
		//loop through the ArrayList and for each element:
		for(Student i: myRoster) {
			String test = i.getStudentId();
			printAverageGrade(test);
		}
		remove("3");
		remove("3");
		//expected: this should print a message saying such a student with this ID was not found.
	}
	
	public static void add(String studentId, String firstName, String lastName, String emailAddress, int age, int grade1, int grade2, int grade3) {
		int[] grades = {grade1, grade2, grade3};
		Student newStudent = new Student(studentId, firstName, lastName, emailAddress, age, grades);
		myRoster.add(newStudent);
	}

	public static void remove(String studentId) {
		int found = 0;
		for(int i = 0; i < myRoster.size(); i++) {
			String search = myRoster.get(i).getStudentId();
			if(search.equals(studentId)) {
				myRoster.remove(i);
				System.out.println("Student was removed.");
				found = 1;
				break;
			}
		}
		if(found == 0) {
			System.out.println("Student does not exist!");
		}
		
	}
	
	public static void printAll() {
		for(Student i: myRoster) {
			i.print();
		}
	}
			
	public static void printAverageGrade(String studentId) {
		for(Student i: myRoster) {
			if(i.getStudentId().equals("studentId")) {
				int count = 0;
				int total = 0;
				int[] grades = i.getGrades();
					for(int n = 0; n < grades.length; n++) {
						count++;
						total+= grades[n];
					}
				System.out.println(total / count);	
			}
			
		}
		
	}
	
	public static void printInvalidEmails() {
		for(Student i: myRoster) {
			String test = i.getEmailAddress();
			if(test.contains("@") && test.contains(".") && !test.contains(" ")) {
				
			}
			else {
				System.out.println("This email is invalid: " + test);
			}
		}
	}
	
}
