package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
	//Вычисление Треугольника
        Triangle triangle = new Triangle(3,4,6);
        System.out.println(triangle.getPerimetr());
        System.out.println(triangle.getArea());
        System.out.println();
        System.out.println(triangle.toString());
        Triangle triangle2 = new Triangle(3,4,Math.PI/2);
        System.out.println(triangle2.toString());
        System.out.println("-----------------------------");
        /*Student studentIvan = new Student("Ivan","Ivanich","Ivanov",
                true,3,"Enjeneric");
        System.out.println(studentIvan.toString());*/
        System.out.println("-------------------------------");
        Student studentOleg = new Student("Oleg","Sergeevich","Seroijko",
                true,2,"Desing", LocalDate.of(2005, Month.FEBRUARY,2));
        System.out.println(studentOleg.toString());
        LocalDate may1st = LocalDate.of(2020,Month.MAY,1);
        System.out.println(may1st.getDayOfWeek());
        System.out.println(may1st.getDayOfYear());
        LocalDate newYear = LocalDate.of(2020,Month.JANUARY,1);
        LocalDate developerDay = newYear.plusDays(255);
        System.out.println(developerDay.getDayOfWeek());

        System.out.println(LocalDate.now());

        System.out.println("Осталось " + ChronoUnit.DAYS.between(LocalDate.now(), developerDay));
        LocalDate myBirsthday = LocalDate.of(1996,Month.JUNE,6);
        long myYears = ChronoUnit.YEARS.between(myBirsthday,LocalDate.now());
        System.out.println(myYears);

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        LocalDateTime time2 = LocalDateTime.of(2020,Month.FEBRUARY,1,12,
                56,45,224561258);
        System.out.println(time2);


    }
}
