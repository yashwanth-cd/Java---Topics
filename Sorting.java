import java.util.*;

public class Sorting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array length");
    int size = sc.nextInt();
    int arr[] = new int[size];
    for (int i = 0; i < size; i++) {
      System.out.println("Enter the " + (i + 1) + " in the array");
      arr[i] = sc.nextInt();
    }
    insertion(arr);
    sc.close();
  }

  // BUBBLE SORT - TIME COMPLEXITY = O(n^2)
  public static void bubble() {
    int arr[] = { 7, 8, 3, 1, 2 };
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  // SELECTION SORT - O(n^2)
  public static void selection() {
    int arr[] = { 7, 8, 3, 1, 2 };
    for (int i = 0; i < arr.length - 1; i++) {
      int small = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[small] > arr[j]) {
          small = j;
        }
      }
      int temp = arr[small];
      arr[small] = arr[i];
      arr[i] = temp;
    }

    // Displaying the array
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  // YOU DID THIS - DON'T FORGET IT
  // INSERTION SORT - O(n^2)
  public static void insertion(int nums[]) {

    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (nums[j] < nums[j - 1]) {
          int temp = nums[j - 1];
          nums[j - 1] = nums[j];
          nums[j] = temp;
        } else {
          break;
        }
      }
    }

    // Displaying the array
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }

}
