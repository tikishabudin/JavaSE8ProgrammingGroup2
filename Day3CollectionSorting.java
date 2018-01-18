import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.lazada.assets.Employee;

//class NameSorter implements Comparator<Employee>
//{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//}

public class Day3CollectionSorting 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Tiki", 5, 0));
		employees.add(new Employee("Trung", 20, 10000000));
		employees.add(new Employee("Slava", 13, 100000));
		employees.add(new Employee("Nghi", 0, 400000000));
		employees.add(new Employee("Madan", 107, 687000000));
		
		//Collections.sort(employees);
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee x, Employee y)
			{
				return x.getName().compareTo(y.getName());
			}
		});
		
		for(Employee x : employees)
		{
			System.out.format("%d - %s (VND %f)\n",x.getId(),x.getName(),x.getSalary());
		}
	}

}






