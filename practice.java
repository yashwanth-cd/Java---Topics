
// 1. Add the two numbers and print the result.
// 2. Find the maximum of the two numbers and print the result.
// 3. Check if the first number is even and print the result.
// 4. Check if the second number is even and print the result.
// 5. Enter 3 numbers from the user & make a function to print their average.
// 6. Write a function to print the sum of all odd numbers from 1 to n.
// 7. Write a function which takes in 2 numbers and returns the greater of those two.
// 8. Write a function that takes in the radius as input and returns the circumference of a circle.
// 9. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
// 10. Write an infinite loop using do while condition.
// 11. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
// 12. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
// 13. Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 ..... 
// 14. Write a program to find if a number is a power of 2 or not.
// 15. Write a program to toggle a bit a position = “pos” in a number “n”.
// 16. Write a program to count the number of 1’s in a binary representation of the number.
// 17. Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.

import java.util.*;

class Main {
  public static void main(String[] args) {
    // CALL METHODS AS PER REQUIREMENT
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();
    // int num = sc.nextInt();
    binaryToDecimal(a);
    sc.close();
  }

  // Question 1
  static void Sum() {
    Scanner sc = new Scanner(System.in);
    System.out.println(sc.nextInt() + sc.nextInt());
    sc.close();
  }

  // Question 2
  static void Max() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a > b) {
      System.out.println("Maximum Value is " + a);
    } else {
      System.out.println("Maximum Value is " + b);
    }
    sc.close();
  }

  // Question 3
  static void FirstEven() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    // int b = sc.nextInt();
    if (a % 2 == 0)
      System.out.println(a + " number is Even");
    sc.close();
  }

  // Question 4
  static void SecondEven() {
    Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    int b = sc.nextInt();
    if (b % 2 == 0)
      System.out.println(b + " number is Even");
    sc.close();
  }

  // Question 5
  public static int calculateAvg(int a, int b, int c) {
    int average = (a + b + c) / 3;
    return average;
  }

  // Question 6
  public static int calcOddSumToN(int a) {
    int finalSum = 0;
    for (int i = 0; i <= a; i++) {
      if ((i % 2) != 0)
        finalSum = finalSum + i;
    }
    return finalSum;
  }

  // Question 7
  public static int greatestNum(int a, int b) {
    int result = a > b ? a : b;
    return result;
  }

  // Question 8
  public static double calcCircumference(int a) {
    double result = 2 * 3.141 * a;
    return result;
  }

  // Question 9
  public static String calcVoteEligibility(int a) {
    String result = a > 18 ? "Eligible" : "Not Eligible";
    return result;
  }

  // Question 10 DON'T EXECUTE -> INFINITE LOOP
  public static void infiniteWhile() {
    int a = 10;
    while (a == 10) {
      System.out.println("BOOM");
    }
  }

  // Question 11
  public static void results(int a) {
    Scanner sc = new Scanner(System.in);
    int positive = 0;
    int negative = 0;
    int zeroes = 0;
    for (int i = 0; i < a; i++) {
      int z = sc.nextInt();
      if (z == 0) {
        zeroes++;
      } else if ((z % 2) == 0) {
        positive++;
      } else if ((z % 2) != 0) {
        negative++;
      } else {
        System.out.println("Invalid");
      }
    }
    System.out.println("Positive values are: " + positive);
    System.out.println("Negative values are: " + negative);
    System.out.println("zeroes values are: " + zeroes);
    sc.close();
  }

  // Question 12
  public static double calcPower(int a, int b) {
    double result = Math.pow(a, b);
    return result;
  }

  // Question 13
  public static void calcFibonacci(int a) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(0);
    arrayList.add(1);
    for (int i = 2; i < a; i++) {
      int previousSum = arrayList.get(i - 1) + arrayList.get(i - 2);
      if (previousSum <= a) {
        arrayList.add(previousSum);
      } else {
        break;
      }
    }
    System.out.println("The fibonacci series is : " + arrayList);
  }

  // Question 14
  public static void powerOf2() {
    int num = 16;
    // System.out.println(num & (num - 1));
    boolean val = (num & (num - 1)) == 0;
    if (val) {
      System.out.println("Num is a square of 2.");
    } else {
      System.out.println("Num is not a square of 2.");
    }
  }

  // Question 15
  public static void toggleBit() {
    int n = 5; // 0101
    int position = 1;
    int bitMask = 1 << position; // 0010
    int result = bitMask ^ n; // 0111
    System.out.println(result); // 7
  }

  // Question 16
  public static void countBits() {
    int n = 7;
    int count = 0;
    for (int i = 0; i < n; i++) {
      n = n & (n - 1);
      count++;
    }
    System.out.println("The total 1's are : " + count);
  }

  // Question 17
  public static void binaryToDecimal(int a) {
    int n[] = new int[100];
    int count = 0;
    while (a > 0) {
      n[count] = a % 2;
      a = a / 2;
      count++;
    }

    // Retrieving the Array data
    for (int i = count - 1; i >= 0; i--) {
      System.out.print(n[i]);
    }
  }
}
