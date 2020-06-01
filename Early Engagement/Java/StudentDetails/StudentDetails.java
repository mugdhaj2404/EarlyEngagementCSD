/*Student Details - Constructor

Create a class Student with the private attributes

int studentId

String studentName, studentAddress, collegeName. 

Include appropriate getter methods.

Write 2 constructors for the Student class based on the below assumptions. 

Assume most of the students are from “NIT” college. So user has to give input whether the student is from NIT or not. 

    If student belongs to NIT, give input as 'yes/YES' and  skip input for the attribute collegeName  and create student object with 3-argument constructor to initilze the values for studentId, studentName and studentAddress and  collegeName as “NIT”.
    If student belongs to other college, give input as 'no/NO' and get college name from the user and create student object with 4-argument constructor to initialize all the values. 
    Instead of Yes / No, if user enters different input then display 'Wrong Input' and get the input again.

Based on the above assumptions write the necessary constructors in the Student class.

Write a class StudentMain with the main method and test the application. 

Get all the input needed from the main method. 

Sample Input 1:

Enter Student's Id:

12

Enter Student's Name:

John

Enter Student's address:

Chennai

Whether the student is from NIT(Yes/No):

NO

Enter the college name:

SVS


Sample Output 1:

Student id:12

Student name:John

Address:Chennai

College name:SVS


Sample Input 2:

Enter Student's Id:

43

Enter Student's Name:

Tom

Enter Student's address:

Coimbatore

Whether the student is from NIT(Yes/No):

y

Wrong Input

Whether the student is from NIT(Yes/No):

yes


Sample Output 2:

Student id:43

Student name:Tom

Address:Coimbatore

College name:NIT*/
------------------------------------------------------------------------------------------
import java.util.*;
public class Student{
    private int studentId;
    private String studentName,studentAddress,collegeName;
    public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student(int studentId, String studentName, String studentAddress){
	    this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = "NIT";
	}
	public Student(int studentId, String studentName, String studentAddress, String collegeName) {
		 this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}
}

------------------------------------------------------------------------------------------
import java.util.*;
public class StudentMain{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String colName = "";
        System.out.println("Enter Student's Id:");
        int id = sc.nextInt();
        System.out.println("Enter Student's Name:");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Student's address:");
        String address = sc.nextLine();
        
        System.out.println("Whether the student is from NIT(Yes/No):");
        String isNit = sc.nextLine();
        
     
        if(isNit.equals("NO") || isNit.equals("no") ){
            System.out.println("Enter the college name:");
            colName = sc.nextLine();
            Student stud1 = new Student(id,name,address,colName);
        }
        else if(isNit.equals("YES") || isNit.equals("yes")){
            colName = "NIT";
            Student stud2 = new Student(id,name,address);

        }
        else{
            System.out.println("Wrong Input");
            System.out.println("Whether the student is from NIT(Yes/No):");
            isNit = sc.nextLine();
        }
        
    }
}
