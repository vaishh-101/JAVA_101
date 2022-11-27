public class Employee
{
int empID;
String empFname;
String empLname;
int basicSal;
public Employee(int empID, String empFname, String empLname, int basicSal)
{
this.empID = empID;
this.empFname = empFname;
this.empLname = empLname;
this.basicSal = basicSal;
}
public void DisplaySalary()
{
float hra;
float da;
float grossSalary;
float netPay;
float itax;
hra = 0.4f*basicSal;
da = 0.7f*basicSal;
grossSalary = basicSal+hra+da;
itax = grossSalary*0.1f;
netPay = grossSalary-itax;

System.out.println("Emp ID"+empID);
System.out.println("/nEmp FirstName"+empFname);
System.out.println("/nEmp LastName"+empLname);
System.out.println("/nBasic Salary"+basicSal);
System.out.println("/nHRA"+hra);
System.out.println("/nDA"+da);
System.out.println("/nGross Salary"+grossSalary);
System.out.println("/nNetPay"+netPay);
System.out.println("/nIncome Tax"+itax);
}
}

