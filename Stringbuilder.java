
public class Stringbuilder {
  public static void main(String[] args) {
    // Creating a STRING BUILDER
    StringBuilder sb = new StringBuilder("Hello");
    System.out.println(sb);

    /*
     * // Retrieving chaarcters from the string builder
     * for (int i = 0; i < sb.length(); i++) {
     * System.out.println(sb.charAt(i));
     * }
     * 
     * // Set char in the string builder index 0
     * // Changes 0 index value to 'W'
     * sb.setCharAt(0, 'W');
     * System.out.println(sb);
     * 
     * // Insert char in the string builder
     * sb.insert(0, 'C');
     * System.out.println(sb);
     * // Insert string in the string builder
     * sb.insert(0, "Yashwanth");
     * System.out.println(sb);
     * sb.insert(1, 'a');
     * System.out.println(sb);
     * 
     * // Dlete char in string builder
     * sb.delete(1, 2);
     * System.out.println(sb);
     * 
     * // APPEND METHOD in String builder
     * sb.append(" Yashwanth");
     * sb.append(" Sai ");
     * sb.append("." + 'C');
     * System.out.println(sb);
     * 
     */
    // hello
    for (int i = 0; i < sb.length() / 2; i++) {
      // Getting the start and end indexes
      int front = i;
      int back = sb.length() - 1 - i;

      // Getting the values of start and end indexes
      char firstVal = sb.charAt(front);
      char baclVal = sb.charAt(back);

      // inversing the values if start index with end indec & vice-versa
      sb.setCharAt(front, baclVal);
      sb.setCharAt(back, firstVal);
      System.out.println(sb);
    }
  }
}