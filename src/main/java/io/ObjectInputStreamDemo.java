package main.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Darush on 1/26/2018.
 */
public class ObjectInputStreamDemo {

    public static void main(String[] args) {

        try {
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("files/object.txt"));
            Student student = (Student) objectInput.readObject();
            System.out.println("Student id: " + student.id);
            System.out.println("Student name: " + student.name);
            System.out.println("Student name: " + student.age);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
