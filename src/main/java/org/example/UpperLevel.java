package org.example;

import java.util.Arrays;
import java.util.List;

public class UpperLevel {
     //1   Write a program that reads in a list of strings and returns a map of the strings,
     //    where the keys are the first character of each string,
     //    and the values are a list of strings that start with that character.

     //2   Write a program that reads in a list of objects, and uses the Stream API to group the objects by a certain property,
     //    and then calculate the average of another property for each group.
     //    For example, if the objects are employees with properties "department" and "salary",
     //    the program could group the employees by department and calculate the average salary for each department.
    public static void main(String[] args) {

        List<String> list3 = Arrays.asList("said","samira","lina","anir");
        list3.stream().map(s-> s);


    }
}
