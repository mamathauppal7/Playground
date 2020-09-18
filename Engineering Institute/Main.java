//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int salary)
  {
    int Base;
    Base=salary;
    System.out.println("Base Salary: "+Base);
  }
}
class CSE extends Faculty 
{
  public void salary(int salary)
  {
    int bonus=3000;
    int csesalary;
    csesalary=bonus+salary;
    System.out.println("CSE Faculty: "+csesalary);
    //write your CSE class statements
  }
}
class IT extends Faculty
{
  public void salary(int salary)
  {
    int bonus=5000;
    int itsalary;
    itsalary=bonus+salary;
     System.out.println("IT Faculty: "+itsalary);
    //write your IT class statements
  }
}
class ECE extends Faculty
{
  public void salary(int salary)
  {
    int bonus=4500;
    int ecesalary;
    ecesalary=bonus+salary;
     System.out.println("ECE Faculty: "+ecesalary);
    //write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in =new Scanner(System.in);
    int salary=in.nextInt();
    Faculty fac=new Faculty();
    fac.salary(salary);
    CSE cse=new CSE();
    cse.salary(salary);
    IT it=new IT();
    it.salary(salary);
    ECE obj = new ECE();
    obj.salary(salary);
    //implement your required concept here
  }
}