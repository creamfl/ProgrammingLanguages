package example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Student{
	String name;
	String phoneNum;
	int indexNum;
	transient int recordNum;
	
	Student(){
		
	}
	Student(String name, String phoneNum, int indexNum, int recordNum){
		this.name = name;
		this.phoneNum = phoneNum;
		this.indexNum = indexNum;
		this.recordNum = recordNum;
		
	}
}

class StudentFileStream{
	public void printData(Student student) {
		System.out.println("student name " + student.name);
		System.out.println("student phone number " + student.phoneNum);
		System.out.println("student index number " + student.indexNum );
		System.out.println("student record number " + student.recordNum);
	}
	public void writeToFile(Student student, String filename) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(student);
            System.out.println("Student object has been serialized and written to file: " + filename);
        } catch (IOException ex) {
            System.out.println("IOException is caught while writing to file");
            ex.printStackTrace();
        }
	}
	public Student readFromFile(String filename) {
		Student student = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            student = (Student) ois.readObject();
            System.out.println("Student object has been deserialized from file: " + filename);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Exception is caught while reading from file");
            ex.printStackTrace();
        }
        return student;
    }
	}
	


public class SerialExample {

	class Demo{
		Student obj = new Student();
    public static void printData(Example object1) {
        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("transientInt = " + object1.transientInt);
        System.out.println("staticInt = " + object1.staticInt);
        Student student = new Student("John Doe", "123-456-7890", 12345, 9876);
        String filename = "student.ser";

        // Serialization
        StudentFileStream studentFileStream = new StudentFileStream();
        studentFileStream.writeToFile(student, filename);

        // Deserialization
        Student deserializedStudent = studentFileStream.readFromFile(filename);

        // Print deserialized data
        if (deserializedStudent != null) {
            System.out.println("Deserialized Data:");
            studentFileStream.printData(deserializedStudent);
        }
    }

    public static void main(String[] args) {
        Example object = new Example("Name", 20, 2, 1000);
        String filename = "test.txt";
        
        
        
        // Serialization
        try {

            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                (filename);
            ObjectOutputStream out = new ObjectOutputStream
                (file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized\n"
                + "Data before Deserialization.");
            printData(object);

            // value of static variable changed
            object.staticInt = 2000;
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        // Deserialization
        try {

            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object = (Example) in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                + "Data after Deserialization.");
            printData(object);

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" +
                " is caught");
        }
        
    }
    
}
}
