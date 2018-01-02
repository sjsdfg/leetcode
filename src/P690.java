import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Joe on 2018/1/2.
 * 690. Employee Importance
 * https://leetcode.com/problems/employee-importance/description/
 */
public class P690 {
    public int getImportance(List<Employee> employees, int id) {
        int sum = 0;

        HashMap<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }

        Employee first = map.get(id);

        Queue<Employee> queue = new LinkedList<>();
        queue.offer(first);

        while (!queue.isEmpty()) {
            Employee now = queue.poll();
            sum += now.importance;

            List<Integer> subordinates = now.subordinates;
            for (Integer sub : subordinates) {
                queue.offer(map.get(sub));
            }
        }

        return sum;
    }
}

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
