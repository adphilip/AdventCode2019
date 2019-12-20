package day0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorLambda {

   public static void main(String[] args) {
        
//    Comparator<String> comparatorOne = new Comparator<String>() {
//         @Override
//             public int compare(String s1, String s2){
//                 return Integer.compare(s1.length(), s2.length());
//             }
//     };

    List <String> arrayString = Arrays.asList("a", "aaa", "aa", "aaaaaaa");

    Collections.sort(arrayString, (s1, s2) ->  Integer.compare(s1.length(), s2.length()));

    for (String stringOne : arrayString) {
        System.out.println("StringList :" + stringOne);
    }

   
    System.out.println("x");
    }
}