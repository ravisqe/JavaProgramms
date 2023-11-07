package org.example;

public class Palindrome {

	public static void main(String[] args) {
String name = "NAN";
int leng = name.length();
String reverse = "" ;

  for(int i = leng-1;i>=0;i--)
  {
	  reverse  = reverse +name.charAt(i);
  }
  if(name.equals(reverse))
  {
      System.out.println("String is palindrome");
  }
  else {
      System.out.println("String is not palindrome");
  }
	}

}
