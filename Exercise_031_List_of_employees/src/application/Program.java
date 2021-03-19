package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		/* Make a program to read an integer number  N and then the data (id, name and salary) of N employees. There should be no id repetition.
         *Then, make the increase of X per cent in the salary of a particular employee. To do this, the program must read an id and the value 
         *X.If the id informed does not exist,  do show a message and  do abort the operation. At the end, show the updated list of employees.
         *Remember to apply the encapsulation technique so that the salary cannot be freely changed. A salary can only be increased on the 
         *basis of a given percentage increase operation.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered?: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("\nEmployee #%d: \n", i);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employee e = new Employee(id, name, salary);
			list.add(e);
		}

		System.out.print("\nEnter the employee id that will have salary increase : ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);

		if (pos == null) {
			System.out.println("This id does not exist!");
		} 
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}

		System.out.println("\nList of employees:");
		for (Employee e : list) {
			System.out.println(e);
		}
		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee e = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return e != null;
	}
}
