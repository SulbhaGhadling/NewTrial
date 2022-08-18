package DeptMethod;

import Controller.Company;
import Model.Employee;

public class Dept {

	public Company addEmployee() {

		Company company = new Company();

		company.e1.empid = 111;
		company.e1.empname = "Sulbha";
		company.e1.empsalary = 1234567890;

		company.e2.empid = 222;
		company.e2.empname = "Rucha";
		company.e2.empsalary = 234567890;

		company.e3.empid = 333;
		company.e3.empname = "Avadhoot";
		company.e3.empsalary = 345678901;

		return company;
	}
}
