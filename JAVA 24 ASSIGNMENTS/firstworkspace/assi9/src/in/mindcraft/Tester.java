package in.mindcraft;

import java.text.SimpleDateFormat;
import java.util.Date;

class DateOfBirth {
    private int day;
    private int month;
    private int year;

    public DateOfBirth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

   	@Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        @SuppressWarnings("deprecation")
		Date date = new Date(year - 1900, month - 1, day);
        return dateFormat.format(date);
    }
}

class Student {
    private static int nextRollNumber = 1;
    private int rollNumber;
    private String name;
    private DateOfBirth dateOfBirth;

    public Student() {
        this.rollNumber = nextRollNumber++;
        this.name = "Satvik";
        this.dateOfBirth = new DateOfBirth(02, 8, 2001); 
    }

    public Student(String name, DateOfBirth dateOfBirth) {
        this.rollNumber = nextRollNumber++;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

public class Tester {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Sagar", new DateOfBirth(19, 2, 2002));

        student1.display();
        System.out.println();

        student2.display();
    }
}
