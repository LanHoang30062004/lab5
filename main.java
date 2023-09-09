package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ; 
	ArrayList<Employee>list = new ArrayList<Employee>() ; 
	while(true)
	{
		System.out.println("- INFORMATION EMPLOYEE -");
		System.out.println("1. Input");
		System.out.println("2. Output");
		System.out.println("3. Salary");
		System.out.println("4. Exit");
		System.out.print("- Enter your choice :");
		int choice = sc.nextInt() ;
		if (choice == 1)
		{
			Employee ee = new Employee() ; 
			ee.input(); 
			list.add(ee) ; 
		}
		else if (choice == 2)
		{
			int dem = 0 ; 
			for (Employee ee : list)
			{
				dem++ ; 
				System.out.println("Information Employee "+dem);
				ee.output();
				System.out.println();
			}
		}
		else if (choice == 3)
		{
			for (Employee ee  : list)
			{
				ee.salary();
			}
			System.out.println("Salary has been calculated !");
		}
		else 
		{
			break ; 
		}
		
	}
}
}
