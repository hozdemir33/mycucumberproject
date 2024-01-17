import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

import static java.io.ObjectInputFilter.merge;

public class mergeStringsAlternately {

    /*
   You are given two strings word1 and word2. Merge the strings by adding
   letters in alternating order, starting with word1. If a string is longer than the other,
    append the additional
   letters onto the end of the merged string.

    Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r


Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s


     */


    public static void main(String[] args) {

//        System.out.println("str1");
//        Scanner sc = new Scanner(System.in);
//        String stringFirstStr1 = sc.nextLine();
//
//        System.out.println("str2");
//        Scanner sc1 = new Scanner(System.in);
//        String stringSecondStr2 = sc.nextLine();
//
//
//        StringBuilder str1=new StringBuilder();
//
//



        String str1="abc";
        String str2="klm";


    StringBuilder sc=new StringBuilder();
                 sc.append(str1).append(str2);
             String CombinedStrings1and2=  sc.toString();
        System.out.println(CombinedStrings1and2);





    }
}


