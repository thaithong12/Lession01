package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var data = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);

        var number = 0 ;
        Student student;
        System.out.println("Input number: ");
        number = sc.nextInt();

        int id;
        String name;
        Double dht;
        String className;
        for (var i = 0 ; i < number ; i++) {
            id = i;
            System.out.println("Enter name: ");
            name = sc.next();
            System.out.println("Enter dht: ");
            dht = sc.nextDouble();
            System.out.println("Enter className: ");
            className = sc.next();

            student = new Student(id, name,className, dht);
            data.add(student);
        }

        // Print data
        data.stream().forEach(i -> System.out.println(i));
    }
}
