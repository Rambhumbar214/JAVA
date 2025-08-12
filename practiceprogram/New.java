package practiceprogram;
import java.util.*;

class CricketPlayer {
    String name;
    int noOfInnings;
    int noOfTimesNotOut;
    int totalRuns;
    double batAvg;

    // Constructor
    public CricketPlayer(String name, int noOfInnings, int noOfTimesNotOut, int totalRuns) {
        this.name = name;
        this.noOfInnings = noOfInnings;
        this.noOfTimesNotOut = noOfTimesNotOut;
        this.totalRuns = totalRuns;
        this.batAvg = 0.0;
    }

    // Static method to calculate batting average
    public static void calculateAverage(CricketPlayer player) {
        try {
            int dismissals = player.noOfInnings - player.noOfTimesNotOut;
            if (dismissals <= 0) {
                throw new ArithmeticException("Dismissals must be greater than zero.");
            }
            player.batAvg = (double) player.totalRuns / dismissals;
        } catch (ArithmeticException e) {
            System.out.println("Error calculating average for " + player.name + ": " + e.getMessage());
            player.batAvg = 0.0;
        }
    }

    // Static method to sort players by batting average
    public static void sortPlayers(CricketPlayer[] players) {
        Arrays.sort(players, (p1, p2) -> Double.compare(p2.batAvg, p1.batAvg));
    }

    // Method to display player details
    public void display() {
        System.out.printf("Name: %s, Innings: %d, Not Outs: %d, Runs: %d, Batting Average: %.2f%n",
                name, noOfInnings, noOfTimesNotOut, totalRuns, batAvg);
    }
}

public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Player " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Number of Innings: ");
            int innings = sc.nextInt();
            System.out.print("Number of Times Not Out: ");
            int notOuts = sc.nextInt();
            System.out.print("Total Runs: ");
            int runs = sc.nextInt();
            sc.nextLine(); // Consume newline

            players[i] = new CricketPlayer(name, innings, notOuts, runs);
            CricketPlayer.calculateAverage(players[i]);
        }

        CricketPlayer.sortPlayers(players);

        System.out.println("\n🏆 Players sorted by Batting Average:");
        for (CricketPlayer player : players) {
            player.display();
        }

        sc.close();
    }
}