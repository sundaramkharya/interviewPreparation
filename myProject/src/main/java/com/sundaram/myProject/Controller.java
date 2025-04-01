package com.sundaram.myProject;

import java.util.Scanner;

public class Controller {
    public String hello(@RequestParam String hello) {
        return hello+"world";
    }
}
