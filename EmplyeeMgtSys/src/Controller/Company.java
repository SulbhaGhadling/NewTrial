package Controller;

import DeptMethod.Dept;
import Model.Employee;

public class Company {
	public Employee e1 = new Employee();
	public Employee e2 = new Employee();
	public Employee e3 = new Employee();

	public static void main(String[] args) {
		Dept empdept = new Dept();
		Company comp = empdept.addEmployee();
		System.out.println(comp.e1.empid + "\t" + comp.e1.empname + "\t" + comp.e1.empsalary);
		System.out.println(comp.e2.empid + "\t" + comp.e2.empname + "\t" + comp.e2.empsalary);
		System.out.println(comp.e3.empid + "\t" + comp.e3.empname + "\t" + comp.e3.empsalary);
	}
}
