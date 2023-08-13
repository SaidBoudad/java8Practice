package org.example;

public class CodingGame {
    public static void main(String[] arg) {
        System.out.println(isAnagram("ssaaa","asasa"));

        int[] temperatures = { -5,2, -10, 5, 3, 8, -2 };
        int result = closestToZero(temperatures);
        System.out.println("Closest temperature to zero: " + result);

    }

    // find if the 2 strings are anagram or not
    static boolean isAnagram(String a, String b) {
        a = a.replaceAll("[^a-zA-Z]", "").toLowerCase();
        b = b.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if (a.length() != b.length()) {
            return false;
        }
        int[] charCount = new int[26]; // Assuming only English   letters

        for (char c : a.toCharArray()) {
            charCount[c - 'a']++;
            System.out.println(charCount[c - 'a']);
        }
        Arrays.stream(charCount).asLongStream().forEach(n->System.out.println(n + " "));
        System.out.println();



        for (char c : b.toCharArray()) {
            charCount[c - 'a']--;
        }
        Arrays.stream(charCount).asLongStream().forEach(n->System.out.print(n + " "));


        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    // Find the closest number from an array to the zero
    public static int closestToZero(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int closest = array[0];

        for (int temp : array) {
            if (Math.abs(temp) < Math.abs(closest) || (Math.abs(temp) == Math.abs(closest) && temp > closest)) {
                closest = temp;
            }
        }

        return closest;
    }

}
