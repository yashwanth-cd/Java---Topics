import java.util.*;

class questions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    if (num1 == num2) {
      System.out.println(num1 + " is Equal than " + num2);
    } else if (num1 > num2) {
      System.out.println(num1 + " is Greater than " + num2);
    } else
      System.out.println(num1 + " is less than " + num2);
    sc.close();
  }
}

class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.nextLine();
    String c = sc.nextLine();
    switch (c) {
      case "+":
        System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
        break;
      case "-":
        System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
        break;
      case "/":
        System.out.println("Division of " + a + " and " + b + " is " + (a / b));
        break;
      case "*":
        System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
        break;
      case "%":
        System.out.println("Modulus of " + a + " and " + b + " is " + (a % b));
        break;

      default:
        System.out.println("Entered operator is not Valid");
        break;
    }
    sc.close();
  }
}

class months {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    switch (num) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
      case 4:
        System.out.println("April");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("June");
        break;
      case 7:
        System.out.println("July");
        break;
      case 8:
        System.out.println("August");
        break;
      case 9:
        System.out.println("September");
        break;
      case 10:
        System.out.println("October");
        break;
      case 11:
        System.out.println("November");
        break;
      case 12:
        System.out.println("December");
        break;

      default:
        System.out.println("Invalid value. There are only 12 months");
        break;
    }
    sc.close();
  }
}

class loops {
  public static void main(String[] args) {
    String[] names = { "yashwanth", "sai", "chuppala" };
    // For-Loop for Arrays
    for (String name : names) {
      System.out.println(name);
    }
    // General For-Loop
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
    // General While-Loop
    int i = 0;
    // while (i < names.length) {
    // System.out.println(names[i]);
    // i++;
    // }
    // General Do-While Loop
    do {
      System.out.println(names[i]);
      i++;
    } while (i < names.length);
  }
}

class patternsSolidRect {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    // OUTER LOOP
    for (int j = 0; j < n; j++) {
      // INNER LOOP
      for (int i = 0; i < m; i++) {
        System.out.print(" * ");
      }
      System.out.print("\n");
    }
    sc.close();
  }
}

class patternsHollowRect {
  public static void main(String[] args) {
    int n = 4;
    int m = 5;
    for (int j = 1; j <= m; j++) {
      for (int i = 1; i <= n; i++) {
        // cell => (i, j)
        if (i == 1 || j == 1 || i == n || j == m) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

class patternHalfPyramid {
  public static void main(String[] args) {
    int n = 4;
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}

class patternRevHalfPyramid {
  public static void main(String[] args) {
    int n = 4;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 0; j <= n - i; j++) {
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}

class HaldPyramid180 {
  public static void main(String[] args) {
    int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}

class NumPyramid {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
