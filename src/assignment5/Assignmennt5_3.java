package assignment5;// Package is Compulsory.
/*
 * Program to calulate the Salary of an Employee.
 */
public class Assignmennt5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
PermanentEmp pe=new PermanentEmp(); // Instantiating the object for Permanent Employee
pe.calculate_balance_leaves(); // Calling the methods of Permanent Employee
pe.calculate_salary();
TemporaryEmp te=new TemporaryEmp(); // Instantiating the object for Temporary Employee.
te.calculate_balance_leaves(); // Calling the methods of Temporary Employee
te.calculate_salary();
	}

		}
		abstract class Employee // Creating the abstract class Employee
		{
			int empid; // Declaring the variable Emp id.
			String empName; // Declaring the varable Emp Name
			int total_leaves;
			double total_salary;
				
		abstract void calculate_balance_leaves(); 
		abstract boolean  avail_leave(int no_of_leaves, char type_of_leave); 
		abstract void calculate_salary(); // Creating abstract Methods for Employee Class as per the assignment.
			
		}
		class PermanentEmp extends Employee{ // Creating the child class Permanent Employee
			int paid_leave =30  , sick_leave =4,casual_leave =5; // Declaring and initiaizing the leave details 
			//as per the assignment.
			double basic = 2500; // Declaring and initializing the basic salary of a permanent employee
		double hra = 0.5 * basic; //Calculating the HRA
		double pfa= 0.12 * hra; // Calculating the PFA
			
			void calculate_balance_leaves() { // Calling the method balance leaves to calculate total no.of leaves
				total_leaves=sick_leave+casual_leave+paid_leave;
				System.out.println("The total number of leaves for a permanent employeee are " +total_leaves);
			}
			boolean avail_leave(int no_of_leaves, char type_of_leave) { 
				 return false;
			}
		void calculate_salary() { // Calculating the salary of an permanent employee
				double total_salary=basic + hra -pfa;
				
			System.out.println(" Employee Sal of permanent employee is "+total_salary);	
			}
		}
		class TemporaryEmp extends Employee{ // Creating the Child class Temporary Employee
			int paid_leave =25, sick_leave =5,casual_leave =4; // Declaring and initializing the variables for temporary employee
			
			double basic = 1700; // Declaring and initializing the variable for basic salary of temporary employee
			double hra = 0.5 * basic;
			double pfa= 0.12 * hra;

		void calculate_balance_leaves() { // calculating the balance leaves of temporary employee
				int total_leaves=sick_leave+casual_leave + paid_leave;
				System.out.println("The total number of leaves for a temporary employeee are " +total_leaves);
			}
			boolean avail_leave(int no_of_leaves, char type_of_leave) {
				
				 return false;
			}
		void calculate_salary()
		{
			double total_salary=this.basic + hra -pfa;
			
			System.out.println(" Employee Sal is "+total_salary);	
		}
		}	
