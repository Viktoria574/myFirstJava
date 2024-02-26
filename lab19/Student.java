package lab19;
import java.util.Random;
public class Student {
    private String fullname;
    private int score;

    public String toString() {
        return "Имя: " + fullname + " Оценка: " + score + ".";
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public int compareTo(Object o) {
        if (o instanceof Student obj) return Integer.compare(this.getScore(), obj.getScore());
        return -1;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) throws EmptyStringException {
        if (fullname.isEmpty()) throw new EmptyStringException("Пустая строка");
        this.fullname = fullname;
    }

    public static Student[] generateStudents(int n) {
        Student[] model = new Student[n];
        Random random = new Random();
        for (int i = 1; i < model.length + 1; i++) {
            Student temp = new Student();
            try {
                temp.setFullname("Студент № " + i);
            } catch (EmptyStringException e) {
                continue;
            }
            temp.setScore(random.nextInt(100));
            model[i - 1] = temp;
        }
        return model;
    }
}
