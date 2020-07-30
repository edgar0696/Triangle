package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Student {
    private String name;
    private String patronymic;
    private String lastName;
    private boolean gender;
    private int coursl;
    private String cafedrial;
    private LocalDate birsthday;


    public Student() {
    }

    public Student(String name, String patronymic, String lastName, boolean gender, int coursl, String cafedrial) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.gender = gender;
        this.coursl = coursl;
        this.cafedrial = cafedrial;
    }

    public Student(String name, String patronymic, String lastName, boolean gender, int coursl, String cafedrial, LocalDate birsthday) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.gender = gender;
        this.coursl = coursl;
        this.cafedrial = cafedrial;
        this.birsthday = birsthday;
    }

    public LocalDate getBirsthday() {
        return birsthday;
    }

    public void setBirsthday(LocalDate birsthday) {
        this.birsthday = birsthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getCoursl() {
        return coursl;
    }

    public void setCoursl(int coursl) {
        this.coursl = coursl;
    }

    public String getCafedrial() {
        return cafedrial;
    }

    public void setCafedrial(String cafedrial) {
        this.cafedrial = cafedrial;
    }

    public boolean isAdult(){
        long hisYears = ChronoUnit.YEARS.between(this.getBirsthday(),LocalDate.now());
        System.out.println("His years " + hisYears + " ");
        if (hisYears >= 18){
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        String buffer = "";
        if (gender==true){
            buffer = "Male";
        }else {
            buffer = "Female";
        }
        String buffer2 = "";
        if (this.isAdult()==true){
            buffer2 = " Взрослый";
        }else {
            buffer2 = " Малолетка";
        }

        return "Student{" +
                "name=" + name +
                ", patronymic=" + patronymic +
                ", lastName=" + lastName +
                ", gender=" + buffer +
                ", coursl=" + coursl +
                ", cafedrial=" + cafedrial +
                ", birsthday=" + birsthday +
                ", " + buffer2 +
                '}';
    }

}

