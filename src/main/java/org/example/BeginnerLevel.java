package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BeginnerLevel {
    public static void main(String[] args) {
        //     beginner level
//        1.Write a program that takes a list of integers and returns the sum of all the even numbers in the list.
//        2. Write a program that takes a list of strings and returns the count of strings that have length greater than 5.
//        3.Write a program that takes a list of strings and returns a new list that contains only the strings that start
//        with the letter "A".
//        4.Write a program that takes a list of integers and returns a new list with each number squared.
//        5.Write a program that takes a list of integers and returns the maximum number in the list.
//        6.Write a program that takes a list of strings and returns the concatenation of all the strings in the list.
//        7. Write a program that takes a list of integers and returns the average of all the numbers in the list.
//        8.Write a program that takes a list of strings and returns a new list with all the strings converted to uppercase.
//        9. Write a program that takes a list of integers and returns a new list with only the unique numbers in the list.
//       10.Write a program that takes a list of strings and returns a new list with all the strings sorted in alphabetical order.

        List<Integer> listInt = Arrays.asList(1, 2, 3, 4,4, 5, 6, 7, 8, 9, 10,3,2);
        //1
        Integer sumNumber = listInt.stream().filter(i -> i % 2 == 0).mapToInt(Integer::valueOf).sum();
        System.out.println(sumNumber);
        //2
        List<String> listString = Arrays.asList("said","samira","lina","anir");
        System.out.println(listString.stream().filter(s-> s.length()>=5).count());
        //3
        List<String> lsitStartWithA = listString.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
        System.out.println(lsitStartWithA);
        //4
        System.out.println(listInt.stream().parallel().map(i -> i*i).collect(Collectors.toList()));
        //5
        Optional<Integer> maxNumber = listInt.stream().max((i, i2) -> i.compareTo(i2));
        System.out.println(maxNumber);
        //6
        String concatString = listString.stream().reduce("",(s, s2)-> s+s2);
        System.out.println(concatString);
        //7 average
        System.out.println(listInt.stream().mapToDouble(Integer::doubleValue).average());
        //8
        List <String> mylist = Arrays.asList("momo", "fofo", "coco", "zozo");
        List <String> listStringToUpper = mylist.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(listStringToUpper);
        //9 list of distinct
        listInt.stream().distinct().forEach(System.out::println);
        //10 sorted list
        List<String> sortedList = mylist.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        // list sorted in the reverse of normal natural order
        List<String> d = mylist.stream().sorted((i,i2) -> i2.compareTo(i)).collect(Collectors.toList());
        System.out.println(d);









    }
}