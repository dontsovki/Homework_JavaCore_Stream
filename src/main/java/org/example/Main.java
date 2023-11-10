package org.example;

import org.example.Packege.Students;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Students> student = new ArrayList<>();
        student.add(new Students("Иван", Arrays.asList(5, 5, 4), "Информатика"));
        student.add(new Students("Анатолий", Arrays.asList(3, 3, 4), "Химия"));
        student.add(new Students("Кирилл", Arrays.asList(2, 5, 4), "Матиматика"));
        student.add(new Students("Мифодий", Arrays.asList(3, 6, 4), "Информатика"));
        student.add(new Students("Артем", Arrays.asList(5, 3, 4), "Русский яз."));

        List<Students> finalStudent = student;
        student =student.stream()
                .filter(students -> "Информатика".equals(students.getSpecialty()))
                .limit(5)
                .sorted(students -> Double.compare(students.getAverageGrade())
                .collect(Collectors.toList());

                for (Students students: student){
                    System.out.println(students.getName() + ":" + students.getAverageGrade());
                }




    }
}