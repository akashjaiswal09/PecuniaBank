
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeService {
	public static void main(String args[]) {
		double sum = 0;
		Employee e1 = new Employee(1, "mahesh", "bhat", "111", (double) 6000, new Department(434, "IT", 342), "1234");
		Employee e2 = new Employee(2, "rajesh", "khanna", "222", (double) 1000, new Department(543, "HR", 78), "12345");
		Employee e3 = new Employee(3, "Suresh", "singh", "333", (double) 4000, new Department(34, "Production", 535),
				"123");
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		sum = list.stream().mapToDouble(x -> x.getSalary()).sum();
		System.out.println(sum);

		list.stream().map(x -> x.getSalary() * 0.15).forEach(System.out::println);
	}
}