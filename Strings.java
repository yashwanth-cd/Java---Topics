import java.util.*;

public class Strings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // String firstName = sc.nextLine();
    // String lastName = sc.nextLine();
    // // CONCATENATION
    // System.out.println(firstName + lastName);
    // // System.out.println(firstName.length());
    // for (int i = 0; i < firstName.length(); i++) {
    // System.out.println(firstName.charAt(i));
    // }

    // // COMPARE TWO STRINGS
    // if (firstName.compareTo(lastName) == 0) {
    // System.out.println("Equal");
    // } else if (firstName.compareTo(lastName) > 0) {
    // System.out.println("First name is greater");
    // } else {
    // System.out.println("Second name is greater");
    // }

    // new string in non-primitive manner
    // String str1 = new String("yashwanth");
    // String str2 = new String("yashwanth");
    // if (str1 == str2) { // == fails here. So we use compareTo() method
    // System.out.println("EQUAL");
    // } else {
    // System.out.println("Not EQUAL");
    // }

    // SUBSTRING METHOD IN STRINGS
    // String name = "Yashwanth sai chuppala";
    // // Similar to slicing in JavaScript
    // System.out.println(name.substring(0, 9));

    // STRING TO INTEGER
    // String a = "12345";
    // int nums = Integer.parseInt(a);
    // System.out.println(nums);

    // INTEGER TO STRING
    // int a = 12345;
    // String aString = Integer.toString(a);
    // System.out.println(aString);
    // System.out.println(aString instanceof String);
    // System.out.println(((Object) a).getClass().getSimpleName());

    // STRING FUNCTIONALITY IN HEAP
    // Both a nd b variable have same refernce to the heap location
    // Hence only 1 object is created in heap for both a and b
    String a = "Yash";
    String b = "Yash";
    System.out.println(a + b);
    // Modifying the a value -> creates new object for the a variable
    a = a + "sai";
    System.out.println(a + b);
    sc.close();
  }
}
