import java.io.*;
import java.util.*;

public class Solution
{
    public static boolean canWin(int leap, int[] game)
    {
        return isWinning(leap, game, 0);
    }

    private static boolean isWinning(int leap, int[] game, int index)
    {
        // Check if the current position is out of bounds (winning condition)
        if (index >= game.length) return true;
        // Check for invalid moves
        if (index < 0 || game[index] == 1) return false;
        // Mark the current index as visited
        game[index] = 1;
        // Recursively check all possible moves: forward by 1, leap, and backward by 1
        return isWinning(leap, game, index + leap)
                || isWinning(leap, game, index + 1)
                || isWinning(leap, game, index - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of queries
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            // For each query, read the size of the array (n) and the leap
            int n = scanner.nextInt();
            int leap = scanner.nextInt();

            // Initialize the game array
            int[] game = new int[n];

            // Read the game array elements
            for (int j = 0; j < n; j++) {
                game[j] = scanner.nextInt();
            }


            for (i = 0; i < game.length; i++) {
                System.out.println(canWin(leap, game) ? "YES" : "NO");
            }
        }
    }
}


