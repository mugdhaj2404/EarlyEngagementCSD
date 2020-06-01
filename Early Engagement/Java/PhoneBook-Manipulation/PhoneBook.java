/*
PhoneBook Manipulation


Airone mobile services needs to store their customer details in the company portal. The details are customer's first and last name, phone number, and email address. Help the company develop an application to maintain the details of their customer systematically. 

You are provided with a class Contact with the following attributes as private.

String firstName

String lastName

long  phoneNumber

String emailId

A 4 argument constructor and appropriate setters and getters to store and retrieve the details are also provided.

Create a class PhoneBook with a private attribute

List<Contact> phoneBook = new ArrayList<Contact>();

Write the getters and setters.

Write the following methods in the PhoneBook class.

public void addContact(Contact contactObj) – This method should add the contact object to the phoneBook list.

public List<Contact> viewAllContacts() – This method should return the list of all contacts available.

public Contact viewContactGivenPhone(long phoneNumber) -  This method should return the contact details which has the phoneNumber given as parameter.

public boolean removeContact(long phoneNumber) -  This method should remove the contact details which has the phoneNumber given as parameter.  If removed return true.  Else if the phone number is not available return false.

Write a class Main with the main method.  Create the menu as shown in the Sample Input and Output and invoke the corresponding methods as per the choice provided.

Sample Input and Output 1:

Menu

1.Add Contact

2.Display all contacts

3.Search contact by phone 

4.Remove contact

5.Exit

Enter your choice: 1

Add a Contact:

Enter the First Name: John

Enter the Last Name: Michael

Enter the Phone No.: 9787878900

Enter the Email: John@gmail.com

Menu

1.Add Contact

2.Display all contacts

3.Search contact by phone 

4.Remove contact

5.Exit

Enter your choice: 1

Add a Contact:

First Name: Jhonty

Last Name: Rhodes

Phone No.: 9787888900

Email: Jhonty@gmail.com

Menu

1.Add Contact

2.Display all contacts

3.Search contact by phone 

4.Remove contact

5.Exit

Enter your choice: 2

The contacts in the List are:

First Name: John

Last Name: Michael

Phone No.: 9787878900

Email: John@gmail.com

First Name: Jhonty

Last Name: Rhodes

Phone No.: 9787888900

Email: Jhonty@gmail.com

Menu

1.Add Contact

2.Display all contacts

3.Search contact by phone 

4.Remove contact

5.Exit

Enter your choice: 3

Enter the Phone number to search contact:9787888900

The contact is:

First Name: Jhonty

Last Name: Rhodes

Phone No.: 9787888900

Email: Jhonty@gmail.com

Menu

1.Add Contact

2.Display all contacts

3.Search contact by phone 

4.Remove contact

5.Exit

Enter your choice: 4

Enter the Phone number to remove :9787888900

Do you want to remove the contact (Y/N): Y

The contact is successfully deleted.

Menu

1.Add Contact

2.Display all contacts

3.Search contact by phone 

4.Remove contact

5.Exit

Enter your choice: 5
*/


import java.util.*;

public class Main {

    
    public static void main(String[] args) {
    int option;
    PhoneBook l=new PhoneBook();
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(true){
        System.out.println("1.Add Contact");
        System.out.println("2.Display all contacts");
        System.out.println("3.Search contact by phone");
        System.out.println("4.Remove contact");
        System.out.println("5.Exit");
        System.out.println("Enter your choice");
        option = sc.nextInt();
        switch(option){
            
            case 1:
                    System.out.println("Add a Contact:");
                    System.out.println("Enter the First Name:");
                    String fName = sc.nextLine();
                    System.out.println("Enter the Last name:");
                    sc.nextLine();
                    String lName = sc.nextLine();
                    
                    System.out.println("Enter the Phone Number");
                    long phone = sc.nextLong();
                    System.out.println("Enter the Email:");
                    String email = sc.nextLine();

                    Contact B = new Contact(fName,lName,phone,email);
                    l.addContact(B);
                    break;
            case 2:
                System.out.println("The contacts in the List are:");
                if(l.viewAllContacts()!=null){
                    List<Contact> myArr = l.viewAllContacts();
                    for(Contact b:myArr)
                    System.out.println(b.getFirstName()+" "+b.getLastName()+" "+b.getPhoneNumber()+" "+b.getEmailId());
                }
                else
                    System.out.println("The list is Empty");
                        break;
            case 3:
                sc.nextLine();
                System.out.println("Enter the Phone number to search contact:");
                long sphone = sc.nextLong(); 
                System.out.println("The contact is:");
                Contact b = l.viewContactGivenPhone(sphone);
                //System.out.println()
                //for(Contact b:myArr1)
                    System.out.println(b.getFirstName()+" "+b.getLastName()+" "+b.getPhoneNumber()+" "+b.getEmailId());
                break;
            case 4:
                sc.nextLine();
                System.out.println("Enter the Phone number to remove:");
                long rphone = sc.nextLong();
                System.out.println("Do you want to remove the contact(Y/N):");
                char choice = sc.next().charAt(0);
                if(choice == 'Y'){
                    boolean res = l.removeContact(rphone);
                    if(res==true){
                        System.out.println("The contact is successfully deleted.");
                    }
                }else{
                    
                }
                break;
            case 5: 
                System.exit(0);
                
        }
        }
    }
    
}
-------------------------------------------------------------------------------------------------------------

public class Contact {

	private String firstName;
	private String lastName;
	private long  phoneNumber;
	private String emailId;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Contact(String firstName, String lastName, long phoneNumber,
			String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
}


-------------------------------------------------------------------------------------------------------------
import java.util.*;
public class PhoneBook{
    private List<Contact> phoneBook = new ArrayList<Contact>();
    public List<Contact> getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}
	
	public void addContact(Contact contactObj){
	    phoneBook.add(contactObj);
	}
	
	public List<Contact> viewAllContacts(){
        if(phoneBook.isEmpty()){
            return null;
        }else{
            return phoneBook;
        }
    }
    
    public Contact viewContactGivenPhone(long phoneNumber){
        Long number = new Long(phoneNumber);
         for(Contact b: phoneBook) {
            if(number.compareTo(b.getPhoneNumber())== 0) 
               return b;
        }
        return null;
    } 
    
    public boolean removeContact(long phoneNumber)
{
    for(int i=0;i<phoneBook.size();i++)
    {
    if(phoneBook.get(i).getPhoneNumber() == phoneNumber)        {
            phoneBook.remove(i);
            return true;
        }
    }
    return false;
}      
}  

