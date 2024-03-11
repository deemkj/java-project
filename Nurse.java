public class Nurse extends Employee {
private int Nno;

public Nurse(String n , String PNo ,  double salary, int Nno){

super(n,PNo ,salary );
this.Nno=Nno;

}


public void CalculateSalary (){
if(yearOfExperience > 30)
Salary=18200;
else
if(yearOfExperience > 20)
Salary=15600;
else
if(yearOfExperience > 15)
Salary=12800;

else
if(yearOfExperience > 5)
Salary=10200;
else
Salary=8250;

}
public String toString() {


return super.toString() +" Nurse number: "+Nno;
}
}