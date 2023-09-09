package Exercise;

import java.util.Scanner;

public class Employee {
   private int id ; 
   private String name ; 
   private String sex ; 
   private String date ; 
   private String address ; 
   private int coefficientsSalary ;
   private double salary ;
public Employee() {
}
public Employee(int id, String name, String sex, String date, String address, int coefficientsSalary, double salary) {
	this.id = id;
	this.name = name;
	this.sex = sex;
	this.date = date;
	this.address = address;
	this.coefficientsSalary = coefficientsSalary;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getCoefficientsSalary() {
	return coefficientsSalary;
}
public void setCoefficientsSalary(int coefficientsSalary) {
	this.coefficientsSalary = coefficientsSalary;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
} 
public void input()
{
	Scanner sc = new Scanner(System.in) ; 
	System.out.print("Enter id :");
	this.id= sc.nextInt() ; 
	sc.nextLine() ; 
	System.out.print("Enter name :");
	this.name = sc.nextLine() ; 
	System.out.print("Enter date of birth :");
	this.date = sc.nextLine() ; 
	System.out.print("Enter sex :");
	this.sex = sc.nextLine() ;
	System.out.print("Enter address :");
	this.address = sc.nextLine() ;
	System.out.print("Enter coefficients salary :");
	this.coefficientsSalary = sc.nextInt() ;
	System.out.print("Enter salary :");
	this.salary = sc.nextDouble() ;
	
}
public void output()
{
	System.out.println("ID :"+this.id);
	System.out.println("Name :"+this.name);
	System.out.println("Date of birth :"+this.date);
	System.out.println("Sex :"+this.sex);
    System.out.println("Address :"+this.address);
    System.out.println("Coefficents salary :"+this.coefficientsSalary);
    System.out.println("Salary :"+this.salary);
}
public void salary()
{
  double result =salary*coefficientsSalary ;
  setSalary(result); 
}


   
}
