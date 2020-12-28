package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
		System.out.println("Employee #" + (i + 1) + ":");
		
		System.out.print("id:");
		Integer id = sc.nextInt();
		while (hasId(list, id)) {
			System.out.print("id already exist!");
			id = sc.nextInt();
		}
		System.out.print("Nome:");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Salary:");
		Double salary = sc.nextDouble();
		
		Employee emps = new Employee(id,name,salary);
		list.add(emps);
		}
		
		System.out.print("Enter the employee id tha will have salary increase : ");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);
		if (pos == null) {
			System.out.println("This id dos not exist!");
			
		}
		else {
			System.out.print("Enter the percentage: ");
		    double percent = sc.nextDouble();
		    list.get(pos).increaseSalary(percent);
		    
			}
		
		System.out.println();
		System.out.println("List of employees:  ");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
		public static Integer position(List<Employee> list, int id) {
			for (int i=0; i<list.size(); i++) {
				if (list.get(i).getId() == id) {
					return i;
					
				}
			}
			return null;
		}
			public static boolean hasId(List<Employee> list, int id) {
				Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
						return emp != null;
			}
		}
	

