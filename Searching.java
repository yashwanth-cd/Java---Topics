
public class Searching {
  public static void main(String[] args) {
    // int nums[] = { 0, 1, 2, 3, 5 };
    // int target = 5;
    char chars[] = { 'd', 'e', 'g' };
    char target = 'e';
    System.out.println(letterCeil(chars, target));
  }

  // LINEAR SEARCH
  public static int linearSearch(int arr[], int target) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  // For-each loop ( Enhances for loop )
  public static int linearSearch1(int arr[], int target) {
    if (arr.length == 0) {
      return -1;
    }
    for (int element : arr) {
      if (element == target) {
        return element;
      }
    }
    return Integer.MAX_VALUE;
  }

  public static boolean searchInString(String str, char target) {
    if (str.length() == 0) {
      return false;
    }
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        return true;
      }
    }
    return false;
  }

  public static int ceiling(int nums[], int target) {
    int start = 0;
    int end = nums.length - 1;
    if (target > nums[nums.length - 1]) {
      return -1;
    }
    while (start <= end) {
      int middle = (start + end) / 2;
      if (target < nums[middle]) {
        end = middle - 1;
      } else if (target > nums[middle]) {
        start = middle + 1;
      } else {
        return middle;
      }
    }
    return start;
  }

  public static int floor(int nums[], int target) {
    int start = 0;
    int end = nums.length - 1;
    // if (target < nums[0]) {
    // return -1;
    // }
    while (start <= end) {
      int middle = (start + end) / 2;
      if (target < nums[middle]) {
        end = middle - 1;
      } else if (target > nums[middle]) {
        start = middle + 1;
      } else {
        return middle;
      }
    }
    return end;
  }

  public static char letterCeil(char chars[], char target) {
    int start = 0;
    int end = chars.length - 1;
    while (start <= end) {
      int middle = start + (end - start) / 2;
      if (target < chars[middle]) {
        end = middle - 1;
      } else {
        start = middle + 1;
      }
    }
    return chars[start % chars.length];
  }
}
