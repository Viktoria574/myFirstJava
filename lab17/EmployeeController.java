package lab17;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view){
        this.model=model;
        this.view=view;
    }

    public void setEmployeeName(String name){
        model.setName(name);
    }

    public void setEmployeeHours(int hours){
        model.setHours(hours);
    }
    public void setEmployeePay(double pay){
        model.setPay(pay);
    }

    public void updateView(){
        view.printEmployeeDetails(model.getName(), model.getSalary());
    }
}
