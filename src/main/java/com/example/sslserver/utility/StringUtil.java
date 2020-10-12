package com.example.sslserver.utility;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUtil {


    public static void main(String[] args) {
//        reverseString("abcdef");

        boolean ret = isAnagram("abc", "bac");
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    public static boolean isAnagram(String s1, String s2){

        // Complete the function
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {

            String arr1 = s1.toLowerCase().chars()
                    .sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint,        StringBuilder::append)
                    .toString();
            String arr2 = s2.toLowerCase().chars()
                    .sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint,        StringBuilder::append)
                    .toString();
            arr2 = Stream.of(s2.split("")).sorted().collect(Collectors.joining());
            status = arr1.equals(arr2);
            /*for(int i = 0; i < arr1.length(); i++ ){
                if(arr1.charAt(i) != arr2.charAt(i)){
                    status = false;
                    break;
                }
            }*/

        }
        return status;
    }


    public static String reverseString(String str) {
        if (str.isEmpty() || str == null) {
            return str;
        }
        str.toCharArray();
        reverseStringStack(str);
        char[] s = str.toCharArray();

        char string[] = new char[100]; // declaration of character variables
        int i = 0, j = str.length() - 1; // declaration of integer variable

        for(i= 0; i < j; i++) // for reversing string
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
//            i++;
            j--;
//            System.out.println(s[j]);
        }
        System.out.println("\nThe Reversed string is:: "+ s.toString() ); // Output


        int length = str.length();
        StringBuilder builder = new StringBuilder();
        builder.reverse();

        for (int k = length - 1; k >= 0; k--) {
            builder.append(str.charAt(i));
        }
        
//        System.out.println(builder);
//        return builder.toString();
        return s.toString();

    }

    public static void reverseStringStack(String s){

        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int l = 0; l < s.length(); l++){
            stack.push(c[l]);
        }

        int k = 0;

        while (!stack.isEmpty()){
            c[k++] =stack.pop();
        }

        System.out.println(String.copyValueOf(c));

    }
}
