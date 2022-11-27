public class Student
{
int rollno;
String lname;
String fname;
int contact;
public Student(int rollno,String lname,String fname,int contact)
{
this.rollno = rollno;
this.lname = lname;
this.fname = fname;
this.contact = contact;
}
public void display()
{
System.out.println("Roll no"+rollno);
System.out.println("LastName"+lname);
System.out.println("FirstName"+fname);
System.out.println("contact"+contact);
}
}