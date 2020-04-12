

public class Employee {
	int employeeId;
	String firstName;
	String lastName;
	String phnNo;
	Department department;
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	Double salary;
	public Employee(int employeeId, String firstName, String lastName, String phnNO, Double salary,Department department, String phnNo) {
		this.employeeId=employeeId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.phnNo=phnNo;
		this.salary=salary;
		this.department=department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}