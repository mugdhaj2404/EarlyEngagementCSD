/*Employee Salary Calculation

Create a class Employee with the following private member variables.

    int employeeId
    String employeeName
    double salary
    double netSalary

Include appropriate getters and setters method in Employee class. Write the following method in the Employee class:
public void calculateNetSalary(int pfpercentage)  - This method should take PF percentage as argument. Deduct the PF amount from the salary and set the netSalary.  


Create a Main class which has the main method which invokes the method to get the input and prints the details as shown in the sample. 

Also write a method :

   public static Employee getEmployeeDetails() -  which gets the employee details - id, name and salary, and returns the employee object.

public static int getPFPercentage() -  which gets the PF percentage and returns the same

In the main method invoke the above two methods, and then call the calculateNetSalary method in Employee class and print the output as shown below.

Sample Input 1:

Enter Id:
101
Enter Name:
Vivek
Enter salary:
20000
Enter PF percentage:
7

Sample Output 1:

Id : 101

Name : Vivek

Salary : 20000.0

Net Salary : 18600.0
------------------------------------------------------------------------------------------------------------
import java.util.*;
public class Main{
public static Employee getEmployeeDetails(){
    Scanner sc=new Scanner(System.in);
    Employee e=new Employee();
    System.out.println("Enter Id:");
    e.setEmployeeId(sc.nextInt());
    System.out.println("Enter Name:");
    e.setEmployeeName(sc.next());
    System.out.println("Enter salary:");
    e.setSalary(sc.nextDouble());
    return e;
}
public static int getPFPercentage(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter PF percentage:");
    int val=sc.nextInt();
    return val;
}
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    Employee e=getEmployeeDetails();
    int temp=getPFPercentage();
    e.calculateNetSalary(temp);
    System.out.println("Id : "+e.getEmployeeId());
    System.out.println("Name : "+e.getEmployeeName());
    System.out.println("Salary : "+e.getSalary());
    System.out.println("Net Salary : "+e.getNetSalary());
}
}
*/
--------------------------------------------------------------------------------------------------------------
public class Employee  {
private int employeeId;
private String employeeName;
private double salary;
private double netSalary;
public int getEmployeeId() {
    return employeeId;
}
public String getEmployeeName()  {
    return employeeName;
}
public double getSalary() {
    return salary;
}
public void setEmployeeId(int employeeId) {
    this.employeeId=employeeId;
}
public void setEmployeeName(String employeeName)  {
    this.employeeName=employeeName;
}
public void setSalary(double salary) {
    this.salary=salary;
}
public void calculateNetSalary(int pf) {
    double temp=(pf/100.00);
    setNetSalary(salary-(salary*(temp)));
}
public void setNetSalary(double netSalary) {
    this.netSalary=netSalary;
}
public double getNetSalary() {
    return netSalary;

}
}
