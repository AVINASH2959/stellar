import java.util.*;

public class ary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();
    
    int[] arr = new int[size];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int sum = 0;
    System.out.println("Array elements and running sum:");
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      System.out.println("Element: " + arr[i] + ", Running Sum: " + sum);
    }

    System.out.println("Total Sum: " + sum);

    sc.close(); 
  }
}
