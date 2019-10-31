import java.io.Serializable;

public class Subject implements Serializable {
    private String subjectName;
    private double mark = -1;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public Subject(String subjectName, double mark) {
        this.subjectName = subjectName;
        this.mark = mark;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", mark=" + mark +
                '}';
    }
}