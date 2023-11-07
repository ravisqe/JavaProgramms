package org.example;

public class AdditionTwoString {
    public static void main (String args[])
    {String s1="Ravi";
        String s2="Ravi";
        String s3=new String("Ravi");
        String s4="Saurav";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

        System.out.println(s1==s3);//false


    }
}
