package org.practice;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String s="awwbew";
       int maxlen=0, left=0, right=0;

       Map<Character, Integer> m1=new LinkedHashMap<>();

       for(int i=0;i<s.length();i++)
       {
           char c=s.charAt(i);
           if(m1.containsKey(s.charAt(i)))
           {
               left=Math.max(i, m1.get(c)+1);
           }

           m1.put(c, i);

           if(i-left+1>maxlen)
           {
               maxlen=i-left+1;
               right=left;
           }
       }

       System.out.println(maxlen);
       System.out.println(s.substring(right, right+maxlen));



    }
}

//        Map<Character, Integer> m1= new LinkedHashMap<>();
//        int maxlen=0;
//        int x=0;
//        for( int i=0;i<s.length();i++)
//        {
//        char c=s.charAt(i);
//            if(m1.containsKey(c))
//        {
//        x=Math.max(x, m1.get(c)+1);
//        }
//        m1.put(c, i);
//        maxlen=Math.max(maxlen, i-x+1);
//        }
//                System.out.println(maxlen);
//
//
//        System.out.println(m1);


