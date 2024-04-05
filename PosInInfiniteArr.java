public class PosInInfiniteArr {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 34, 45, 76, 87, 88, 89, 90, 95, 100 };
    int target = 7;

    int result = find(nums, target);
    System.out.println(result);
  }

  public static int find(int nums[], int target) {
    int start = 0;
    int end = 1;
    while (start <= end) {
      if (target <= nums[end]) {
        int middle = start + (end - start) / 2;
        if (target < nums[middle]) {
          end = middle - 1;
        } else if (target > nums[middle]) {
          start = middle + 1;
        } else {
          return middle;
        }
      } else {
        end = end + (end - start + 1) * 2;
        start = end + 1;
      }
    }
    return -1;
  }
}