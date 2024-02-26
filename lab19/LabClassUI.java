package lab19;
import java.util.Scanner;
public class LabClassUI {
    private Student[] model;
    public LabClassUI(Student[] model) {
        this.model=model;
    }

    public Student findStudent(String fullname) throws StudentNotFoundException, EmptyStringException {
        if (fullname.isEmpty()) {
            throw new EmptyStringException("Пустая строка");
        }
        for(Student student : model) {
            if (student.getFullname().equals(fullname)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент не найден");
    }

    public void sortStudents() {
        for (int i = 0; i < model.length; i++) {
            for (int j = i + 1; j < model.length; j++) {
                if (model[i].compareTo(model[j]) > 0) {
                    Student temp = model[i];
                    model[i] = model[j];
                    model[j] = temp;
                }
            }
        }
    }

    public String updateView(int choice) {
        switch (choice) {
            case 1:
                sortStudents();
                break;
            case 3:
                System.out.println("Введите имя: ");
                String fullname = new Scanner(System.in).nextLine();
                try {
                    Student student = findStudent(fullname);
                    return student.toString();
                } catch (StudentNotFoundException | EmptyStringException e) {
                    return "Студент не найден";
                }

        }
        StringBuilder result = new StringBuilder();
        for (Student student : model) {
            result.append(student).append("\n");
        }
        return result.toString();

    }
}
