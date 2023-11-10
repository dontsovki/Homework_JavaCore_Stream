package org.example.Packege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Students {
    public Students(String name, List grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public Students() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    private String name;
    private List grades;
    private String specialty;

    public double getAverageGrade() {
        return grades.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
    }

}
