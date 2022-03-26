package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var data = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);

        var number = 0 ;
        Student student;
        System.out.println("Input number: ");
        number = sc.nextInt();

        // Sap xep thong tin sinh vien theo diem so

        // Quan ly Lop SV
        // Nha truong can 1 phan mem de quan ly tat ca cac lop va hoc sinh cua lop do
        // Y/C: Login , phai nhap username/password , neu dung thi moi duoc su dung he thong
        // Dang nhap thanh cong => Menu , chon 1->10

        // 1. Khi dang nhap vao co the xem duoc  thong tin hoc sinh cua 1 lop
        // 2. Tim kiem thong tin hoc sinh dua vao ten, mshs
        // 3. Them hoc sinh cho 1 lop
        // 4. Sap xep thu tu hoc  sinh cho 1 lop
        // 5. Exit

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

        // ASC
        System.out.println("ASC LIST");
        sortStudentByDHT(true, data);
        System.out.println("DESC LIST");
        sortStudentByDHT(false, data);
//        boolean check = true;
//        while (check) {
//            System.out.println("Enter Name: ");
//            name = sc.next();
//            findStudentByName(name, data);
//            System.out.println("Do you want continue?(Yes/No)");
//            name = sc.next();
//            switch (name) {
//                case "Yes":
//                    break;
//                case "No":
//                    check = false;
//                    break;
//                default: break;
//            }
//        }
//
    }

    // Tim thong tin sinh vien theo ten
    // Input : Ten Sinh Vien
    // Output: Thong tin sinh vien neu co
    // DKC: THONGTINDANHSACH SINH VIEN

    public static void findStudentByName (String studentName, List<Student> data) {
//        var listFilter = data.stream()
//                .filter(student -> student.getName().equals(studentName))
//                .collect(Collectors.toList());
        if (!Objects.isNull(data)) {
            boolean check = false;
            for (Student stu : data) {
                if (stu.getName().equalsIgnoreCase(studentName)) {
                    System.out.println(stu);
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("Not Found Student");
            }
        } else {
            System.out.println("Empty List");
        }
    }

    // Sap xep sinh vien theo DHT , sap xep tang hoac giam
    // INPUT: Tang hoac giam => Flag
    // OUTPUT: IN ra danh sach thong tin sau khi duoc sap xep
    // DKC: THONGTINDANHSACH SINH VIEN
    public static void sortStudentByDHT (boolean flag, List<Student> data) {
        List<Student> sortedList = data;
        if (!Objects.isNull(data)) {
            // Asc
            if (flag) {
                sortedList.sort((Student s1, Student s2)-> (int) (s1.getDht()- s2.getDht()));
            } else {
                // Descending
                sortedList.sort((Student s1, Student s2)-> (int) (s2.getDht()- s1.getDht()));
            }
            sortedList.stream().forEach(student -> System.out.println(student));
        } else {
            System.out.println("Empty List");
        }
    }
}
