package main.java.rmi.example1;

import java.rmi.Naming;

public class MyServer {

    public static void main(String[] args) {

        try {
            Adder stub = new AdderRemote();
            Naming.rebind("rmi://localhost:5000/darush", stub);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
