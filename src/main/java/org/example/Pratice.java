package org.example;

public class Pratice {
    public static void main (String args[])
    {
        String s1="Ravi";
        String s2="Ravi";
        String s3=new String("Ravi");
        String s4 = new String("Ravi");
      //  System.out.println(s1==s2);//false (because both refer to same instance)
    //    System.out.println(s1==s2);//true(because s3 refers to instance created in nonpool)

        System.out.println(s3==s3);//true(because s3 refers to instance created in nonpool)

    }
}
