public abstract class Employee {
protected String name;
protected String PhoneNum;
protected double Salary;
protected int yearOfExperience;
public Employee (String n , String PNo ,  double salary) {

name=n;
PhoneNum=PNo;
Salary=salary;

}

public abstract void CalculateSalary ();

public String toString(){
return "Employee name: "+name+" Phone number: "+PhoneNum+" Salary: "+Salary;
}
}