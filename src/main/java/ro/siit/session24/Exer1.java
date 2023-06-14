package ro.siit.session24;

import java.util.ArrayList;
import java.util.List;

public class Exer1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Ana");
        words.add("cuc");
        words.add("radar");
        words.add("bob");
        words.add("eugen");

        words.stream()
                .filter(word -> word.equalsIgnoreCase(reverse(word)))
                .forEach(System.out::println);
    }

    static String reverse(String str){
        String nstr="";
        char ch;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        return nstr;
    }
}
