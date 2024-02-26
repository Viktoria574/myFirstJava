package lab19;

public class LabClassDriver {
    public static void main(String[] args) {
        Student[] model = Student.generateStudents(10);
        LabClass view = new LabClass();
        LabClassUI controller = new LabClassUI(model);

        int choice=0;
        while (true) {
            choice = view.startInterface();
            if(choice==4)
                break;
            String newView = controller.updateView(choice);
            view.output(newView);
        }
    }
}
