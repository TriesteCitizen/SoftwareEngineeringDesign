package ExerciseSheet1;

import java.util.HashSet;

public class CollatzConjecture {
	public static void main(String[] args) {
        int n = 27; // Change this to test different numbers
        collatzSequence(n);
    }

    public static void collatzSequence(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        HashSet<Integer> visited = new HashSet<>();        
        System.out.print("Collatz sequence for " + n + ": ");
        
        while (n != 1 && !visited.contains(n)) {
            System.out.print(n + " -> ");
            visited.add(n); //Store visited numbers
            
            if (n % 2 == 0) {
                n /= 2; // If even, divide by 2
            } else {
                n = 3 * n + 1; // If odd, multiply by 3 and add 1
            }
        }
        System.out.println(n); // Print final 1
    }

}
