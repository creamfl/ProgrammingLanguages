package exercise1;

interface Average {
    float average();
}


interface Scholarship {
    float rate();
}


class Person {
    String p_name;

    public Person(String name) {
        this.p_name = name;
    }
}

class Employee extends Person implements Average {
    int no_salaries;
    int[] salary = new int[12];

    public Employee(String name, int n) {
        super(name);
        this.no_salaries = n;

        Random rand = new Random();
        for (int i = 0; i < 12; i++) {
            this.salary[i] = rand.nextInt(30001);
        }
    }

    @Override
    public float average() {
        if (no_salaries == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < no_salaries; i++) {
            sum += salary[i];
        }
        return (float) sum / no_salaries;
    }
}

class Student extends Person implements Average, Scholarship {
    int no_grades;
    Employee parent1;
    Employee parent2;
    int[] grade = new int[6];

    public Student(String name, int n, Employee r1, Employee r2) {
        super(name);
        this.no_grades = 6;
        this.parent1 = r1;
        this.parent2 = r2;

        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            this.grade[i] = rand.nextInt(6) + 5;
        }
    }

    @Override
    public float average() {
        int sum = 0;
        for (int i = 0; i < no_grades; i++) {
            sum += grade[i];
        }
        return (float) sum / no_grades;
    }

    @Override
    public float rate() {
        float gpa = average();
        float parentAverage = (parent1.average() + parent2.average()) / 2.0f;

        return gpa * 6 + (60000 - parentAverage) * 4;
    }
}
public class exerciseee2 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        employees[0] = new Employee("Emp1", 5);
        employees[1] = new Employee("Emp2", 3);
        employees[2] = new Employee("Emp3", 0);
        employees[3] = new Employee("Emp4", 8);
        employees[4] = new Employee("Emp5", 0);
        employees[5] = new Employee("Emp6", 6);

        Student[] students = new Student[3];
        students[0] = new Student("Student1", 6, employees[0], employees[1]);
        students[1] = new Student("Student2", 6, employees[2], employees[3]);
        students[2] = new Student("Student3", 6, employees[4], employees[5]);

        for (Student student : students) {
            System.out.println("Name: " + student.p_name);
            System.out.println("GPA: " + student.average());
            System.out.println("First Parent: " + student.parent1.p_name + " - Average Salary: " + student.parent1.average());
            System.out.println("Second Parent: " + student.parent2.p_name + " - Average Salary: " + student.parent2.average());
            System.out.println("Scholarship Points: " + student.rate());
            System.out.println();
        }

        Student scholarshipRecipient = findScholarshipRecipient(students);
        System.out.println("The student receiving the scholarship is: " + scholarshipRecipient.p_name);
    }

    private static Student findScholarshipRecipient(Student[] students) {
        Student highestPointsStudent = students[0];
        for (Student student : students) {
            if (student.rate() > highestPointsStudent.rate()) {
                highestPointsStudent = student;
            }
        }
        return highestPointsStudent;
    }
}
