package Method;

import com.emexo.hashset.Employee;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EmployeeList {

    // iterate for lambda expression
    public void iterateUsingLambdaExpression(Set<com.emexo.hashset.Employee> set) {

        set.forEach(acc -> System.out.println(acc.getEmployeeId() + ":" + acc.getEmployeeName()));
    }

    // iterate for each loop
    public void iterateUsingForEach(List<com.emexo.hashset.Employee> list) {
        if (list != null && list.size() > 0) {
            for (com.emexo.hashset.Employee employee : list) {
                System.out.println(employee.getEmployeeId() + ":" + employee.getEmployeeName());
            }
        }
    }

    // iterate for while loop
    public void iterateUsingIterator(List<com.emexo.hashset.Employee> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            Iterator<Employee> iterator = list.iterator();
            System.out.println("Forward direction");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
