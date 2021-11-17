package com.company;

public class Main {

    public static void main(String[] args) {
        Student student= new Student.StudentBuilder("1","Khang","21","DHKTPM14","Nam")
                .setAndress("Tien Giang")
                .setFartherName("Tuan")
                .setMotherName("Khuyen")
                .setNationnality("VN")
                .setReligion("None").build();
        System.out.println(student.toString());
    }
}
