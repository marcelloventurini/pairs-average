package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the amount: ");
    int n = scanner.nextInt();
    int[] vect = new int[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Enter a number: ");
      vect[i] = scanner.nextInt();
    }

    int pairs = 0;
    int c = 0;
    for (int i = 0; i < vect.length; i++) {
      if (vect[i] % 2 == 0) {
        pairs += vect[i];
        c++;
      }
    }

    if (pairs > 0 ) {
      double avg = pairs / c;
      System.out.print("Average: " + avg);
    } else {
      System.out.print("No pair was found.");
    }

    scanner.close();
  }
}
