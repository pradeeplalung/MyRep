
import java.io.*;

public class PriPub_Sample{
   // this instance variable is visible for any child class.
   public String name;
   
   // salary  variable is visible in Employee class only.
   private double salary;
   
   // The name variable is assigned in the constructor. 
   public PriPub_Sample (String empName){
      name = empName;
   }

   // The salary variable is assigned a value.
   public void setSalary(double empSal){
      salary = empSal;
   }
   
   // This method prints the employee details.
   public void printEmp(){
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }
   private void priMet(){
	   System.out.println("I m private");
   }

   public static void main(String args[]){
	  PriPub_Sample empOne = new PriPub_Sample("Ransika");
      empOne.setSalary(1000);
      empOne.printEmp();
      empOne.priMet();
      System.out.println("Hello :"+empOne.salary);
   }
}