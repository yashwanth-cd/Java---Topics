// Write a function that takes in a list of integers and returns the maximum
// difference between any two numbers in the list.
// The difference must be calculated with the larger number minus the smaller
// number.
// If the list contains less than two elements, the function should return 0.

public class test {

  public static void main(String[] args) {
    // int nums[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
    // System.out.println(returnDiff(nums));
    // String word = "Hello";
    // System.out.println(revString(word));
    System.out.println(binarySearch());
  }

  public static int returnDiff(int n[]) {
    if (n.length <= 2) {
      return 0;
    }

    int highest = n[0];
    int smallest = n[0];
    for (int i = 0; i < n.length; i++) {
      if (n[i] > highest) {
        highest = n[i];
      } else if (n[i] < smallest) {
        smallest = n[i];
      }
    }
    return highest - smallest;
  }

  public static String revString(String str) {
    char arr[] = str.toCharArray();
    int last = arr.length - 1;
    for (int i = 0; i < (arr.length / 2); i++) {
      char temp = arr[i];
      arr[i] = arr[last - i];
      arr[last - i] = temp;
      // --last;
    }
    return new String(arr);
  }

  public static String binarySearch() {
    int nums[] = { -23, 1, 2, 3, 4, 5, 6 };
    int target = -23;
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int middle = (start + end) / 2;
      if (nums[middle] == target) {
        System.out.println();
        return "Found at index : " + middle;
      } else if (target < nums[middle]) {
        end = middle - 1;
      } else if (target > nums[middle]) {
        start = middle + 1;
      }
    }
    return "Not Found :(";
  }
}
