package lab17;

public class MVC {
    public static void main(String[] args) {
        Employee employee = new Employee("Mark", 15.0, 45);
        EmployeeView employeeView = new EmployeeView();
        EmployeeController employeeController = new EmployeeController(employee, employeeView);

        employeeController.updateView();

        employeeController.setEmployeePay(20.0);
        employeeController.setEmployeeHours(60);
        employeeController.updateView();
    }
}
