package com.sundaram.myProject.codes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Age {
    public static void main(String[] args) {
        LocalDate birthDate=LocalDate.of(1999,9,17);
        LocalDate today=LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(birthDate,today));
    }
}
