import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    private static void doSerializationStudents(List<Person> students) {
        System.out.println("\nSerializing student objects to file 'serial.ser'...");

        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("serial.ser")))) {
            out.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doDeserializationStudents() {
        System.out.println("\nDe-Serializing serialized student objects from file 'serial.ser' ...");

        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("serial.ser")))) {

            List<Person> woi = (List<Person>) in.readObject();

            for (Person student : woi) {
                System.out.println(student.toString());
            }

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    	// CHAY TONG TOAN FILE DA LAM // 
        
        List<Person> students = new ArrayList<>();

        System.out.println("-------- Thong Tin -------");

        Subject[] subjectsStudent1 = {
        		 new Subject("Lap Trinh Mang", 9),
                 new Subject("Lap Trinh C", 8),
                 new Subject("Cau Truc Du Lieu", 7)
        };
        Subject[] subjectsStudent2 = {
        		new Subject("Toan Roi Rac", 10),
                new Subject("Ki Nang Mem", 7),
                new Subject("Lap Trinh Web", 9)
        };
        Subject[] subjectsStudent3 = {
                new Subject("Dai So", 8),
                new Subject("Phuong Phap Tinh", 9),
                new Subject("NLCB1", 9)
        };

        Person student1 = new Student("Hoang Ngoc Long", 23, 64121, subjectsStudent1);
        Person student2 = new Student("Vu Tat Thanh", 23, 64154, subjectsStudent2);
        Person student3 = new Student("Tran Van A", 23, 64112, subjectsStudent3);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        doSerializationStudents(students);

        doDeserializationStudents();
    }
}
